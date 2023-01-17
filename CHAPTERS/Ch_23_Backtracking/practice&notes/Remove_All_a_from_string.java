public class Remove_All_a_from_string {
    public static void main(String[] args) {
        String str = "badapaav";
        remove_key(str, 'a', "", 0);
    }

    // remove the key from string funciton
    static void remove_key(String str, char ch, String ans, int i){

        //base case
        if(i==str.length()){
            System.out.println(ans);
            return;
        }

        //recursion
        if(str.charAt(i)==ch){
            // System.out.println("matched "+ i);
            remove_key(str, ch, ans, i+1); //ans b i=2

        }else{
            // System.out.println("not matched" + i);
            remove_key(str, ch, ans + str.charAt(i), i+1); // ans = "b" i=1

        }
        
            

        }
        
    }


