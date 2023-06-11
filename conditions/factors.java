package conditions;

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to find its factor: ");
        int n = in.nextInt();
        for (int i = 1; i <=n; i++) {
            if(n%i==0){
                System.out.print(i + " ");
            }
        }
    }
}
