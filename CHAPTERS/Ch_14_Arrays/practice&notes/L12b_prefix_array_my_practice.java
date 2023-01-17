public class L12b_prefix_array_my_practice {
    public static void maxSumSubArray_prefix(int numbers[]){
        int max_sum = Integer.MIN_VALUE;
        int prefix_arr[] = new int[numbers.length];
        prefix_arr[0] = numbers[0];
        for(int i = 1; i<numbers.length;i++){
            prefix_arr[i] = prefix_arr[i-1] +numbers[i];
        }

        for (int i = 0;i<numbers.length; i++){
            int start = i;
            int curr_sum = 0;
            for (int j = i; j <numbers.length;j++){
                int end =j;
                if(start ==0){
                    curr_sum =prefix_arr[end];
                }else{
                    curr_sum = prefix_arr[end] - prefix_arr[start-1];
                }

                // keep updating max_sum
                if(max_sum < curr_sum){
                    max_sum = curr_sum;
                }

                System.out.println(curr_sum);
            }
            System.out.println(); // for next line

        }
        // after alll the loop is over : print max_sum
        System.out.println("max sum is : " + max_sum );
    }
 
 
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,12};

        maxSumSubArray_prefix(numbers);
    }
    
}
