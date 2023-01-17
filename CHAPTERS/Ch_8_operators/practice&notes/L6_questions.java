public class L6_questions {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
       
      int c = a-- + b; //Here 'a' will not decremented immediately, a-- will still return value 5.
      //  c = 5   + 7 and this will evaluate to 12.
      // a is now changed to 4
      System.out.println("a is still " + a);


       
      System.out.println("Post- Decrement \n c = "+ c);
       
      //2. Pre-Decrement Operator
       
      int A = 5;
      int B = 7;
       
      int C = --A + B; //Here 'a' will be decremented immediately, and --a will return value 4.
      //  C =  4  + 7   and this will evaluate to 11.
       
      System.out.println("Pre- Decrement \n C = "+ C);
      
      //Example-
      int m = 3, n = 2;
       
      int o = m-- + n + --m; // It goes like m-- = 3, n = 2, --m = (decremented 'm' from 'm--') - 1;
      //                                                         = (m -1) - 1 = (3 -1) -1 = 1
      //  o = 3   + 2 +   1 = 6 
      System.out.println("Example \n o = "+ o);
    }
    }
    
