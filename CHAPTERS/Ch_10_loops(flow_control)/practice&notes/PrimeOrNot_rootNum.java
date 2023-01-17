import java.util.Scanner;
public class PrimeOrNot_rootNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        
        int num = sc.nextInt();
        int no_of_factors =0 ;
        
        
        
        if (num == 2) {
            System.out.println("the number is surely  prime ");
        } else {
            
            for (int i = 2;i<= Math.sqrt(num);i++
            ) {
            
                if(num % i==0){
                System.out.println("Not prime no. as it is divisible by " + i);
                no_of_factors ++;
                break;
            }
        } if(no_of_factors==0) {
            System.out.println("the number is a prime number");
        }

 

        }


        
        
           }

}