public class L1_creating_Tries{
    static class Node{ 
        Node children [ ] = new Node[26];
        boolean eod = false;  //end of word

        // Node(){  // making 26 pointers as null , although not need as by it is null
        //     for(int i =0; i<26;i++){
        //         children[i] = null;
        //     }
        // }
    }

    public static Node root = new Node();

//
    public static void insert(String word){  // O(L) --> L is the length of the largest word.
        Node curr = root;                      // creating a pointer which is initially pointing at root node 

        for(int level = 0; level <word.length(); level++){

            int idx = word.charAt(level)- 'a'; // finding index of char in children array
            if(curr.children[idx] == null){ // checking if at curr node this character does not exist 
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];  // shifitng curr pointer to newly created node.
        }
        curr.eod = true; //when the word is finished (i.e. for loop is finished)-> setting eod boolean as true
    }   



    // creating a search function for trie to search whether a given key exist in trie or not.
    public static boolean search(String key){
        Node curr = root;                      // creating a pointer which is initially pointing at root node 

        for(int level = 0; level <key.length(); level++){

            int idx = key.charAt(level)- 'a'; // finding index of char in children array

            if(curr.children[idx] == null){ // checking if at curr node this character does not exist 
                return false;
            }else{
            // shifitng curr pointer to next level.
                curr = curr.children[idx]; 
            } 
        }
        return curr.eod = true;
    } 



    public static void main(String[] args) {
        String words[] = {"the","a" , "there" , "their" , "any" , "thee"}; // we want to insert them into trie

        //****************calling insert function to insert these arrays of words into trie */
        for (int i =0; i<words.length ; i++){
            insert(words[i]);
        }

        System.out.println(search("there"));
        System.out.println(search("thor"));

        
    }
}