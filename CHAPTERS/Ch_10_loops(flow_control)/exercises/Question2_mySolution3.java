import java.util.Scanner;
public class Question2_mySolution3 {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;
        int choice = 1;
        
        while(choice == 1){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int num = sc.nextInt();

            if( num % 2== 0){
                evenSum +=num;
            }
            else { 
                oddSum += num;
            }

            System.out.println( "do you wnat to give next num : 1 for yes and 0 for no");
            Scanner ch = new Scanner(System.in);
            choice = ch.nextInt();



        }
        System.out.println("the sum of even numbers you enterd is : " + evenSum );
        System.out.println("the sum of even numbers you enterd is : " + oddSum );


        
        }
    }
