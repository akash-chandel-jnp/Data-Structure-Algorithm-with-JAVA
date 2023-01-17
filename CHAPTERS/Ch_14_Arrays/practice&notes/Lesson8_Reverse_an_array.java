import javax.swing.SpinnerDateModel;

public class Lesson8_Reverse_an_array {
    public static void reverse_array( int numbers[]){
        int first =0 , last = numbers.length - 1;
        while (first < last){
            int temp ;
            temp = numbers[first];
            numbers[first]= numbers[last];
            numbers[last] = temp;
            
            first++ ; last--;
            
        }
    }
    
    public static void main(String[] args) {
        int numbers [] = { 2, 4,6,8,10,12};

        reverse_array(numbers);
        
        // print the reverse array
        // System.out.print("[ ");


        for (int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        // System.out.print(" ]");
    }
    
}
