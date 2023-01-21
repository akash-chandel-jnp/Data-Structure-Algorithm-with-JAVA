public class P1_bubbleSort {

    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        
        bubbleSort(arr);
        print_arr(arr);

        int[] sorted_arry = {10,20,30,40};
        print_arr(sorted_arry);
    }
    
    //print array
    public static void print_arr(int [] arr){
        for(int i=0; i<=arr.length-1;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    


    //nested for loop  --> time O(N^2) --> space (temp variable) --> O(1) 
    public static void  bubbleSort(int [] arr){
        int n = arr.length;int temp; 
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<=n-1;j++){
                if(arr[j]<arr[i]){ // send the smaller item to left
                    //swap
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }   
        
                    
                }

    // modified bubble sort --> checking at one loop whether already sorted or not--> and stop at the moment when it is already sorted
    
    public static void  bubbleSort_mod(int [] arr){
        int n = arr.length;int temp; 
        for(int i=0;i<n-1;i++){
            boolean isSorted = true;
            for(int j=i+1;j<=n-1;j++){
                if(arr[j]<arr[i]){ // send the smaller item to left
                    //swap
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    isSorted =false;

                }
                if(isSorted = true){
                    break;
                }
            }
        }   
        
                    
                }            
}
