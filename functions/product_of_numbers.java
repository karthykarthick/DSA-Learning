package functions;

public class product_of_numbers {
    public static void main(String[] args) {
       int res =  product(10,20);
       System.out.println("the product of two numbers are: "+res);
    }

     static int product(int i, int j) {
        return i*j;
    }
}
