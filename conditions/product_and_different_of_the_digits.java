package conditions;

import java.util.Scanner;

public class product_and_different_of_the_digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int product = 1;
        while(n>0){

            int last_digit = n % 10;
            // System.out.println(last_digit);
            sum = sum + last_digit;
            product = product * last_digit;
            System.out.println(sum);
            System.out.println(product);
            n = n / 10;
        }
        
        int res = product-sum;
        System.out.println(res);
    }
}
