package conditions;

import java.util.Scanner;

public class area_of_rectangle {
    public static void main(String[] args) {
        System.out.println("Area of Rectangle");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Length value: ");
        int length = in.nextInt();
        System.out.print("Enter the width value: ");
        int width = in.nextInt();
        System.out.println("The Area of Rectangle is:  "+(width * length));
    }
}
