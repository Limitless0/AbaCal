package AbaCal;

import java.io.Serializable;

public class Calendar implements Serializable {
    int day = 0;
    int weekLength; //in days
    int week = 0;
    int monthLength; //in weeks
    int month = 0;
    int seasonLength; // in months
    int season = 0;
    int yearLength; //in seasons
    int year = 0;
    int daysInYear = 0;
    int daysInSeason = 0;

    public Calendar(int weekLen, int monthLen, int seasonLen, int yearLen) {
        weekLength = weekLen; //in days
        monthLength = monthLen; // in weeks
        seasonLength = seasonLen; // in months
        yearLength = yearLen; //in seasons
        daysInSeason = weekLength * monthLength * seasonLength;
        daysInYear = weekLength * monthLength * seasonLength * yearLength;
    }



    void nextDay () {
        this.day++;
        if (this.day >= weekLength) {
            this.day = 0;
            nextWeek();
        }
    }
    private void nextWeek () {
        this.week++;
        if (this.week >= monthLength) {
            this.week = 0;
            nextMonth();
        }
    }
    private void nextMonth () {
        this.month++;
        if (this.month >= seasonLength) {
            this.month = 0;
            nextSeason();
        }
    }
    private void nextSeason () {
        this.season++;
        if (this.season >= yearLength) {
            this.season = 0;
            nextYear();
        }
    }
    private void nextYear () {
        this.year++;
    }
}
