public class L1_BubbleSorting{

    public static void bubbleSort(int [] arr){
        boolean isSwapped ;
        for(int i =0; i<arr.length;i++){
            isSwapped = false;
            for(int j =1; j<arr.length-i; j++){

                if(arr[j]<arr[j-1]){
                    // swap if element is smaller than previous element
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1] = temp;

                // swappig done so change isSwapped becomes true.
                isSwapped = true;
            }
            if(isSwapped==false){// array has sorted in this n counter.
                break;
            }
        }}
        // printing sorted array
        for (int k=0;k<=arr.length-1;k++){
            System.out.print(arr[k] +" ");
            
        }



            
                
    }

    public static void main(String[] args) {
        int arr [] ={ 45,65,89,23,29};
        bubbleSort(arr);
        
        
    }
}
