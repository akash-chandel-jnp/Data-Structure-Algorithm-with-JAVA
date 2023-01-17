public class Lesson12B_max_subarray_sum_PrefixArray{
    public static void maxSubarraySum(int numbers[]){
        int currSum =0;
        int maxSum = Integer.MIN_VALUE; // - infinity (negative)
        int prefix[] = new int[numbers.length];
        prefix[0] =numbers[0]; // as first prefix par formula apply nahi kar sakte as uske pahle se koi prefix tha hi nahi
        
        // filling the value in prefix array using loop 
        for (int i = 1; i < prefix.length; i++ ){
            prefix[i] = prefix[i-1] + numbers[i];

        }


        for ( int i=0; i <numbers.length; i++){
            int start = i;

            for (int  j=i; j<numbers.length; j++){ 
                int end = j;

                // currSum = prefix[end] - prefix[start-1]; // but this line will be false for start =0; so in case of start = 0 ; we will only do currsum = prefix[end ] ; so write as below using ternary operator..

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                System.out.println(currSum);

                // if(start ==0){
                //     curr_sum =prefix_arr[end];
                // }else{
                //     curr_sum = prefix_arr[end] - prefix_arr[start-1];
                // }

                
                System.out.println(" the curr_sum is :  " + currSum);
                if (maxSum < currSum){
                    maxSum = currSum;
                }
            }

        }
        System.out.println(" the max_sum is :  " + maxSum);
    }
    

    public static void main(String[] args) {
        int numbers[] = {1, -2 , 6, -1, 3};

        maxSubarraySum(numbers);

    }
}