package com.practice.Assignments.lld2.day142behaviouraldp.weather_observer;

import com.practice.Assignments.lld2.day142behaviouraldp.weather_observer.services.HumidityService;
import com.practice.Assignments.lld2.day142behaviouraldp.weather_observer.services.PressureService;
import com.practice.Assignments.lld2.day142behaviouraldp.weather_observer.services.TemperatureService;

public class WeatherMonitoringApplication extends Publisher{

    private double temperature;
    private double humidity;
    private double pressure;
    private double temperatureThreshold;
    private double humidityThreshold;
    private double pressureThreshold;

    // DO NOT MODIFY THIS CONSTRUCTOR
    public WeatherMonitoringApplication(double initialTemperature, double initialHumidity, double initialPressure,
                                        double temperatureThreshold, double humidityThreshold, double pressureThreshold) {
        this.temperature = initialTemperature;
        this.humidity = initialHumidity;
        this.pressure = initialPressure;
        this.temperatureThreshold = temperatureThreshold;
        this.humidityThreshold = humidityThreshold;
        this.pressureThreshold = pressureThreshold;
    }
    // DO NOT MODIFY THIS CONSTRUCTOR

    public void updateWeatherConditions(double newTemperature, double newHumidity, double newPressure) {
        temperature = newTemperature;
        humidity = newHumidity;
        pressure = newPressure;

        if (temperature > temperatureThreshold) {
            notifyObservers(temperature);
            // If the temperature is greater than the temperature threshold, notifies all observers
        }

        if (humidity > humidityThreshold) {
            notifyObservers(humidity);
            // If the humidity is greater than the humidity threshold, notifies all observers
        }

        if (pressure > pressureThreshold) {
            notifyObservers(pressure);
            // If the pressure is greater than the pressure threshold, notifies all observers
        }
    }
}
