package Basics;

import java.util.Scanner;

public class largest_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int number_one = in.nextInt();
        System.out.print("Enter a second Number: ");
        int number_two = in.nextInt();
        if(number_one > number_two){
            System.out.println(number_one + " is larger");
        }else{
            System.out.println(number_two + " is larger");
        }
    }
}
