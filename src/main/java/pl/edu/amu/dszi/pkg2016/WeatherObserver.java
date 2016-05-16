package pl.edu.amu.dszi.pkg2016;

import pl.edu.amu.dszi.model.weather.Weather;
import pl.edu.amu.dszi.model.weather.WeatherChanger;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by lupus on 14.05.16.
 */
public class WeatherObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherChanger) {
            if (arg instanceof Weather) {
                Weather w = (Weather) arg;
                System.out.println("SUN: " + w.getSunType());
                System.out.println("RAIN: " + w.getRain());
            }
        }
    }
}