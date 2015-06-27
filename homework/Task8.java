package week1.homework;

import java.util.Scanner;

/**
 * Created by jana.bogapowa on 24.06.2015.
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();

        if (a <= 9) {
            a = a + 10;
        }
        if (b <= 9) {
            b = b + 10;
        }
        if (a % 10 == b % 10) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

    }

}
