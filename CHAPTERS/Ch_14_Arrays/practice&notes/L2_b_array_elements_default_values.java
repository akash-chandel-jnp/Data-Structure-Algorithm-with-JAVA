import javax.naming.InterruptedNamingException;

public class L2_b_array_elements_default_values{
    public static void main(String[] args) {
        int marks[] = new int[10]; // default value is 0
        String names[] = new String[10]; // default value is null

        System.out.println(marks[0]);
        System.out.println(names[0]);
        Integer marks2[] = new Integer[10]; // default value is null
        System.out.println(marks2[0]);

    }

}

// learning ==>>
// if array is of primitive data type like int , byte, etc... default values of elements in the array is 0
// but if the array is of OBject dadta type like INTEGER, string  etc then default value is null..
