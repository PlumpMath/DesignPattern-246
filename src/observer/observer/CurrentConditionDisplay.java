package observer.observer;

import observer.func.IDisplayData;
import observer.subject.ISubject;

/**
 * Created by Rick on 2017/3/9.
 */
public class CurrentConditionDisplay implements IObserver,IDisplayData {
    private ISubject subject;
    private float humidity;
    private float temp;

    public CurrentConditionDisplay(ISubject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public String toString() {
        return "CurrentConditionDisplay{" +
                "subject=" + subject +
                ", humidity=" + humidity +
                ", temp=" + temp +
                '}';
    }

    @Override
    public void display() {
        System.out.println(this);
    }
}
