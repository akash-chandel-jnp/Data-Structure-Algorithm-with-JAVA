

public class L7_Inheritence {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.color= "black"; // note: color property is taken from animal class,it was not defined in fish
        shark.swims();        // this finction is defined for fish separately;
    }
}

class Animals{
    String color;
    int weight;

    void eats(){
        System.out.println("eats");
}

    void breathe(){
        System.out.println("breathing ");
    }
}

/*creating child class fish and properties and function is not needed to be defined for fish again as copy ho jayege by itself*/

class Fish extends Animals{ // extends means : fish class taking propertes from --> animals

        int fins ;

        void swims(){
        System.out.println("fish is swimming");
    }
}
