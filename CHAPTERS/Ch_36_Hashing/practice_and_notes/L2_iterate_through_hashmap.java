/*  
  https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/
  
 */


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class L2_iterate_through_hashmap {
    public static void main(String[] args) {

        HashMap<String, Integer> hm=new HashMap<>();
        hm.put("india", 100);
        hm.put("china", 150);
        hm.put("US", 50);
        hm.put("russia", 300);
        hm.put("france", 200);
        hm.put("newzeland", 200);




         
//to iterate over hashmap -- we call a function keySet() -- this keySet function will return all the values of keys of hashmap -- we will store these values in another type of data structure Set 


// Set<String> keys = hm.keySet();  // Sets are also a collections frameworks... and are unordered
System.out.println(hm.keySet());
// System.out.println(keys);


//now we can iterate over this set
// for (String k : keys) {
//     System.out.println("key = "+ k + " , value = " + hm.get(k));
    
// }


//we could also use hm.entrySet() at place of keySet  -- it will return key and value pair sets
Set<Map.Entry<String,Integer>> key_valu_pair = hm.entrySet();
System.out.println("hi" +(key_valu_pair));
// System.out.println( hm.entrySet() );
    }
    
}
