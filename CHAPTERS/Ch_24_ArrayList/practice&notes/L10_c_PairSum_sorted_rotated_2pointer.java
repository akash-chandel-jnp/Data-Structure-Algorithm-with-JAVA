import java.lang.annotation.Target;
import java.util.ArrayList;

public class L10_c_PairSum_sorted_rotated_2pointer {
    public static void main(String[] args) {
        
    ArrayList<Integer> nums = new ArrayList<>(); // 11,15,6,8,9,10
    nums.add(11);    
    nums.add(15);    
    nums.add(6);    
    nums.add(8);    
    nums.add(9);    
    nums.add(10);    
    // System.out.println(nums);
    System.out.println(pairSum_rotated(nums, 40));



    }
    public static boolean pairSum_rotated(ArrayList<Integer> nums , int target){
        int bp =-1 ; 
        int n = nums.size();
        // breaking point --from where loop breaked sorting in our case , 15 is the breaking point.
        //find the breaking point
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)>nums.get(i+1)){ // at breaking point next element will be smaller than the current element;
                bp=i;
                break;
            }
        }
        /*  the num at the bp will be largest and next elemnt will be the smallest in the array.
         so bp will be our rp( right pointer ) and the next elemt will our lp ;
         we wil check the sum of rp and lp :
            case1) sum = target: stop ;
            case2) sum < target; lp ++ (but after the end it should rotate back to starting index so use modulo pproerty to limit the value upto n)

            case3) sum > target : rp-- ;
        */
        int rp = bp;    // largest
        int lp = bp +1; // smallest

        while(lp!=rp){
            //case 1
            if(nums.get(lp)+nums.get(rp)== target){
                return true;
            }

            //case2) sum < target ;
            if(nums.get(lp)+nums.get(rp) < target){
                lp = (lp +1)%n;

            } else { //case3) sum > target;
                rp = (n+rp-1)%n;

            }
            
            
        }
        return false;


        }

        
    }
    

