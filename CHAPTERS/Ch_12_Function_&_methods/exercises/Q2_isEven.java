//Write a method named isEven that accepts an int argument.The method should return true if the argument is even,or false otherwise.Also write a program to test your method


import java.util.Scanner;

public class Q2_isEven{
    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number ");
        int num1= sc.nextInt();
        System.out.println("is the number " + num1 + " a Even number  ? :  " + isEven(num1));

         
    }
}