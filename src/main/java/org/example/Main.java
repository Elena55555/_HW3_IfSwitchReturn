package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {

        System.out.println(" ");
        System.out.println("Task № 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any 2 numbers:  ");
        /** We save the digit that the user
         * enters into a variables
         */
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (((x % 2 == 0) & (y % 2 == 0)) || ((x % 2 != 0) & (y % 2 != 0))) {
            System.out.println("A lucky coincidence");
        }
        return;
    }

    public static void task2() {
        System.out.println(" ");
        System.out.println("Task № 2 (Option 1)");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number:  ");
        /** We save the digit that the user
         * enters into a variable
         */
        int x = scanner.nextInt();
        if (x <= 10) {
            System.out.println("1 decade");
        }
        if (11 <= x & x <= 20) {
            System.out.println("2 decade");
        }
        if (21 <= x & x <= 31) {
            System.out.println("3 decade");
        }
    }

    public static void task3() {
        System.out.println(" ");
        System.out.println("Task № 2 (Option 2)");
        System.out.println("Enter any number:");
        Scanner scanner = new Scanner(System.in);
        /** We save the digit that the user
         * enters into a variable
         */
        int dayNumber = scanner.nextInt();
        switch (dayNumber) {
            /**  The first condition: if the day belongs to a certain decade
             *  We output  this decade to the console
             */
            case 1:
                System.out.println("1 decade");
                break;
            case 2:
                System.out.println("1 decade");
                break;
            case 3:
                System.out.println("1 decade");
                break;
            case 4:
                System.out.println("1 decade");
                break;
            case 5:
                System.out.println("1 decade");
                break;
            case 6:
                System.out.println("1 decade");
                break;
            case 7:
                System.out.println("1 decade");
                break;
            case 8:
                System.out.println("1 decade");
                break;
            case 9:
                System.out.println("1 decade");
                break;
            case 10:
                System.out.println("1 decade");
                break;
            case 11:
                System.out.println("2 decade");
                break;
            case 12:
                System.out.println("2 decade");
                break;
            case 13:
                System.out.println("2 decade");
                break;
            case 14:
                System.out.println("2 decade");
                break;
            case 15:
                System.out.println("2 decade");
                break;
            case 16:
                System.out.println("2 decade");
                break;
            case 17:
                System.out.println("2 decade");
                break;
            case 18:
                System.out.println("2 decade");
                break;
            case 19:
                System.out.println("2 decade");
                break;
            case 20:
                System.out.println("2 decade");
                break;
            case 21:
                System.out.println("3 decade");
                break;
            case 22:
                System.out.println("3 decade");
                break;
            case 23:
                System.out.println("3 decade");
                break;
            case 24:
                System.out.println("3 decade");
                break;
            case 25:
                System.out.println("3 decade");
                break;
            case 26:
                System.out.println("3 decade");
                break;
            case 27:
                System.out.println("3 decade");
                break;
            case 28:
                System.out.println("3 decade");
                break;
            case 29:
                System.out.println("3 decade");
                break;
            case 30:
                System.out.println("3 decade");
                break;
            case 31:
                System.out.println("3 decade");
                break;
            default:
                System.out.println("There is no such day");
                /** Closing the scanner
                 * to avoid resource leakage
                 */
                scanner.close();
        }
    }
}