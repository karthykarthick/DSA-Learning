package conditions;

import java.util.Scanner;

public class Batting_average {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // System.out.print("Enter the Matches: ");
    // int matches = in.nextInt();
    System.out.print("Enter the totalRuns: ");
    int total_runs = in.nextInt();
    System.out.print("Enter the number of innigs: ");
    int innings = in.nextInt();
    System.out.print("Enter the not-out: ");
    int notOut = in.nextInt();

    double avg = total_runs /(innings-notOut);
    System.out.println("The average of batting is: "+avg);

   }
}
