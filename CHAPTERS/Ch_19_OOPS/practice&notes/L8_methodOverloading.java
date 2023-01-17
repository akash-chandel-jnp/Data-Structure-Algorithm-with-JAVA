public class L8_methodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(5, 8));
    }

}

class Calculator{
    int sum(int a , int b){
        return a +b;
    }
    float sum(float a, float b){
        return a+b;
    }

}
