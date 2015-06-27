package week1.homework;

import java.util.Scanner;

/**
 * Created by jana.bogapowa on 23.06.2015.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = keyboard.nextInt();
        if (a % 7 == 0) {
            System.out.println("double value = " + a * 2);
        }


    }
}
