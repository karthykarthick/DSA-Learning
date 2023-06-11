

import java.util.Scanner;

public class simple_intrest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your principal Amount: ");
        int amount = in.nextInt();
        System.out.print("Enter your Time: ");
        int time = in.nextInt();
        System.out.print("Enter your Intrest: ");
        float intrest = in.nextFloat();


        System.out.println("your simple inrest is " + (amount * time * intrest)/100);
    }
}
