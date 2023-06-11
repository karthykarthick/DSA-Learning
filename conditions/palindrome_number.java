package conditions;

import java.util.Scanner;

public class palindrome_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        int last_num;
        int rev=0;
        while(n!=0){
            last_num = n%10;
            rev =  rev*10+last_num;
            n=n/10; 
        }
        System.out.println(rev);
    }
}
