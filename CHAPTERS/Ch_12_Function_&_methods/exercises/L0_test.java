import java.util.Scanner;;
public class L0_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("Pls enter the number : ");
        int num = sc.nextInt();
        System.out.println(isPalindrome(num));
        sc.close();

        
    }

    public static boolean isPalindrome(int num){
        int n = num;
        int reversedNum = 0;
        

        while(n !=0){
            int lastDigit = n % 10;
            reversedNum = reversedNum*10 + lastDigit;
            n = n /10;

        }
        if(reversedNum == num){
            return true;
        }else { 
            return false;
        }
    }
}