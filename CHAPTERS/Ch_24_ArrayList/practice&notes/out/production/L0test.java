/*
    * * * * *     // i =1 ; star 5
    * * * *       // i =2 ; star 4
    * * * 
    * *
    *

 */
public class L0test{
    public static void main(String[] args) {
        int num = 5;
        for(int i =1 ; i<=num; i++){
            for(int j =1; j<=num+1 -i; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}