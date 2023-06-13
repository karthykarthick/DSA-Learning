package functions;

public class area_of_circle {
    public static void main(String[] args) {
       double res = circle(20);
       System.out.println("area of circle is: "+res);
    }

     static double circle(int i) {
        double pi = 3.14;
        return pi * (i * i);
    }
}
