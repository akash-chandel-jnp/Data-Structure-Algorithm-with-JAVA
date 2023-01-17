/*write a program to print full pyramid like below
     1
    121
   12321
  1234321
 123454321
outer loop 5 times---- (inner loop1--1 to line no.)--(inner loop2--from line no. to 1)  */

public class Lesson3_full_pyramid_without_star {
    public static void main(String[] args) {
        int totalLine = 5;
        for (int line = 1; line <=totalLine; line++){
            for(int star1=1; star1<=totalLine-line;star1++){
                // System.out.print("*");
                System.out.print(" ");

            }

            for (int num =1; num<=line;num ++){
                System.out.print(num);
            }

            for(int num2=line-1; num2>=1;num2--){
                System.out.print(num2);
            }


            // this loop is not need now
            // for(int star2=totalLine-line; star2>=1;star2--){
                // System.out.print("*");}

            System.out.println("");

        }
        
    }

    
}
