public class Lesson12A_max_subarray_sum_BruteForce{
    public static void maxSubarraySum(int numbers[]){
        int currSum =0;
        int maxSum = Integer.MIN_VALUE; // - infinity (negative)


        for ( int i=0; i <numbers.length; i++){
            int start = i;
            for (int  j=i; j<numbers.length; j++){ 
                int end = j;
                currSum = 0;

                for ( int k = start; k <=end ; k++){
                    currSum += numbers[k]; // curent_sum me har baar i to j tak se saare element every loop me add kar denge to get subarray sum 

                }
                System.out.println(" the curr_sum is :  " + currSum);
                if (maxSum < currSum){
                    maxSum = currSum;
                }
            }

        }
        System.out.println(" the max_sum is :  " + maxSum);
    }
    

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12};

        maxSubarraySum(numbers);

    }
}