public class L11b_Interface_with_multiple_inheritence {
    public static void main(String[] args) {
        
        Bear b1 = new Bear();
            b1.eats_flesh();
            b1.eats_plants();
    }
}

interface Herbivore{
    void eats_plants();
}

interface Carnivore{
    void eats_flesh();

}

class Bear implements Herbivore, Carnivore{
    public void eats_flesh(){
        System.out.println("eating fishes ");
    }
    public void eats_plants(){
        System.out.println(" eating fruits");
    }
    
}
