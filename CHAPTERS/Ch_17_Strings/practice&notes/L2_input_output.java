import java.util.Scanner;;
public class L2_input_output {
    public static void main(String[] args) {
        // taking input as string
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.next();    // takes only one word and ignore the other parts
        String fullname = sc.nextLine(); // takes the whole string i.e multiple world or paragraph as input

        System.out.println("Hi ! " + fullname + " welcome to the java world");
    }
}


// if we enter as input only one word then name variable will store the value as sc.next will activate
// if we enter as input multiple word like fullname then fullname varilable will store this value as sc.nextline will activate