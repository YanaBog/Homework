package week1.homework;

import java.util.Scanner;

/**
 * Created by jana.bogapowa on 23.06.2015.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter to numbers");
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();

        if (a > b) {
            System.out.println("Difference is " + (a - b));
        } else if (b > a) {
            System.out.println("Sum is " + (a + b));
        }

    }
}
