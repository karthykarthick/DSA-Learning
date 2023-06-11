package conditions;

public class sum_of_digits {
    public static void main(String[] args) {
        int n = 123;
        int sum=0;
        while(n!=0) {
            int last_num = n%10;
            sum = sum+last_num;
            n=n/10;
        }
        System.out.println(sum);
    }
}
