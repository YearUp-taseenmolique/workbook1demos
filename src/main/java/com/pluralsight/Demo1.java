package com.pluralsight;

public class Demo1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        char status = 'm';
        int identity = 1;
        String name = "Taseen";


        String greeting = "Hello " + name;
        //String greeting = "Hello" + "Matt";

        int NumberOfDaysPerWeekWatchesTV = 2;
        int MinutesPerDayOnAverage = 180;
        int MinutesPerWeek = NumberOfDaysPerWeekWatchesTV * MinutesPerDayOnAverage;
        int MinutesPerYear = MinutesPerWeek * 52;

        int HoursPerYear = MinutesPerYear / 60;

        int HoursInWorkWeek = 30;

        int WorkWeekPerYearWatchingTV = HoursPerYear / HoursInWorkWeek;

        System.out.println("If " + name + " did not watch TV, it would be like a " + WorkWeekPerYearWatchingTV + " week vacation every year");
        System.out.println(greeting);
    }
}
