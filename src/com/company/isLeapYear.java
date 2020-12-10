package com.company;
import java.util.Scanner;
public class isLeapYear {

    public static void main(String[] args) {
	// write your code here
        System.out.println("insert year to check");
        Scanner scanner = new Scanner(System.in);
        boolean leapYear = false;
        int year = scanner.nextInt();
        if (year%4==0) {
            if (year%100==0) {
                if (year%400==0) {
                    leapYear = true;
                } else {
                    leapYear = false;
                }
            }
            else {
                leapYear = true;
            }
        }

        if (leapYear){
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

    }
}
