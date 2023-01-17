import java.util.Scanner;

public class Continue_skip_multipleOf8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        for (int i =1; i<=num;i++){
            if(i%8 == 0 ){
                continue;
                
            }
            System.out.println(i);
        }       
    }
    
}
