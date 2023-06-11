package conditions;

import java.util.Scanner;

public class hcf {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter the num2: ");
        int num2 = in.nextInt();
        int hcf=0;

        for(int i = 1; i<=num1||i<=num2; i++){
            if(num1%i==0 && num2%i==0){
                hcf = i;
            }
        }
        System.out.println("Hcf is: "+hcf);
        System.out.println("Lcm is:"+(num1*num2)/hcf);
    }
}
