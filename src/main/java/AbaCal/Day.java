package AbaCal;

import java.io.Serializable;

public class Day implements Serializable {
    int day;
    int week;
    int month;
    int season;
    int year;
    int temp;
    int wind;
    int precipChance;
    String details = "";

    public Day(int day, int week, int month, int season, int year, int temp, int wind, int precipChance) {
        this.day = day;
        this.week = week;
        this.month = month;
        this.season = season;
        this.year = year;
        this.temp = temp;
        this.wind = wind;
        this.precipChance = precipChance;
        this.details = this.toString();
    }

    @Override
    public String toString() {
        return "Day =\t"
                + day +
                ", week =\t" + week +
                ", month =\t" + month +
                ", season =\t" + season +
                ", year =\t" + year +
                ", temp =\t" + temp +
                ", wind =\t" + wind +
                ", precipChance =\t" + precipChance + '%';
    }
}
