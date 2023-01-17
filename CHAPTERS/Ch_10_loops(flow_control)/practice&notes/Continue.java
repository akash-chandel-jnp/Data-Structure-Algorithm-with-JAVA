import java.util.Scanner;
public class Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();

        for(int i=1;i<=num;i++){
            if(i==3){
                continue;  // to skip loop for this iterator value and go back to for loop for the next i;

            }
                
        }
        
        System.out.println("the loop end here");


    }
 }
    

