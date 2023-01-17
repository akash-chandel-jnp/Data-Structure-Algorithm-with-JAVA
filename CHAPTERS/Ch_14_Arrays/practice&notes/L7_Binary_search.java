import javax.swing.text.html.StyleSheet;

public class L7_Binary_search {
    public static void main(String[] args) {
        int numbers[] = {23,45,56,67,78,89,96,123,234,346};
        // find the index of 56 in the arrray using binanry search not linear search
        // as the array is already sorted , only then we can use binary search otherwise we can only apply linear search

        int start= 0; // starting index
        int end = numbers.length-1; // end index
        int num_to_search = 78;
        
        while(start<=end){
            int mid = (start+end)/2;
            if( num_to_search == num_to_search[mid]){
                int index =  mid;
                break;
            }
            
            if(num_to_search>numbers[mid]){
                start = mid;
            }else{end =  mid;}

    }
    System.out.println(numbers[start]);

}}
