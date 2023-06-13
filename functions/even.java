package functions;

public class even {
    public static void main(String[] args) {
        String res = iseven(101);
        System.out.println(res);
    }

    static String iseven(int i) {
        if(i%2==0){
            return "even";
        }
        return "odd";
    }
}
