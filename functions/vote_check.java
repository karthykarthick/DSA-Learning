package functions;

public class vote_check {
    public static void main(String[] args) {
     
       System.out.println(iseligible(10));
    }

    static String iseligible(int i) {
        if(i>=18){
            return "You are eligible";
        }
        return "You are not elible";
    }
}
