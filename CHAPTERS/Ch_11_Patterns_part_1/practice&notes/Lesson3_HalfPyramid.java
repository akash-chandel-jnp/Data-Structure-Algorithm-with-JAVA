/*write a program to print half pyramid like below
1
12
123
1234
12345

*/

public class Lesson3_HalfPyramid {
    public static void main(String[] args) {
        int totalLine =5;
        for (int line = 1; line<=totalLine; line++){
            for (int num=1; num<=line; num++){
                System.out.print(num);
            }
            System.out.println("");
        }
    }
    
}
