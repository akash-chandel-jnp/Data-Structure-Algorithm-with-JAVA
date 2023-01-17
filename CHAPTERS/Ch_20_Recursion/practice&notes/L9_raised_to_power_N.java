public class L9_raised_to_power_N {
    
    public static int raised_to_power_n(int x , int n){
        if(n == 0){
            return 1;
        }
        int power_n = x*raised_to_power_n(x, n-1);

        // above one line code divided into two steps as below: 
        // int power_n_1 = raised_to_power_n(x, n-1);
        // int power_n = x*power_n_1 ;
        return power_n;
    }
    
    public static void main(String[] args) {
        System.out.println(raised_to_power_n(2, 10));
        
    }

}
