import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Rick on 2017/3/13.
 */
public class Test {
    public static void insertBlocking() throws InterruptedException {
        ArrayBlockingQueue<String> names = new ArrayBlockingQueue<String>(1);
        names.put("a");
        // 从这一句开始后面的就不会被执行了
//        names.add("b");
        boolean c = names.offer("C", 1, TimeUnit.SECONDS);
        System.out.println(c);

        System.out.println("程序执行到此...");
    }

    /**
     * 此方法展示了 ArrayBlockingQueue 的取出阻塞特性 ：如果队列为空，那么取的操作就会被阻塞，程序执行就会报错。
     */
    public static void fetchBlocking() throws InterruptedException {
        ArrayBlockingQueue<String> names = new ArrayBlockingQueue<String>(10);
        names.put("a");
        names.put("a");
        names.put("a");
        names.put("a");
        names.put("a");
        names.put("a");
        names.remove();

        Collection<? super String> list = new ArrayList<>();
        int i = names.drainTo(list);
        System.out.println(i);
//        names.remove();
        String poll = names.poll(1, TimeUnit.SECONDS);
        System.out.println(poll);

        String take = names.take();
        System.out.println(take);
        names.remove();
        names.put("b");

        System.out.println("程序执行到此...");
    }

    static long l = 0L;
    static int it = 0;
    static long ll = 0L;
    static Lock lock = new ReentrantLock();
    static AtomicLong al = new AtomicLong(0);
    static CountDownLatch done = new CountDownLatch(1000);
    static Object o = new Object();
    static List<String> que = new ArrayList<String>(10);

    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                synchronized (que) {
                    while (que.size() == 0) {
                        try {
                            que.wait(10000);
                            System.out.println(Thread.currentThread().getId());
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };

        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (que) {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int nextInt = new Random().nextInt(10);
                    que.add(nextInt + "");
                    System.out.println("add int " + nextInt + " ...");
                    que.notify();
                    System.out.println("Producer Thread " + Thread.currentThread().getId() + " call notifyAll ");
                }
            }
        }).start();
    }

}
