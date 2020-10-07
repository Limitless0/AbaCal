package AbaCal;

import java.io.IOException;

public class Main {
    static Calendar calendar;
    static Day[] days;
    static String path = "./";
    static boolean loaded = false;
    static Weather[] weathers;

    public static void main(String[] args) {
        init();
        AbaCal.main(args);
        saveData();
    }


    static void init() {
        try {
            calendar = (Calendar) SerializationUtils.deserialize(path + "cal.data");
            days = (Day[]) SerializationUtils.deserialize(path + "days.data");
            System.out.println("Hey, we found some stuff!");
            loaded = true;
        } catch (Exception e) {
            System.out.println("This is either a first run or everything is gone");
        }
    }

    static void saveData() {
        try {
            SerializationUtils.serialize(calendar, path + "cal.data");
            SerializationUtils.serialize(days, path + "days.data");
            System.out.println("Your shit is safe");
        } catch (Exception e) {
            System.out.println("Failed to save data. Your shit is totally fucked dude.");
        }
    }

    public static Day[][] generateYear(Calendar cal, Weather[] weathers) {
        Day[][] days = new Day[cal.yearLength][cal.daysInSeason];
        for (int ii = 0; ii < cal.yearLength; ii++) {
            days[ii] = generateSeason(cal, weathers[ii]);
        }
        return days;
    }
    public static Day[] generateSeason(Calendar cal, Weather weather) {
        Day[] days = new Day[cal.daysInSeason];
        for (int ii = 0; ii < cal.daysInSeason; ii++) {
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
