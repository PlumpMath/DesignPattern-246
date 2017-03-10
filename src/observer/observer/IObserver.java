package observer.observer;

/**
 * Created by Rick on 2017/3/9.
 */
public interface IObserver {
    void update(float temp, float humidity, float pressure);
}
