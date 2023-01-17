import java.util.Scanner;
public class Q5_Equation_quadratic_solve {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("enter the value of a:  ");
        int a = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("enter the value of b:  ");
        int b = input2.nextInt();
        

        Scanner input3 = new Scanner(System.in);
        System.out.println("enter the value of c:  ");
        int  c= input3.nextInt();

        double discr = (b*b - 4*a*c);

        if (discr >= 0 ) {
            double root1 = (-b + Math.sqrt(discr))/(2*a);
            double root2 = (-b - Math.sqrt(discr))/(2*a);

            System.out.println("roots of the equation are : \n "+ "root1 is : " + root1 +"\n" + "root2 is : " + root2 );
        }
        else{
            System.out.println("no real roots are present");
        } 


    
    }
}
