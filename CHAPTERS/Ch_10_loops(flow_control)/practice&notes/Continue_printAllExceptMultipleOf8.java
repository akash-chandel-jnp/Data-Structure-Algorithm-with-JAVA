import java.util.Scanner;
public class Continue_printAllExceptMultipleOf8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("enter the number");
            int num = sc.nextInt();

            if(num % 8 ==0){
                System.out.println("the number you entered is multiple of 8 ");
                continue;
            

            }System.out.println("the num you entered is : " + num);
            

        }while(true);
    }
    
}
