public class L1_backtracking_in_arrays{
    public static void main(String[] args) {
        int arr[ ] = new int[5];
        change_arr(arr, 0, 1);
         printArr(arr);
        
    }

    public static void change_arr(int arr[], int i, int val){
        // base case:
        if(i== arr.length){
            printArr(arr);
            return;
        }
        arr[i] = val;
        change_arr(arr, i+1, val+1);
        //backtracking
        arr[i] = arr[i] -2;
    }

    // ******************** printArr function ***********************************
    public static void printArr(int arr[]){
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] +" ");

        }
        System.out.println();
    }



}