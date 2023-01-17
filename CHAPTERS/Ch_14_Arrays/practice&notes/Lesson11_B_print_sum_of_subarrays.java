public class Lesson11_B_print_sum_of_subarrays {
   
        public static void sub_arrays_creator(int numbers[]){
            int count_subarrays =0;
            for (int i =0; i< numbers.length; i++){
                int start = i;
                for (int j=i; j< numbers.length ; j++){
                   
                    int end = j;
                    int subarray_sum = 0;
                    for (int k= start; k<= end; k ++){
    
                        System.out.print(numbers[k]  +" ");
                        subarray_sum = subarray_sum + numbers[k] ;
                    }
                    System.out.println("( subarray sum = " + subarray_sum +"  )");
                    System.out.println();
                    count_subarrays++ ; // counter placed after each printing loop is finished
                    
                    System.out.println( );
                }   
                System.out.println();
            }
            System.out.println(" Total number of subarrays of given array is : " + count_subarrays);
        };
        
        
        public static void main(String[] args) {
            int numbers[] = { 2,4, 6, 8 , 10};
    
            sub_arrays_creator(numbers);
            
    
        }
        
    
}
