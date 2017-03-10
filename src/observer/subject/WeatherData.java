package observer.subject;

import observer.observer.IObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rick on 2017/3/9.
 */
public class WeatherData implements ISubject {
    List<IObserver> observers = new ArrayList<>();
    private float pressure;
    private float humidity;
    private float temp;

    @Override
    public void registerObserver(IObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> {
            observer.update(temp, humidity, pressure);
        });
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
        notifyObservers();
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
        notifyObservers();
    }

    public void setTemp(float temp) {
        this.temp = temp;
        notifyObservers();
    }

    public void setData(float pressure, float humidity, float temp) {
        this.pressure = pressure;
        this.humidity = humidity;
        this.temp = temp;
        System.out.println("subject data changed");
        notifyObservers();
    }
}
