import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class Lesson6_Largest_Smallest {
    public static int largest_finder(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i =0; i < numbers.length; i++){
            if(numbers[i]> largest){
                largest = numbers[i];

            }
        }return largest;
    }


    public static int smallest_finder(int numbers[]){
        
        int smallest = Integer.MAX_VALUE;

        for (int i =0; i < numbers.length; i++){
            if(numbers[i]< smallest){
                smallest = numbers[i];

            }
        }return smallest;
    }


    
    
    
    public static void main(String[] args) {
        int numbers[] = { 23,45,12,89,36 };
        // find out the smallest and the largest in the above array

        System.out.println(" The largest number in the array is : " + largest_finder(numbers) );
        System.out.println(" the smallest number in the array is : " + smallest_finder(numbers));


    }
}
