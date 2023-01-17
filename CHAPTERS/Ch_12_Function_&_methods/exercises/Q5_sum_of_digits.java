public class Q5_sum_of_digits {
    public static void main(String[] args) {
        System.out.println( digitSum(123));
        
    }
    public static int digitSum(int n){
        int sum = 0;
        int num = n;

        while(num != 0 ){
            int last_digit = num % 10;
            sum = sum + last_digit;
            num = num / 10;

        }
        return sum;
    }
    
}
