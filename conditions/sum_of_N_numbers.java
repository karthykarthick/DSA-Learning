package conditions;

import java.util.Scanner;

public class sum_of_N_numbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to add: ");
       int n = in.nextInt();
       int sum = 0;
       for(int i = 1;i<=n;i++){
        sum = sum + i;
       }
       System.out.println("Sum of numbers: "+sum);
    }
}
