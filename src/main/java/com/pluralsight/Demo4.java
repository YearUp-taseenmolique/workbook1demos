package com.pluralsight;
import java.util.*;

public class Demo4
{

    public static void  main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Hi what's your name? ");
        String name = s.nextLine();
        String greeting = "Hello " + name;

        System.out.print("On average, how many days a week do you watch TV? ");
        int numberOfDaysPerWeekWatchesTV = s.nextInt();
        s.nextLine();

        System.out.print("When you do watch TV, how many minutes do you watch? ");
        int minutesPerDayOnDayWatchedOnAverage = s.nextInt();
        s.nextLine();

        int minutesPerWeek = numberOfDaysPerWeekWatchesTV * minutesPerDayOnDayWatchedOnAverage;

        int minutesPerYear = minutesPerWeek * 52;

        int hoursPerYear = minutesPerYear / 60;

        System.out.print("On average, how many hours do you work in a work week? ");
        int hoursInWorkWeek = s.nextInt();
        s.nextLine();

        int workWeekPerYearWatchingTV = hoursPerYear / hoursInWorkWeek;

        System.out.print("If " + name + " did not watch TV, it would be like a " + workWeekPerYearWatchingTV + " week vacation every year");


    }
}