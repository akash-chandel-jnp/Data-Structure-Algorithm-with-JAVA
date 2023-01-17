public class Precedence{
    public static void main(String[] args){
        int x = 2, y = 5;
        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));  // y/x is converted to int means y/x is 2.5 which will be converted to 2.
        System.out.println(exp1);
        System.out.print(exp2);
    }
}