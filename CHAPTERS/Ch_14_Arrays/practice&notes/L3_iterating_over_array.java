// this technique can be used for arrays as well as for arraylist also.

public class L3_iterating_over_array {
    public static void main(String[] args) {
        int numbers[ ] = { 2,4,6,8,10,12 }; 
        
        for(int i: numbers){  // iterate over each element of array
            System.out.print(i + " ");
        }
        
    }
    
}
