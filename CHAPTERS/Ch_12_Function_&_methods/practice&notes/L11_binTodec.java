public class L11_binTodec {
    public static void main(String[] args) {
       
        binToDec(1010); // 10
        decToBin(10); // 1010

        
    }

    // ******************************* BINARY TO DECIMAL *****************************************
    public static void  binToDec(int n){
        int pow = 0;
        int myNum = n;
        int decNum = 0;
        while(n > 0 ){
            int lastDig = n%10;
            decNum = decNum + lastDig * (int)Math.pow(2, pow);
            n = n/10;
            pow++;
        }
        System.out.println("Decimal form of binary num " +  myNum+ " is " + decNum);
    
    }
    // *******************************  DECIMAL TO BINARY *****************************************
    public static void  decToBin(int n){
        int pow = 0;
        int myNum = n;
        int binNum = 0;
        while(n > 0 ){
            int lastDig = n % 2;
            binNum = binNum + lastDig * (int)Math.pow(10, pow);
            n = n / 2;
            pow++;
        }
        System.out.println("Decimal form of binary num " +  myNum + " is " + binNum);
    
    }

    
}
