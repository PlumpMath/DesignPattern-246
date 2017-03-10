package observer.observer;

import observer.func.IDisplayData;
import observer.subject.ISubject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rick on 2017/3/9.
 */
public class StatisticDisplay implements IObserver, IDisplayData {
    private ISubject subject;
    private float humidity;
    private float temp;
    private float pressure;
    private List<Float> temps = new ArrayList<>();
    private float avg = 0, max = 0, min = 0;

    public StatisticDisplay(ISubject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.temps.add(temp);
        display();
    }

    @Override
    public void display() {
        statistic();
        System.out.printf("Avg/Max/Min temperature is %f / %f / %f \n\r", avg, max, min);
    }

    public void statistic() {
        float total = 0.0F;
        min = max = temps.get(0);
        for (Float temp : temps) {
            total += temp.floatValue();
            max = Math.max(max, temp);
            min = Math.min(min, temp);
        }
        avg = total / temps.size();
    }
}
