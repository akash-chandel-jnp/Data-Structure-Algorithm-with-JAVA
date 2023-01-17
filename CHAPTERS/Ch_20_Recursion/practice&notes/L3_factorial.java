public class L3_factorial {
    public static int factorial(int n){
        if (n ==1){
            return 1;
        }
        int fact_pre = factorial(n-1);    // first find factorial of previous no. 
        int fact = n*fact_pre;            // now find factorial of curent no.

        // int fact= n*factorial(n-1); // in place of above two lines we can write this line only
        return fact;
    }
    
    
    public static void main(String[] args) {
        // factorial(5);
        System.out.println(factorial(5));
        
    }
}
