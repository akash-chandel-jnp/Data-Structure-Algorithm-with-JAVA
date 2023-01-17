public class L10_Largest_string_in_arrayOfStrings {
    public static String largest_string(String fruits[]){
        String larg_str = fruits[0];
        for(int i =0 ;i<fruits.length ; i++ ){
            if (larg_str.compareTo(fruits[i]) < 0){
                larg_str =fruits[i];
            }
        }return larg_str;
    }
    
    
    public static void main(String[] args) {
        String fruits[] = { "apple" , "mango" , "banana" , "pineapple", "apricot"};
        
        
        System.out.println( largest_string(fruits));
    }
    
}
