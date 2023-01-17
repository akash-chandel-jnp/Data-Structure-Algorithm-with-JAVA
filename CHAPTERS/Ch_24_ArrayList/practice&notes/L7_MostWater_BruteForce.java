import java.util.ArrayList;

public class L7_MostWater_BruteForce{
    public static void main(String[] args) {
        ArrayList<Integer> wallHeight =new ArrayList<>();
        wallHeight.add(1);
        wallHeight.add(8);
        wallHeight.add(6);
        wallHeight.add(2);
        wallHeight.add(5);
        wallHeight.add(4); 
        wallHeight.add(8);
        wallHeight.add(3);
        wallHeight.add(7);
        System.out.println(" wallheight " +  wallHeight);

        
        int maxWater=Integer.MIN_VALUE;
       
        for(int i = 0; i<wallHeight.size();i++){
            for(int j =i+1;j<wallHeight.size();j++){
                 int waterHeight = Math.min(wallHeight.get(i), wallHeight.get(j)); 
                 int waterWidth = j-i;
                 int waterVolTrap = waterHeight*waterWidth;
                 maxWater = Math.max(maxWater, waterVolTrap);
            }
        }
        System.out.println(maxWater);
    }
}

// TIME COMPLEXITY IS O(n)  