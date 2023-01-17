public class K_count_occurance_of_key {
    public static void main(String[] args) {
        int num = 45658555;
        System.out.print(count_key(num, 5));



    }

    public static int count_key(int num, int key){
        int last_digit = 0;
        int count = 0;
        while(num !=0){
            last_digit = num % 10;
            if(key == last_digit){
                count = count +1;
                
            }
            num = num /10;

        }return count;


    }
    
}
