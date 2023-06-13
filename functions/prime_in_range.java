package functions;

public class prime_in_range {
    public static void main(String[] args) {
        int min = 5; 
        int max = 100;
        int flag = 0;
        isprime(min,max,flag);
       
        
    }

    static void isprime(int min, int max, int flag) {
        for(int n = min;n<max;n++){
            for(int i = 2; i<n;i++){
                if(n%i==0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.print(n+" ");
            }
            flag = 0;
        }
    }
}
