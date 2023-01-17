import javax.print.attribute.standard.RequestingUserName;

public class L5_binarySearch_find_an_item_in_array {
    public static int index_finder(int numbers[ ], int num_to_search){
        
        for (int i =0; i< numbers.length ; i ++){
            
            if (numbers[i] == num_to_search){
                return i;
            } 
        }
        return -1;
    }
            
    
    public static void main(String[] args) {
        int numbers[ ] = {23,56,78,65,48,32};
        int num_to_search = 65;
        // find index of 65
        int index = index_finder(numbers, num_to_search);
        if(index == -1){
            System.out.println(num_to_search + " is NOT found");
        }else{
            System.out.println("the index of " + num_to_search + " is " + index);
        }
    
    }
}
