package week1.homework;

import java.util.Scanner;

/**
 * Created by jana.bogapowa on 23.06.2015.
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();

        if ((a + b) >= 11 && (a + b) <= 19) {
            System.out.println("Sum of numbers is " + (a + b));

        }
    }
}
