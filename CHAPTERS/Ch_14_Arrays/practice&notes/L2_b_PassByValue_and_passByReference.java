public class L2_b_PassByValue_and_passByReference{

    static void update(int num[],int num1, String name){
        num1=num1+10;  
        name = "Chandel";
        for(int i=0;i<num.length;i++){
            num[i]=num[i]+1;
        }
    }

    public static void main(String[] args) {

        int num[] = {25, 30, 35 , 40 , 45 };
        int num1 = 50;
        String name ="akash";
        update(num,num1, name);

        //print the array to chech whether array has changed or not..  // we will find that it has been changed as array is passed by reference and not by value..
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();


        //print the int num1, String name,  after update  to check whether int num1 has changed or not..  // we will find that it has not changed as primitives , Strings etc all are is passed by value(i.e their copy is passed) and hence original int num1 has not changed
        System.out.println(num1);

        //print the int num1 after update  to check whether int num1 has changed or not..  // we will find that it has not changed as primitives are is passed by value(i.e their copy is passed) and hence original int num1 has not changed
        System.out.println(name);

        


    }

}

// array is always passed as reference in any function so values are updated,