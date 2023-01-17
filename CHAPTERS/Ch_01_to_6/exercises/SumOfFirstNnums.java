import java.util.Scanner;

public class SumOfFirstNnums{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("enter the number");
        int num = input.nextInt();
        int sum = 0;
        int i = 1;
        while ( i<= num){
            sum = sum + i;
            i++;
        }
        System.out.println("sum of the first " + num + "natural numbers is :  " + sum);
    }
}