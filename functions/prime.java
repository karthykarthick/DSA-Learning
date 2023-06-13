package functions;

public class prime {

  public static void main(String[] args) {
    
   boolean prime =  isPrime(100);
   if(prime){
    System.out.println("it is prime");
   }else{
    System.out.println("it is not prime");
   }
  }

   static boolean isPrime(int num) {
    if(num<=1){
        return false;
    }
    for (int i = 2; i <num; i++) {
        if(num%i==0){
            return false;
        }
    }
    return true;
   }
}
