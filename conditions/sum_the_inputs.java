package conditions;

import java.util.Scanner;

public class sum_the_inputs {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n;
    int sum = 0;
    do {
      n = in.nextInt();
      sum = sum + n;
    } while (n != 0);
    System.out.println("The sum is: " + sum);
  }
}
