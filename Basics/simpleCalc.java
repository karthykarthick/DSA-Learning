package Basics;

import java.util.Scanner;

public class simpleCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int number_one = in.nextInt();
        System.out.print("Enter second number: ");
        int number_two = in.nextInt();
        System.out.println("Enter your symbol of choice: +,-,*,/ ");
        String symbol = in.next();

        if (symbol.charAt(0) == '+') {
            System.out.println("Result of Addition is: " + (number_one + number_two));
        }
        if (symbol.charAt(0) == '-') {
            System.out.println("Result of subraction is: " + (number_one - number_two));
        }
        if (symbol.charAt(0) == '*') {
            System.out.println("Result of Multiplication is: " + (number_one * number_two));
        }
        if (symbol.charAt(0) == '/') {
            System.out.println("Result of Division is: " + (number_one / number_two));
        }
    }
}
