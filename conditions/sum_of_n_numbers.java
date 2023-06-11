package conditions;

import java.util.Scanner;

public class sum_of_n_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum  = 0;
        
        int n = in.nextInt();
        for (int i = 0; i<n; i++) {
            sum = sum + n;
            if(n==0){
                break;
            }
        }
        System.out.println(sum);
    }
}
