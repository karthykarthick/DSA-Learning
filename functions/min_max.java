package functions;

public class min_max {
    public static void main(String[] args) {
        int min_num = min(10,200,3000);
        int max_num = max(10,200,3000);

        System.out.println("min: "+min_num);
        System.out.println("max: "+ max_num);
        
    }

      static int max(int a, int b, int c) {
       int max = a;
       if(b > max){
          max = b;
       }
       if(c > max){
          max = c;
       }
        return max;
    }

    static int min(int a, int b, int c) {
        int min = a;
        if(b < min){
            min = b;
        }
        if(c < min){
            min = c;
        }
        return min;
    }
}
