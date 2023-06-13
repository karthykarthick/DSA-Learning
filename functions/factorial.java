package functions;

public class factorial {
    public static void main(String[] args) {
       int result = fact(5);
       System.out.println(result);
    }

     static int fact(int i) {
        int res = 1;
        for (int j = 0; j <i; j++) {
            res = res * (j+1);
        }
        return res;
    }
}
