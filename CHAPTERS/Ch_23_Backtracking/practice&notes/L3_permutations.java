public class L3_permutations {
    public static void main(String[] args) {
        String str = "abc";

        findPermutation(str, "");
        
    }

    public static void findPermutation(String str , String ans){
        //base case: --> when all char have been inccluded in ans and str is empty
        if ( str.length() ==0){
            System.out.println(ans);
            return;

        }



        //recursions
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);

            //removing the char from the str which has been selected ; // "abcde" => "ab" + "de" 
            // but for this new string should be created otherwise len of str will decrease and loop for loop will end early.


            String newstr = str.substring(0, i) + str.substring(i+1); // i.e not selecting char at position i
            findPermutation(newstr, ans + curr);



        }


    }
    
}
