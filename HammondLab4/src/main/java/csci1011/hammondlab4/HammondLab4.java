
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1011.hammondlab4;

import java.util.Scanner;

/**
 * @author Matt Hammond
 * CSCI 1011 - Lab 4
 * A program that outputs whether or not a professor is available during specified time. 
 */
public class HammondLab4 {

    public static void main(String[] args) {
        String dayOfWeek;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the day of the week:");
        dayOfWeek = keyboard.next();
        String timeOfDay;
        System.out.println("Enter a time (XX:XXam/pm):");
        timeOfDay = keyboard.next();
        int hour, minute; 
        String amPm;
        int delimiterIndex = timeOfDay.indexOf(":");
        amPm = timeOfDay.substring(delimiterIndex + 3);
        hour = Integer.parseInt(timeOfDay.substring(0, delimiterIndex));
        minute = Integer.parseInt(timeOfDay.substring(delimiterIndex + 1, timeOfDay.length() - 2));
        
        if ((hour > 12) || (hour <= 0) || (minute >= 60)){
            System.out.println("Invalid Time");
        }
        else if (dayOfWeek.equalsIgnoreCase("monday")  || dayOfWeek.equalsIgnoreCase("mon")) {
            System.out.println("Day of the week: " + dayOfWeek);
            if (amPm.equalsIgnoreCase("pm") && hour >=3 && hour <5){
                System.out.println("Available"); 
            }
            else {
                System.out.println("Not Available");
            }
        }
        else if(dayOfWeek.equalsIgnoreCase("tuesday") || dayOfWeek.equalsIgnoreCase("tue")){
            System.out.println("Day of the week: " + dayOfWeek);
            System.out.println("Not Available");
        }
        else if(dayOfWeek.equalsIgnoreCase("wednesday") || dayOfWeek.equalsIgnoreCase("wed")){
            System.out.println("Day of the week: " + dayOfWeek);
            System.out.println("Not Available");
        }
        else if(dayOfWeek.equalsIgnoreCase("thur") || dayOfWeek.equalsIgnoreCase("thu") || dayOfWeek.equalsIgnoreCase("thursday")){
            System.out.println("Day of the week: " + dayOfWeek);
            if (amPm.equalsIgnoreCase("pm") && (hour == 3 && minute >= 30) || (hour >= 4) && (hour < 5)){
                System.out.println("Available"); 
            }
            else {
                System.out.println("Not Available");
            }
        } 
        else if(dayOfWeek.equalsIgnoreCase("friday") || dayOfWeek.equalsIgnoreCase("fri")){
            System.out.println("Day of the week: " + dayOfWeek);
            if (amPm.equalsIgnoreCase("pm") && (hour >=3 && hour < 4) || (hour == 4 && minute <=30)){
                System.out.println("Available"); 
            }
            else {
                System.out.println("Not Available");
            }
        }
        else if(dayOfWeek.equalsIgnoreCase("saturday") || dayOfWeek.equalsIgnoreCase("sat")){
            System.out.println("Day of the week: " + dayOfWeek);
            System.out.println("Not Available");
        }
        else if(dayOfWeek.equalsIgnoreCase("sunday") || dayOfWeek.equalsIgnoreCase("sun")){
            System.out.println("Day of the week: " + dayOfWeek);
            System.out.println("Not Available");
        }
        else {
            System.out.println("Invalid Day");
        }

    }
}
