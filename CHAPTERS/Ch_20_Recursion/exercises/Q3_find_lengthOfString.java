public class Q3_find_lengthOfString {
    public static int string_length(String str){
        if(str.length() == 0){
            return 0;
        }
        System.out.println(str.substring(0));
        return string_length(str.substring(1))+1;
    }

    public static void main(String[] args) {

        String str = "abcde";
        System.out.println(string_length(str));

    }
    
}
