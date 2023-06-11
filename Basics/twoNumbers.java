
import java.util.Scanner;

public class twoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int number_one = in.nextInt();
        
        System.out.println("Enter the second number: ");
        int number_two = in.nextInt();

        System.out.println("Result: " + (number_one + number_two));
    }
}
