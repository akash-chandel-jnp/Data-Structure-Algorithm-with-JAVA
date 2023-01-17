import java.util.Scanner;
public class PrimeOrNot_boolean{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        
        int num = sc.nextInt();
        boolean isPrime = true ;  //assume the number is prime ; later on will update this if found not prime
        
        
        
        if (num == 2) {
            System.out.println("the number is surely  prime ");
        } else {
            
            for (int i = 2;i<= num-1;i++
            ) {
            
                if(num % i==0){
                System.out.println("Not prime no. as it is divisible by " + i);
                isPrime = false;
                break;
            }
        } if (isPrime == true) {
            System.out.println("the number is a prime number");
        } else {
            System.out.println("the number is not prime");
        }

 
        

        }


        
        
           }

}