package AbaCal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Line 5");
        AbaCal.main(args);
    }

    public static Day[][] generateYear(Calendar cal, Weather... weathers) {
        Day[][] days = new Day[Calendar.yearLength][Calendar.daysInSeason];
        for (int ii = 0; ii < Calendar.yearLength; ii++) {
            days[ii] = generateSeason(cal, weathers[ii]);
        }
        return days;
    }
    public static Day[] generateSeason(Calendar cal, Weather weather) {
        Day[] days = new Day[Calendar.daysInSeason];
        for (int ii = 0; ii < Calendar.daysInSeason; ii++) {
            weather.todayWeather();
            days[ii] = new Day(cal.day,
                    cal.week,
                    cal.month,
                    cal.season,
                    cal.year,
                    (int) weather.temp,
                    (int) weather.wind,
                    (int) weather.precipChance);
            System.out.println(days[ii].toString());
            cal.nextDay();
        }
        return days;
    }
}
