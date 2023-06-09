package conditions;

import java.util.Scanner;

public class area_of_triangle {
    public static void main(String[] args) {
        System.out.println("Area of Triangle");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Base value: ");
        int base = in.nextInt();
        System.out.print("Enter the height value: ");
        int height = in.nextInt();
        System.out.println("Area of the Triangle is: " + (height *base)/2);

    }
}
