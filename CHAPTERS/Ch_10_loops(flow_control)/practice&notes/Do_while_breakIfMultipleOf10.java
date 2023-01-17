import java.util.Scanner;


public class Do_while_breakIfMultipleOf10 {
    public static void main(String[] args) {
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number");
            int num = sc.nextInt();
            if(num%10==0){
                System.out.println("you entered multiple of 10 .. loop broken");
                break;

            }else{
                System.out.println(num + " is not a multiple of 10");
            } 
        }while(true);

    }
}
