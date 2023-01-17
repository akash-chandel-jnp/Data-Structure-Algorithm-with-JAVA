public class L11_A_Subarrays {
    public static void sub_arrays_creator(int numbers[]){
        int count_subarrays =0;
        for (int i =0; i< numbers.length; i++){
            int start = i;
            for (int j=i; j< numbers.length ; j++){
                int end = j;
                for (int k= start; k<= end; k ++){

                    System.out.print(numbers[k]  +" ");
                }
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
