// print the avg marks of 5 subjects

import java.util.Scanner;
public class AVG_OF_25_NUM{
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        
        while (i<=5){
            
            Scanner input = new Scanner(System.in);
            System.out.println("enter the marks");
            int marks = input.nextInt();
            sum = sum + marks;
            i =i+1;

            
        }
        int avg = sum/5;
        System.out.println("avg marks of 5 exams is  : " + avg);

    }
    
}