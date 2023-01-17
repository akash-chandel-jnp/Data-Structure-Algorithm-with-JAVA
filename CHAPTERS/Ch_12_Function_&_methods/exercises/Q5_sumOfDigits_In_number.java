import java.util.Scanner;


public class Q5_sumOfDigits_In_number {
    public static int sumOfDigits(int a ){
        int sum_of_digit = 0;
        int last_digit = 0;
        // while ( a >0){
        //     last_digit = a%10 ;
        //     sum_of_digit = sum_of_digit + last_digit;
        //     a = a/10;

        // }





        for ( ;a>0;a/=10 ){
            last_digit = a%10 ;
            sum_of_digit = sum_of_digit +last_digit;
            a = a/10;
        }
        return sum_of_digit;
    }
    
    
    
    public static void main (String args[]){
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the number :  ");
        int num1 = sc.nextInt();

        int sum_digits = sumOfDigits(num1);
        System.out.println(" the sum of the digits of the number is : " + sum_digits);


    }
    
}
