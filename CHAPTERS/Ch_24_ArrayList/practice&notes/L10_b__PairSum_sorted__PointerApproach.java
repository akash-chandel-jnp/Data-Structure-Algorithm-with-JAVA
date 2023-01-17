import java.util.ArrayList;
import java.util.random.RandomGenerator.LeapableGenerator;

import javax.swing.text.AbstractDocument.ElementEdit;

public class L10_b__PairSum_sorted__PointerApproach {// arraylist is sorted
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=1; i<7; i++){
            nums.add(i);
        }
        System.out.println(nums);
        // pairSum(nums, 5);
        System.out.println(pairSum(nums,10));
    }
    public static boolean pairSum(ArrayList<Integer> nums,int targetSum){
        int left =0;
        int right = nums.size()-1;
        for(int i=0; i<nums.size()-1;i++ ){
            int sum = nums.get(left) + nums.get(right);
            if(sum == targetSum){

                System.out.println((nums.get(left) +" and " + nums.get(right)));
                return true;
            }
            if(sum > targetSum){
                right--;
            }else{
                left++;
            }
        }return false;
        
      

    }

    
}
