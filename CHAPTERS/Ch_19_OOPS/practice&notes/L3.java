import javax.smartcardio.Card;

public class L3 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "blue"; // property can be accessed using just .property , no need for property(parameter)
        car1.maxSpeed =260;

        System.out.println(car1.color);  
        car1.setMaxSpeed(250); // finction can be called using only ( ) and passing parameter in ();
    }
    
}

protected class Car{
    String color; // property
    int maxSpeed;// property

    void setMaxSpeed(int newMaxSpeed){ // function of car object
        maxSpeed = newMaxSpeed;
    }

}
