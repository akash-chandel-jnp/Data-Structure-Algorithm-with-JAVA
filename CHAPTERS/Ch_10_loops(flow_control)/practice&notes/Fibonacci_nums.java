import java.io.FileReader;

public class Fibonacci_nums{
    public static void main(String[] args) {
        nth_fibonacci(8);
        
        
    }
    public static void  nth_fibonacci(int n){
        int fib_1 = 0;
        System.out.print(fib_1 + " ");
        int fib_2 = 1;
        System.out.print(fib_2 + " ");
        int fib_3=0;
        
        for(int i =3; i<=n ; i++){

            fib_3 = fib_1 + fib_2;

            int temp = fib_1;
            fib_1 = fib_2;
            fib_2 = fib_3;
            // System.out.print(fib_3 + " ");


        }
        System.out.println(fib_3);



    }
}