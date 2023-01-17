public class L14_Compress_string {
    public static String compress(String str){
        for(int i =0; i< str.length(); i++){
            Integer count =1; // have to convert it into string so already created as object 
            while(i< str.length()-1 && str.charAt(i)== str.char(i+1)){
                count++;
                i++;
                
            }
        }
    } 


public static void main(String[] args) {
    String str = "aaabbcccdd";
}

}

