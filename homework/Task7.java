package week1.homework;

import java.util.Scanner;

/**
 * Created by jana.bogapowa on 24.06.2015.
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        if (a % b == 0) {
            System.out.println("TRUE ");
            System.out.println("Remainder of division " + a % b);
            System.out.println("Integer remainder of division " + a / b);

        } else if (a % b != 0) {
            System.out.println("FALSE ");
            System.out.println("Remainder of division " + a % b);
            System.out.println("Integer remainder of division " + a / b);


        }

    }
}
