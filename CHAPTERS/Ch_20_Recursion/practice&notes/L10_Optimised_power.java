import java.rmi.server.RemoteStub;

import javax.management.openmbean.OpenDataException;

public class L10_Optimised_power{
    public static int optimisedPower(int a , int n){
        if(n==0){
            return 1;
        }
        int halfPower = optimisedPower(a, n/2);
        int halfPowerSquare = halfPower * halfPower;
        
        // if we simply write as below it will still be O(n);
        // int power = optimisedPower(a, n/2) *optimisedPower(a, n/2);
        // return power;

        if(n% 2 != 0){
            halfPowerSquare = a * halfPowerSquare ;
        }
        return halfPowerSquare;
        

    }
    public static void main(String[] args) {
        System.out.println(optimisedPower(2, 10));       
    }
}