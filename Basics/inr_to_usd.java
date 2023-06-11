

import java.util.Scanner;

public class inr_to_usd {
    public static void main(String[] args) {
        float USD = 82.52f;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your amount in Rupess: ");
        int inr = in.nextInt();
        System.out.println("USD:"+ inr/USD);
    } 
}
