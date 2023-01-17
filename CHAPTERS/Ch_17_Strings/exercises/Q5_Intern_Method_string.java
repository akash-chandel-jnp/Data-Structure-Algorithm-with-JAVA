public class Q5_Intern_Method_string{
    
    public static void main(String[] args) {          
        String s1 = "Java";  // points to SCP (say 100)
        String s2 = s1.intern();  // points to SCP ( 100)
        String s3 = new String("Java");   // points to heap (say 200)
        String s4 = s3.intern();  // s3 now points to SCP 100 and same reference is now transfered to S4 also. ( s3=s4= 100)
        

        // finally (s1 = 100 ; s2 = 100; s3 = 200; )
        
        System.out.println(s1==s2); // True  
        System.out.println(s2==s4); // True        
        System.out.println(s1==s4); // True       
        
        System.out.println(s1==s3); // False  
        System.out.println(s2==s3); // False  
        System.out.println(s3==s4); // False          
    }  
}