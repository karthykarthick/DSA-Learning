package conditions;

import java.util.Scanner;

public class average_of_N_numbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        int count = 0,sum=0;
        do {
            n = in.nextInt();
            sum = sum + n;
            count++;
        } while(n!=0);
        count--;
        System.out.println(sum/count);
    } 
}
