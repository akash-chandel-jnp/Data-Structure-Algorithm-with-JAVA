import java.util.ArrayList;

import javax.sound.sampled.SourceDataLine;

public class L10_a_PairSum_sorted_bruteForce {// arraylist is sorted
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=1; i<7; i++){
            nums.add(i);
        }
        System.out.println(nums);
        pairSum(nums, 5);
        System.out.println(pairSum(nums, 15));
    }
    public static boolean pairSum(ArrayList<Integer> nums,int targetSum){
        for(int i =0; i<nums.size();i++){
            for(int j =i+1; j<nums.size();j++){
                int sum = nums.get(i) + nums.get(j);
                if(sum == targetSum){
                    System.out.println( nums.get(i) + " and " + nums.get(j));
                    return true;

                }
            }
        }
        System.out.println("not found");
        return false;

    }
    }

