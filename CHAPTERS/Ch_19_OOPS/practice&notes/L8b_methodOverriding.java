public class L8b_methodOverriding {
    public static void main(String[] args) {
        Deer d1 = new Deer();
        d1.eat();
    }
    
}

class Animal{
    void eat(){
        System.out.println("eat something");

    }
}

class Deer extends Animal{
    void eat(){System.out.println("eat grasses only");

    }
}