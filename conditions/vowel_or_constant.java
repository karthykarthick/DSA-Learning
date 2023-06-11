package conditions;

import java.util.Scanner;

public class vowel_or_constant {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character to find it is constant or vowel: ");
        String ch = in.next();
        if(ch.equals("a")||ch.equals("e")||ch.equals("i")||ch.equals("o")||ch.equals("u")){
            System.out.println("It is vowel");
        }else{
            System.out.println("It is constant");
        }
    }
}
