

import java.util.Scanner;

public class amstrong_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to find it is Amstrong or Not: ");
        int num = in.nextInt();
       int temp =num;
       int cube = 0;
        while(temp > 0){
           int last_num = temp % 10;
           cube = cube + (last_num * last_num * last_num);
           temp = temp / 10;
        }
        if (num == cube) {
            System.out.println("Amstrong number");
        } else {
            System.out.println("Not an Amstrong Number");
        }
    }
}
