package week1.homework;

import java.util.Scanner;


/**
 * Created by jana.bogapowa on 23.06.2015.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number");
        double a = keyboard.nextDouble();
        if (a >= 0.0 && a <= 1.0) {
            System.out.println("The number ist in the correct range");

        } else if (a < 0.0 || a > 1.0) {
            System.out.println("The number ist NOT in the correct range");
        }

    }
}
