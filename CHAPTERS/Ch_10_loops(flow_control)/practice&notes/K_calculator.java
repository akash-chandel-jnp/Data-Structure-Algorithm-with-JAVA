import java.util.function.DoubleUnaryOperator;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;
public class K_calculator {
    public static void main(String[] args) {
        calculate();
                
    }
    
    // public static void calculate(double a, char operator, double b  ){
    public static void calculate(){
    
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first operand");
        double a = sc.nextDouble();
 
        System.out.println("Enter the operator");
        char operator = sc.next().trim().charAt(0);
 
        System.out.println("Enter second operand");
        double b = sc.nextDouble();
        while(true){

            if(operator == '+' || operator == '-' || operator == '*' || operator == '/'){
                
                if(operator== '+'){
                    System.out.println(a+b); 
                    
                }else if(operator== '-'){
                    System.out.println(a-b); 
                }
                else if(operator== '*'){
                    System.out.println(a*b); 
                }
            else if(operator== '/'){
                if(b != 0){

                    System.out.println(a/b); 
                }else{
                    System.out.println("Dr. cant be 0");
                    break;
                }
            }
            
            else if(operator== 'x' || operator == 'X'){
                System.out.println("invalid operator");
                break;

             
                }
                
                sc.close();
                
            } 
            else{ // if operator is other than mentioned above
                System.out.println("invalid operator ");
            }
            }
    }
        
        
        
        
    }

    

