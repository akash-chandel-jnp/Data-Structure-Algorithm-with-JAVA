import java.util.Scanner;
    public class Lesson3_parameter {
        public static int sumTwoNum(int num1,int num2){
            int sum = num1 + num2;
            return sum;
            
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers you want to add");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum1 = sumTwoNum(a, b); 
        System.out.println("Sum of the numbers is : " + sum1);
        
        
        /* notes :  sum variable in both the fucntion are different as they are defiined in different mehtods ; and also their scopes are also different , so their name may be kept same or different*/
    

}
}
