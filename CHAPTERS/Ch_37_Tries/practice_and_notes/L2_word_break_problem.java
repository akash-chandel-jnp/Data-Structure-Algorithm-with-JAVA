import java.text.BreakIterator;

public class L2_word_break_problem{
    static class Node{ 
        Node children [ ] = new Node[26];
        boolean eod = false;  //end of word

    }

    public static Node root = new Node();


    public static void insert(String word){  
        Node curr = root;

        for(int level = 0; level <word.length(); level++){

            int idx = word.charAt(level)-'a'; 
            if(curr.children[idx] == null){ 
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx]; 
        }
        curr.eod = true; 
    }
    
    public static boolean search(String key){
        Node curr = root;     

        for(int level = 0; level <key.length(); level++){

            int idx = key.charAt(level)-'a'; 

            if(curr.children[idx] == null){  
                return false;
            } else {
            
                curr = curr.children[idx]; 
            } 
        }
        return curr.eod = true;
    } 

    public static boolean wordBreak(String key){
        // first make a small prefix and search for it , if it is found the for the remaining part call the recursive function
        // if both are true then return ok , otherwise increase the size of the prefix and decre..

        if(key.length() == 0){
            return true;
        };

        for(int i= 1; i<= key.length(); i++){
            String prefix = key.substring(0, i);  //preifix = "i"
            String remaining_word = key.substring(i);  // remaining = "like"

          if( search(prefix) && wordBreak(remaining_word)){                      |
               return true;
           }
        }
        return false;
    }

    public static void main(String[] args) {
        String arr[] = {"i", "like" , "sam", "samsung" , "mobile", "ice"};

        for (String s : arr) {
            insert(s);
        }

        String key = "ilike";
        System.out.println(wordBreak(key));
    }
}