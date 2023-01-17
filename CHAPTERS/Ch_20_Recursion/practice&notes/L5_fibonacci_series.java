import java.lang.module.FindException;

public class L5_fibonacci_series {
    public static int fibonacci(int n){
        if (n ==0 || n == 1){
            return n;
        }
        
        int fibo_n_minus_1 =fibonacci(n-1);
        int fibo_n_minus_2 =fibonacci(n-2);

        int fibo_n = fibo_n_minus_1 + fibo_n_minus_2 ; 
        
        // int fibo_n =fibonacci(n-1) + fibonacci(n-2); // single line code for above three line codes

        return fibo_n;

    }
    
    
    public static void main(String[] args) {
        System.out.println(fibonacci(6));
        
    }
    
}
