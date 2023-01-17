//Question 1 :Write a Java method to compute the averageof three numbers..

import java.util.Scanner;

public class Q1_average{
    public static double average_3Nums(double a , double  b, double c){
        double aver = (a + b + c)/3;
        return aver;
        }
    
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter 1st number : ");
            double num1 = sc.nextInt();

            System.out.print("Enter 2nd number : ");
            double num2 = sc.nextInt();

            System.out.print("Enter 3rd number : ");
            double num3 = sc.nextInt();    

            System.out.println(" the average of the numbs is : " + average_3Nums(num1, num2, num3));
            sc.close();// closing scanner
        }


    }
    