package conditions;

public class leap_year {
    public static void main(String[] args) {
        int year = 1999;
        if(year%400==0||year%4==0){
            System.out.println("it is a leap year");
        }else if(year%100==0){
            System.out.println("Not a leap year");
        }else{
            System.out.println("Not a leap year");
        }
    }
}
