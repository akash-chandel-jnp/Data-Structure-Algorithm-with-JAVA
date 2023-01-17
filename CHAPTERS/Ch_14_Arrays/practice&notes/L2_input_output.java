/*
// write a program to create an array of names of the students in a class by taking input from the user and change the name of 3rd entry ... also find the length of the array .
 */

 import java.util.Scanner;
 public class L2_input_output{
    public static void main(String[] args) {
        String names[]  = new String[50];
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your name :  ");
        
        names[0] = sc.nextLine();
        names[1] = sc.nextLine();
        names[2] = sc.nextLine();
        

        System.out.println("name of first student is :  " + names[0]);
        System.out.println("name of second student is :  " + names[1]);
        System.out.println("name of third  student is :  " + names[2]);
        System.out.println("name of forth student is :  " + names[3] + " which is default value java has added");

        System.out.println("total number of students in the class is " + names.length);


    }
 }