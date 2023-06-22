package Arrays;
import java.util.Arrays;
public class nums {
    public static void main(String[] args) {
        int[] num = {1,2,3};

        int prev = 0;
        for (int i = 1; i <num.length; i++) {
//            System.out.println("prev: "+prev);
            num[i] = num[i] + num[i-1];
//            System.out.println(num[i]);
        }
        System.out.println(Arrays.toString(num));

    }
}
