public class ForLoop_reverseNumber {
    public static void main(String[] args) { 
        int num = 12345;
        while(num>0){                 //  keep running the loop till last digit is not removed ; after removal of last digit the number will be 0
            
            System.out.print(num%10); // pirnts the last digit 
            
            num = num/10;             // removes the last digit
        }
        
    }
}

