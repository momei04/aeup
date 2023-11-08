package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        LocalDate datum = LocalDate.now();
        //gives out the current date
        System.out.println("Getting todays Date: ");
        System.out.println(datum);

        LocalDate date = LocalDate.of( 2014 , 2 , 11 );
        System.out.println("Getting a Specific Date");
        System.out.println(date);

        //gives out the 50th day in the year 2019
        System.out.println("gives out the 50th day in the year 2019");
        System.out.println(specificDate(28, 12, 2001));

        //gives the nth day in a year
        System.out.println("gives the nth day in a year");
        System.out.println(nthDay(2015, 70));

        //getting yesterday
        System.out.println("getting yesterday");
        System.out.println(getYesterday());

        //getting the day in 6 months from now
        System.out.println("getting the day in 6 months from now");
        System.out.println(getDayInXMonths(6));

        //getting the day before 6 months from now
        System.out.println("getting the day before 6 months from now");
        System.out.println(getDayBeforeXMonths(6));

        //converting a String to a LocalDate
        System.out.println("converting a String to a LocalDate");
        System.out.println(parseDate("28.12.2022"));

        System.out.println("Schaltjahr");
        boolean isLeapYear = date.isLeapYear();
        System.out.println(isLeapYear);
    }

    public static LocalDate specificDate(int day, int month, int year){
        return LocalDate.of(year, month, day);
    }

    public static LocalDate nthDay(int year, int day){
        return LocalDate.ofYearDay(year, day);
    }

    public static LocalDate getYesterday(){
        LocalDate yesterday = LocalDate.now().minusDays( 1 );
        return yesterday;
    }

    public static LocalDate getDayInXMonths(int number){
        return LocalDate.now().plusMonths(number);
    }

    public static LocalDate getDayBeforeXMonths(int number){
        return LocalDate.now().minusMonths(number);
    }

    public static LocalDate parseDate(String dateString){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        LocalDate localDate = LocalDate.parse(dateString, formatter);
        return localDate;
    }



}

