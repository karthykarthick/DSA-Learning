package conditions;

public class perfect_number {
    public static void main(String[] args) {
        int n = 6;
        int temp = n;
        int sum = 0;
        for(int i = 1;i<=n/2;i++){
            if(n%i==0){
                sum = sum + i;
            }
        }
        if(temp == sum){
            System.out.println("Perfect number");
        }else{
            System.out.println("Not a perfect number");
        }
    }
}
