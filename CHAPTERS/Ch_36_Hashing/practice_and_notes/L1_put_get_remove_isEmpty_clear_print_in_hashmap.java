import java.util.HashMap;

// hashmap are collection framework-- > 

public class L1_put_get_remove_isEmpty_clear_print_in_hashmap{
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        //keys are unique
        //values need not be unique


        // insert -- O(1)
        hm.put("india", 100);
        hm.put("china", 150);
        hm.put("US", 50);
        hm.put("russia", 300);
        hm.put("france", 200);
        hm.put("newzeland", 200);


        System.out.println(hm);
        // note : hashmap are unordered maps, i.e. they are in random order and output is not necessary in same order

        //get -O(1)
        // it return value  corresponding to input "key"-- > if "key" is not present , it will return as null ;

       System.out.println( hm.get("india")); // 100
       System.out.println( hm.get("japan")); // null
       
       //containsKey -- O(1)
       // check whether a given key is present in the map of not --. true or false

       System.out.println(hm.containsKey("india")); //true
       System.out.println(hm.containsKey("japan")); // false


       //remove("key") --O(1)
       //it will remove the above key and its value from the map, and returns the value of that key--> just like pop function
       //if key is not present in the map then it returns -- null

       System.out.println(hm.remove("china")); //150
       System.out.println(hm.remove("pakistan")); //null
       System.out.println(hm.get("china")); // null -- as it was removed

        //size--> O(1) --> returns the size of hashmap 
        System.out.println(hm.size());

        // isEmpty -- checks whether hashmap is empty or not
        System.out.println(hm.isEmpty());

        //clear -- > clears the data in hashmap --> not deletes the hashmap-- just make it empty
       hm.clear();
       System.out.println(hm.isEmpty());
    }
    
}