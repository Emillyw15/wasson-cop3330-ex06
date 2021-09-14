/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Emilly Wasson
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class prog6 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("What is your current age? ");
        String currentAge = a.nextLine();
        Scanner b = new Scanner(System.in);
        System.out.print("At what age would you like to retire? ");
        String retire = b.nextLine();

        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");

        int one = Integer.valueOf(currentAge), two = Integer.valueOf(retire);
        int retirementAge = two - one;
        int retirementYear = retirementAge + date.getYear();

        System.out.println("You have " + retirementAge + " years until you can retire.");
        System.out.println("It's " + date.format(formatter) + ", so you can retire in " + retirementYear + ".");
    }
}
