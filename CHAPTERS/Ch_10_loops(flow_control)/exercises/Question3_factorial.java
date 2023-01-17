/*
 find the factorial of any number
 */
import java.util.Scanner;
public class Question3_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbe  01r whose factoial you want to find ");
        int num = sc.nextInt();
        int factorial = 1 ; 
        int i =1;
        while  (i <= num){
            factorial *= i ;
            i += 1 ;
        }
        System.out.println("The value of " + num + "! is " + factorial);

    }
 }

 