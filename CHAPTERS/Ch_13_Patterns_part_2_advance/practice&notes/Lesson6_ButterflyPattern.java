/*

            *        *
            **      **
            ***    ***
            ****  ****
            **********
            **********
            ****  ****
            ***    ***
            **      **
            *        *
            
 */


public class Lesson6_ButterflyPattern {
    public static void print_butterfly(int n ){
        
        //printing upper half
        for (int i =1;i<=n;i++){
            //print stars
            for (int j =1; j<=i; j++){
                System.out.print("*");

            }
            // print spaces
            for (int j=1;j<= (2*(n-i)); j++){
                System.out.print(" ");
            }
            // print stars
            for (int j =1; j<=i; j++){
                System.out.print("*");

            } System.out.println(); // go to next line
        }

        // printing bottom half
        for (int i =n;i>=1;i--){  // only outer loop is reversed ; now going from n to 1 ; other conditions are same
            //print stars
            for (int j =1; j<=i; j++){
                System.out.print("*");

            }
            // print spaces
            for (int j=1;j<= (2*(n-i)); j++){
                System.out.print(" ");
            }
            // print stars
            for (int j =1; j<=i; j++){
                System.out.print("*");

            } System.out.println(); // go to next line
        }


    }

        public static void main(String[] args) {
            print_butterfly(5);
            
        }            
    }
    

