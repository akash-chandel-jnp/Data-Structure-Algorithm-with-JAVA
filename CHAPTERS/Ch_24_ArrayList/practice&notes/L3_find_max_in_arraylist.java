import java.util.ArrayList;

import javax.swing.undo.UndoManager;

public class L3_find_max_in_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(15);
        nums.add(18);
        nums.add(65);
        nums.add(12);
        nums.add(3);
        // System.out.println(nums);
        // int max =max_in_list(nums);
        // System.out.println(max);
        int max = nums.get(0);
        for(int i= 0; i<nums.size(); i++){
            // if(max < nums.get(i)){
            //     max =nums.get(i);

            max= Math.max(max, nums.get(i));
            }

            System.out.println(max + " is the max num");
        }
            
    
    // public static int max_in_list(ArrayList nums){
    //     int max = nums.get(0);
    //     for(int i= 0; i<nums.size(); i++){
    //         if(max < (int)nums.get(i)){
    //             max =(int)nums.get(i);
    //         }

        // }
        // return max;


    }
    

