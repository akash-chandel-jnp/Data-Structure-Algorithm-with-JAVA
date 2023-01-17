import java.util.Scanner;
public class Question2_mySolution {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;
        
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("enter the number");
            int num = sc.nextInt();

            if (num % 2 == 0 ){
                evenSum = evenSum + num ;
                
            
            } else {
                oddSum = oddSum + num ;}
            
                System.out.println("do you wish to continue: n for no and y for yes");
                
                String choice = sc.next();
                if (choice == "n"){
                    System.out.println(oddSum);
                    System.out.println(evenSum);
            
                    break;
                }
                



        }while (true);

        
    }
}
