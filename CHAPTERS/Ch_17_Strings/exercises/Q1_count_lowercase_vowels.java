public class Q1_count_lowercase_vowels{
    public static int lowercase_vowel_count(String str){
        int count =0;
        for (int i =0; i<str.length() ; i++){
            char ch = str.charAt(i);
            if((ch == 'a')|| (ch == 'e' )|| (ch == 'i') || (ch == 'o') ||(ch  == 'u')){ //no need to compare it with the Capital vowels as only asked to fing lower case vowels;
                count++ ;
                
            }
            
    }
    System.out.println(" the no. of vowels are :  " + count);
    return count;
    }
    
    
    public static void main(String[] args) {
        String str = "I am A very GoOd SingEr" ;
        lowercase_vowel_count(str);

        
    }
}