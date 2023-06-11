
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        // palindrome ==> Madam is palindrome

        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int val = name.length();
        int count = 0;
        for(int i = 0;i<name.length();i++){
            if(name.charAt(i) == name.charAt(val-1-i)){
                count = count + 1;
            }
        }
        if(count == val){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
