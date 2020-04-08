package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Date DateTest = new Date(11,25,2000);
        System.out.println("The month is " + DateTest.getMonth());
        System.out.println("The day is " + DateTest.getDay());
        System.out.println("The year is " + DateTest.getYear());
        System.out.print("The current date is: ");
        DateTest.DisplayDate();
        System.out.println();
        DateTest.setMonth(30);
        DateTest.setDay(5);
        DateTest.setYear(2011);
        System.out.print("The current date is: ");
        DateTest.DisplayDate();

    }

}
