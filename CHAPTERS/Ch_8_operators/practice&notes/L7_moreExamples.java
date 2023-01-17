public class L7_moreExamples {
    public static void main(String[] args) {

        int z = 15;
        int k = z--  + 10 ;
        System.out.println("Value of z is : " + z +" i.e. decreased by 1 ");



        //example increment and decrement operator (prefix and postfix)
        int a = 7;
        a+= a++ + ++a + --a + a-- ;
        // a = a + (a++ + ++a + -–a + a–-);
        // a = 7 + (a++ + ++a + -–a + a–-);
        // a = 7 + (7 + 9 + 8 + 8);
        // a = 39

        System.out.println(a);

        //example 2: 
        int x = 5;
        x = x++ * 2 + 3 * -x;
        //x = 5 * 2 + 3* -6
        //x = 10 - 18
        // x = -8

        System.out.println(x); // -8

        // example 3
        int y =10;
        y= -y;
        // y= -10;
        System.out.println(y); // 
    }
    
}
