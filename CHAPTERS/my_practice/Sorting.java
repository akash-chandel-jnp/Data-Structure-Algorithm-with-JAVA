/*
 bubble sort--
 start from first element and compare with next one , if first is greater than next one then swap, else move to next index; at the end of the array for after the first pass last element will be largest.
 repeat the process but now dont compare with the last as alredy at right position
 */
public class Sorting{

    public static void bubbleSort(int [] arr){
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = arr[temp];
                    
                }

            }
        }
        // for (int i = 0; i < arr.length; i++) {
        //     // swapped = false;
        //     // for each step, max item will come at the last respective index
        //     for (int j = 1; j < arr.length - i; j++) {
        //         // swap if the item is smaller than the previous item
        //         if (arr[j] < arr[j-1]) {
        //             // swap
        //             int temp = arr[j];
        //             arr[j] = arr[j-1];
        //             arr[j-1] = temp;
        //             // swapped = true;
        
        //         }
            
            }

    public static void main(String[] args) {
        int arr[] ={4,3,5,8,9,6};  
        bubbleSort(arr);     
    }
}