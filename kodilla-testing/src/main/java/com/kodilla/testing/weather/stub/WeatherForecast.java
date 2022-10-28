package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;
    private double median;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {
        double temp;
        double sum = 0;
        int size;
        double avg = 0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            temp = temperature.getValue();
            sum = sum + temp;
            size = temperatures.getTemperatures().size();
            avg = sum/size;
        }
        return avg;
    }

    public double calculateMedianTemperature() {

            List<Double> resultList = new ArrayList<>();

            for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
                resultList.add(temperature.getValue());
            Collections.sort(resultList);
            }
        if (resultList.size() % 2 == 1)
            return resultList.get((resultList.size() + 1) / 2 - 1);
        else {
            double lower = resultList.get(resultList.size() / 2 - 1);
            double upper = resultList.get(resultList.size() / 2);

            return (lower + upper) / 2.0;
        }
    }
}