

import java.util.Scanner;

public class greet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Name:");
        String name = in.nextLine();
        System.out.println("Have a Nice Day! "+name);
    }
}
