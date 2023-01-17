public class L3_Printing_array {
    public static void main(String[] args) {
        int numbers[ ] = { 2,4,6,8,10,12 }; 
        // 6 items --> 
        /*  6 items in array:
                                
            way 1) iterate from 0 to 5  (length- 1) or for (int i= 0 ; i<  numbers.length;   i++)
            way 2) iterate from 0 to 5  (length- 1) or for (int i= 0 ; i<= numbers.length-1; i++)
            way 3) iterate from 1 to 6  (1 to len)->or for (int i=1  ; i<= numbers.length ; i++) 
            
        */
        for (int i =0; i<numbers.length ; i++){
            System.out.print(numbers[i] + " ");
        }
        
    }
    
}
