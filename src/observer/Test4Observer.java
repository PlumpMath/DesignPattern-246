package observer;

import observer.observer.CurrentConditionDisplay;
import observer.observer.StatisticDisplay;
import observer.subject.WeatherData;

/**
 * Created by Rick on 2017/3/9.
 */
public class Test4Observer {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);
        weatherData.setData(1.0F, 2.00F, 4.34F);
        weatherData.setData(4.0F, 1.00F, 6.32F);
        weatherData.setData(3.0F, 2.00F, 5.36F);

        weatherData.removeObserver(currentConditionDisplay);
        weatherData.setData(3.0F, 2.00F, 5.36F);
        weatherData.removeObserver(statisticDisplay);
        weatherData.setData(3.0F, 2.00F, 5.36F);

        weatherData.registerObserver(statisticDisplay);
        weatherData.setData(3.0F, 2.00F, 5.36F);

    }
}
