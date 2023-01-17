

public class L5_char_at_in_strings {
    public static void main(String[] args) {
        String name ="Akash Deep Singh Chandel";

        // to find character at index 5;
        System.out.println(name.charAt(4)+ "--- is the character at index : " + 4);
    
        // to print each character of the string we use loop upto length of string
        for (int i=0; i< name.length(); i++){
            System.out.print(name.charAt(i));
        }
        
    
    }

    
}
