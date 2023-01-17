public class L2_subsets_string {
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str,"", 0);

    }

    //*******************subset string function************* */
    public static void findSubsets(String str, String ans, int i){ // int i is like where is my index or which letter am i asking , whether it want to be part of subset or not

        // base case -- > all char have given their yes or no about their choices.

        if(i == str.length()){
            if(ans.length()== 0){
                System.out.print("null" );
                
            }else{
                System.out.print(ans + " ");
                
            }
            return;
        }
        // recursions
        //yes choice
        findSubsets(str, ans + str.charAt(i), i+1);

        // no choice
        findSubsets(str,ans, i+1);


    }
}
