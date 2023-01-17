import java.lang.reflect.AnnotatedArrayType;

public class L0_test{
    public static void main(String[] args) {
        func("ABC", "", 0);
        
        
    }
    static void func(String str, String ans, int i ){
        
        //taking first 
        func(str.substring(i+1), ans+ans.charAt(0),i);


    }
}