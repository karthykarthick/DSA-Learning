package conditions;

import java.util.Scanner;

public class factorial {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the Number to Find its Factorial: ");
    int n = in.nextInt();
    int res = 1;
    for (int i = 0; i < n; i++) {
      res = res * (i + 1);
    }
    System.out.println(res);
  }
}
