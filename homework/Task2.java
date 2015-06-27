package week1.homework;

import java.util.Scanner;

/**
 * Created by jana.bogapowa on 23.06.2015.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a");
        int a = keyboard.nextInt();
        System.out.println("Enter b");
        int b = keyboard.nextInt();
        System.out.println("Enter c");
        int c = keyboard.nextInt();
        if (a > b && a > c) {
            System.out.println("the greatest value is " + a);
        } else if (b > a && b > c) {
            System.out.println("the greatest value is " + b);
        } else if (c > a && c > b) {
            System.out.println("the greatest value is " + c);
        }
        if (a < b && a < c) {
            System.out.println("the least value " + a);
        } else if (b < a && b < c) {
            System.out.println("the least value " + b);
        } else if (c < a && c < b) {
            System.out.println("the least value " + c);

        }


    }
}
