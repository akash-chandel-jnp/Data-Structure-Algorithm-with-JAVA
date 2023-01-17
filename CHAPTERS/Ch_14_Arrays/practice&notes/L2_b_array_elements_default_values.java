import javax.naming.InterruptedNamingException;

public class L2_b_array_elements_default_values{
    public static void main(String[] args) {
        byte marks_byte[] = new byte[10]; // default value is 0
        System.out.println("byte : " + marks_byte[0]);

        short marks_short[] = new short[10]; // default value is 0
        System.out.println("short : " + marks_short[0]);

        int marks[] = new int[10]; // default value is 0
        System.out.println("int : " + marks[0]);
        
        long marks_long[] = new long[10]; // default value is 0
        System.out.println("long : " + marks_long[0]);

        float marks_float[] = new float[10]; // default value is 0
        System.out.println("float : " + marks_float[0]);

        double marks_double[] = new double[10]; // default value is 0
        System.out.println("double: " + marks_double[0]);
        



        char marks_char[] = new char[10]; // default value is 0
        System.out.println("char : " + marks_char[0]);
        
        boolean true_false[] = new boolean[10];
        System.out.println("boolean : " + true_false[0]);

        Integer marks2[] = new Integer[10]; // default value is null
        System.out.println("Integer : " + marks2[0]);

        String names[] = new String[10]; // default value is null
        System.out.println("String : "+ names[0]);




    }

}

// learning ==>>
// if array is of primitive data type like int , byte, etc... default values of elements in the array is 0
// but if the array is of OBject dadta type like INTEGER, string  etc then default value is null..
