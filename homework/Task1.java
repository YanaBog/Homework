package week1.homework;

import java.util.Scanner;

/**
 * Created by jana.bogapowa on 23.06.2015.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the actual time");
        int t = keyboard.nextInt();
        if (t >= 9 && t <= 18) {
            System.out.println("I'm at work");
        } else if (t >= 0 && t < 9 || t > 18 && t <= 24) {
            System.out.println("I'm at home");

        }
    }
}
