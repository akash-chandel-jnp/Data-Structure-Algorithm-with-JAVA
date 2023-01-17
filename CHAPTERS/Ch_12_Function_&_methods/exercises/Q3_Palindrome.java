import java.util.Scanner;

/* 
Write a Java program to check if anumber is a palindrome in Java? (121 is a palindrome, 321 is not)
we can divide this task into two parts :
 *  first write a method which will reverse a number 
 * then write a method which will call the above function to reverse the num and the compare it with original no. and give result whether it is palindrome or not
 
 */

 /*                                         solution                                                 */
 public class  Q3_Palindrome{
    public static int reverse_num(int b){
        int rev_number =0;
        int last_digit;
        while (b >0){
            last_digit = b%10;
            rev_number = rev_number*10 + last_digit;
            b = b /10;
        }
        System.out.println(" the reverse num is " + rev_number);
        return rev_number;
        
    }
    
    
    public static boolean isPalindrome(int a){
        if (a / reverse_num(a) ==1){
            return true;
        }
        else{
            return false;
        }
        }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :  ");
        int num = sc.nextInt();
        System.out.println(isPalindrome(num));

    }
 }