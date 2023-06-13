package functions;

public class palindrome {
    public static void main(String[] args) {
       boolean palindrome = isPalindrome(545);
       if(palindrome){
        System.out.println("palindrome number");
       }else{
        System.out.println("Not a palindrome number");
       }
    }

    static boolean isPalindrome(int num){
        int temp = num;
        int val = 0;
        for(int i = 1;i<num;i++){
            int last_num = num % 10;
            val = val * 10 + last_num;
            num = num / 10;
        }
 
        if(temp == val){
            return true;
        }else{
            return false;
        }
        
    }
}
