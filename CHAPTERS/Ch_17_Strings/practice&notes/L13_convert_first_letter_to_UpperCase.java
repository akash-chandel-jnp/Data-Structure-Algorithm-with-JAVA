public class L13_convert_first_letter_to_UpperCase{

    public static String firstChar_capital(String str){

        StringBuilder sb = new StringBuilder ("");

        sb.append(Character.toUpperCase(str.charAt(0)))  ; // first character must be converted to uppercase
        
        for (int i =1 ; i< str.length() ; i++) { // not from i = 0 , as i =0 alreaady covered above;

            // if current char is as space then copy it and convert the next one to uppercase ; also check this space is not at the end of the string means our pointer is not at the last letter; 
            if( str.charAt(i) == ' ' && i<str.length()-1){ 

                sb.append(str.charAt(i));
                i++; //if at space then move to the next char and make it uppercase
                sb.append(Character.toUpperCase(str.charAt(i))) ;


            }else{  // if current char is not a space then simply append ot to the stringbuilder;
                sb.append((str.charAt(i)));
            }
        }
        // sb.toString();
        return sb.toString();
        
    }
    
    
    public static void main(String[] args) {
        String str = "i am akash ";

        System.out.println(firstChar_capital(str)) ;

    }
}