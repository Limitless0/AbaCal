package AbaCal;

import java.util.Random;

public class Weather {
    Random rand = new Random();

    private double averageTemp;
    private double averageWind;
    private double averagePrecipChance;
    double temp;
    double wind;
    double precipChance;

    Weather(double t, double w, double p) {
        averageTemp = t;
        averageWind = w;
        averagePrecipChance = p;
    }

    public double getAverageTemp() {
        return averageTemp;
    }

    public void setAverageTemp(double averageTemp) {
        this.averageTemp = averageTemp;
    }

    double getAverageWind() {
        return averageWind;
    }

    void setAverageWind(double averageWind) {
        this.averageWind = averageWind;
    }

    double getAveragePrecipChance() {
        return averagePrecipChance;
    }

    void setAveragePrecipChance(double averagePrecipChance) {
        this.averagePrecipChance = averagePrecipChance;
    }

    void todayWeather() {
        this.temp = averageTemp + (2 * rand.nextGaussian());
        this.wind = averageWind + (5 * rand.nextGaussian());
        this.precipChance = averagePrecipChance + (10 * rand.nextGaussian());
    }

}
