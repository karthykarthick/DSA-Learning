package conditions;

import java.util.Scanner;

public class area_of_circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Area of circle program");
        System.out.print("Enter the Radius value: ");
        int radius = in.nextInt();
        float pi = 3.14f;
        System.out.println("Area of the circle is: " + pi *(radius * radius));
    }
}
