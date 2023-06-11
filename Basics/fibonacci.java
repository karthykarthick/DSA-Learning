

public class fibonacci {
    public static void main(String[] args) {
        // op: 0 1 1 2 3 5 8 
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + " ");
        System.out.print(b + " ");

        for(int i = 1;i<=10;i++){
            c = a+b; // c = 0 + 1 = 1 => 0 1 1 
            // Here a = 0 , b = 1 Now i need to change this to a = 1, b = 1
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}
