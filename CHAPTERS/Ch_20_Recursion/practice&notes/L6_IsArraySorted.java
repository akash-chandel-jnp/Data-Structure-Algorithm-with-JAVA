public class L6_IsArraySorted {
    // public static boolean isArraysorted_for_loop(int arr[] ){
    //     // using loop method 
    //     for (int i= 0; i<arr.length-1; i++){
    //         if(arr[i]>arr[i+1]){

    //             return false;
    //         }
    //     }
    //     return true;
    //     }
        
    public static boolean isArraySorted_recursion(int arr[],int i) {
        if (i==arr.length-1){ // base case when i is the last element   
            return true;
        }
        if(arr[i] > arr[i +1]){
            return false;
        }
        return isArraySorted_recursion( arr ,  i+1);
        
    }
       

    public static void main(String[] args) {
        int arr[] = {2,5,7,10,13,16,17,15};
        
        // System.out.println(isArraysorted_for_loop(arr));
        System.out.println(isArraySorted_recursion(arr , 0 ));
    }

}