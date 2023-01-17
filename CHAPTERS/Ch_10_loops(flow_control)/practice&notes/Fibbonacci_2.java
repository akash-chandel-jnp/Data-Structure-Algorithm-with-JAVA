public class Fibbonacci_2 {
    public static void main(String[] args) {

        System.out.println(fibonacci_n(6));
        
    }

    public static int fibonacci_n(int n ){
        int fib_a = 0;
        int fib_b = 1;
        for(int i = 3; i<=n; i++){
            int temp = fib_b;
            fib_b = fib_a + fib_b;
            fib_a = temp;
        }return fib_b;

    }
    
}
