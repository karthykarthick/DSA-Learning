package functions;

public class sum_of_n_numbers {
    public static void main(String[] args) {
        sum(100);
    }

     static void sum(int n) {
        int sum = 0;
        for (int i = 1; i <=n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
