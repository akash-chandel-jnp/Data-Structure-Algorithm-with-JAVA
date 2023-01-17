package EXERCISES;

public class PrimeOrNot {
    public static void main(String[] args) {
        int num = 56;
        for (int i = 2; i< num - 1 ; i++){
            int rem = num% i;
            if (rem == 0){
                System.out.println("num is not a prime number");
                break;
            }
        }
    }
    
}
