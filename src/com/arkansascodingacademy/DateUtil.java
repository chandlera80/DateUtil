package com.arkansascodingacademy;

import com.sun.xml.internal.fastinfoset.util.LocalNameQualifiedNamesMap;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

@SuppressWarnings("WeakerAccess")
public class DateUtil
{
    //Return a LocalDate object for New Years of
    // the given year
    public static LocalDate getNewYears(int year)
    {
        LocalDate date = LocalDate.of(year, 1,1 );
        return date;
    }

    //Return a LocalDate object for Christmas of the given year
    public static LocalDate getChristmas(int year)

    {
        LocalDate date = LocalDate.of(year, 12,25 );
        return date;
    }

    //In 1999 it is time to party
    //If the given year is 1999 return true
    public static boolean isPartyTime(LocalDate date)
    {
       if (date.getYear() == 1999)
           return true;
       else
        return false;
    }

    //After 1999 you are out of time
    //If the given year is after 1999 return true
    public static boolean isOutOfTime(LocalDate date)
    {

        if (date.getYear() > 1999)
            return true;
        else
            return false;
    }

    //You took too long to order your soup
    //You cannot try again for one year
    //Return the given date one year from now
    public static LocalDate getSoupDay(LocalDate date)

    {
       LocalDate getSoup =  date.plusYears(1);
        return getSoup;
    }

    //Return a LocalDate object for the next Christmas after the given date
    public static LocalDate getNextChristmas(LocalDate date)

    {
        int year = date.getYear();
        if (date.getMonthValue() == 12 && date.getDayOfMonth() >= 25)

        {
            year++;
        }

       LocalDate nextChristmas = LocalDate.of(year, 12, 25);
        return nextChristmas;
    }

    //Return the number of days until Christmas
    //If it is Christmas return the number of days until the next Christmas
    public static long getDaysUntilChristmas(LocalDate date)

    {
        LocalDate nextChristmas = getNextChristmas(date);

       Long ChristmasCountdown =ChronoUnit.DAYS.between(date, nextChristmas);
        return ChristmasCountdown;
    }


    //Return a array of twelve ints holding the number of days in each month
    public static int[] daysInMonth(int year)
    {
        int []daysInMonth = new int [12];

        for (int monthNumber = 1; monthNumber <=12; monthNumber++)
        {
            LocalDate date = LocalDate.of(year, monthNumber, 1);
            daysInMonth[monthNumber - 1] = date.lengthOfMonth();
        }
        return daysInMonth;
    }
}
