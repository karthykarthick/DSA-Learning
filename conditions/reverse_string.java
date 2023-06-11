package conditions;

import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       char[] name = in.nextLine().toCharArray();
      String rev="";
      for(int i = name.length-1;i>=0;i--){
        rev = rev + name[i];
      }
       System.out.println(rev);
    }
}
