

public class Q1_index_listing_of_key{

    public static void indexes_of_key( int arr [] , int key, int i){
        
        if( i==arr.length){ // if index is finished
            System.out.println(" completed");
            return ;
        }
        if(arr[i]== key){ // if current index par hai then print index 
            System.out.println(i + " ");
            
        }
        indexes_of_key(arr, key, i+1); // check for next index by calling the function itself.

    }


    public static void main(String[] args) {
        int arr[ ] = { 4,5,3,5,2,6,5};
        int key = 5;
        indexes_of_key(arr, key, 0) ; // as the functions is not returning anything so cant use print command ; function itself prints when key matches;
        

    }
}