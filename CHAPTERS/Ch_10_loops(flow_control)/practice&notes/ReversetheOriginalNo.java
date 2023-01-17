public class ReversetheOriginalNo {
    public static void main(String[] args) {
        int num = 12345;
        int reversedNum =0;
        
        while(num>0){
            int lastDigit = num%10;
            reversedNum  = reversedNum*10 + lastDigit;
            num = num/10;
        }
        System.out.println( reversedNum);
    }
}
