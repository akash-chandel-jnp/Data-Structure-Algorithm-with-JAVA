public class AAAtest {
    
    public static int factorial(int n){
     
     // fact(n) = n * fact(n-1) ;

        if(n == 1){
            return 1;
        }
        int fact_n_1 = factorial(n-1);
        int fact_n = n*fact_n_1;
        return fact_n;
    }
    public static void main(String[] args) {
        factorial(5);
        System.out.println(factorial(5));

        //
    }
}
