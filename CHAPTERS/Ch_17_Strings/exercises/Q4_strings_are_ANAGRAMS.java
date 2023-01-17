public class Q4_strings_are_ANAGRAMS{
    public static boolean anagrams_or_not( String str1, String str2) {
        if(str1.length() == str2.length()){

            for (int i =0; i<str1.length(); i++){ 
                char ch1 = str1.charAt(i) ;
                int count =0;
                for(int j=0; j<str2.length(); j++){
                    char ch2 = str2.charAt(i) ;

                    if(ch1 == ch2){
                        count +=1;
                    }
                }
                if(count ==0){
                    // System.out.println("failed " +count + "i is :  "+ i + "j is : " + j );
                    return false;
                }    

        }System.out.println("success");
        return true;

        }else {
            System.out.println("strings are of unequal length ");
            System.out.println("FAILED");
            return false;
        }


    }
    
    public static void main(String[] args) {
        String str1 = "care" ;    
        String str2 = "erac" ;

        System.out.println(anagrams_or_not(str1, str2));
    }
}