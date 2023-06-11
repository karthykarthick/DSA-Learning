package conditions;

import java.util.Scanner;

public class max_of_a_number_until_0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  n;
        int sum = 0;
        do {
            n = in.nextInt();
        sum = Math.max(n, sum);
        } while (n!=0);
        System.out.println("The max is: "+ sum);
    }
}
