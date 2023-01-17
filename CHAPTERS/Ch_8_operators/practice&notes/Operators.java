public class Operators{
    public static void main(String[] args){
        int x, y, z;
        x = y = z = 2;
        x += y; // x= x + y :: x= 4
        y -= z; // y = y-z  :: y = 2-2 = 0
        z /= (x + y); // w = z/ (x+y) = 2 / (4 + 0) = 2/4 = 0.5 = int(0.5) =0
        System.out.println(x + " " + y + " " + z);
    }
}