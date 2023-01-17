public class L6_isPalindrome {
    public static boolean isPalindrome(String str){
        for (int i = 0; i<str.length(); i++){
            if(str.charAt(i) != str.charAt((str.length()-1 - i))){
                return false ;
            };
        }return true;
    }
    
    
    
    public static void main(String[] args) {
        String str = "carrac" ; 
        // check if the string is palindrome or not 
        isPalindrome(str);
        
        
    }
    
}
