package conditions;

import java.util.Scanner;

public class distanceBetweenTwoPoints {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value for X1: ");
        int x1 = in.nextInt();
        System.out.print("Enter the value for X2: ");
        int x2 = in.nextInt();
        System.out.print("Enter the value for Y1: ");
        int y1 =in.nextInt();
        System.out.print("Enter the value for Y2: ");
        int y2 = in.nextInt();

        double res = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("The distance between these two points are: "+res);
    }
}
