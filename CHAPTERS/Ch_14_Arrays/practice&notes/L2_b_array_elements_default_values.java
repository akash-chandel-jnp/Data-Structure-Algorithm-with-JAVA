import javax.naming.InterruptedNamingException;

public class L2_b_array_elements_default_values{
    public static void main(String[] args) {
        byte marks_byte[] = new byte[10]; // default value is 0
        System.out.println("byte : " + marks_byte[0]);

        short marks_short[] = new short[10]; // default value is 0
        System.out.println("short : " + marks_short[0]);

        int marks_int[] = new int[10]; // default value is 0
        System.out.println("int : " + marks_int[0]);

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


        Byte marks_Byte[] = new Byte[10]; // default value is 0
        System.out.println("Byte : " + marks_Byte[0]);

        Short marks_Short[] = new Short[10]; // default value is 0
        System.out.println("Short : " + marks_Short[0]);

        Integer marks_Integer[] = new Integer[10]; // default value is 0
        System.out.println("Integer : " + marks_Integer[0]);

        Long marks_Long[] = new Long[10]; // default value is 0
        System.out.println("Long : " + marks_Long[0]);

        Float marks_Float[] = new Float[10]; // default value is 0
        System.out.println("Float : " + marks_Float[0]);

        Double marks_Double[] = new Double[10]; // default value is 0
        System.out.println("Double: " + marks_Double[0]);
        
        Character marks_Character[] = new Character[10]; // default value is 0
        System.out.println("Character : " + marks_Character[0]);
        
        Boolean marks_Boolean[] = new Boolean[10];
        System.out.println("Boolean : " + marks_Boolean[0]);





    }

}

// learning ==>>
// if array is of primitive data type like int , byte, etc... default values of elements in the array is 0
// but if the array is of OBject dadta type like INTEGER, string  etc then default value is null..

/*
 output --> 
byte : 0
short : 0
int : 0
long : 0
float : 0.0
double: 0.0
char :
boolean : false

Byte : null
Short : null
Integer : null
Long : null
Float : null
Double: null
Character : null
Short : null
Integer : null
Long : null
Float : nullDouble: nullCharacter : null
Boolean : null
*/