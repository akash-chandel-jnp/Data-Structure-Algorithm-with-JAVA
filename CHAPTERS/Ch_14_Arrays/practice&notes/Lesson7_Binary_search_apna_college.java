public class Lesson7_Binary_search_apna_college {
    public static int binary_search(int numbers[], int key){
        int start = 0;
        int end = numbers.length -1;

        while ( start <= end){
            int mid = (start + end)/2;

            // comparisions 
            if (numbers[mid] == key ){  // when key is found
                return mid;
            }

            if (numbers[mid] < key){  // right 
                start = mid +1;
            } else {  // left 
                end = mid - 1;}
            
            }
            return -1; // if key not found in array
        } 

        public static void main(String[] args) {
            int numbers [ ] = {2 , 4 , 6 , 8 , 10 , 14 };
            int key = 10;
             

            System.out.println(" index for the key is " + binary_search(numbers, key));
        }
                
            
    
}