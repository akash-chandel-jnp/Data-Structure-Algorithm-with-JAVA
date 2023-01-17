public class L4_getters_and_setters {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        // p1.color="green";
        // p1.color ="red";

        p1.setColor("green");
        p1.setTip(5);

        System.out.println(p1.getColor());
        System.out.println(p1.getTip());

    }
}
    class Pen {
        private int tip; // private : so that can not be accessed directly in main function
        private String color;

        int getTip(){
            return this.tip;
        }

        String getColor(){
            return this.color;
        }

        void setColor(String newColor){
            this.color = newColor;
        }

        void setTip(int newTip){
            this.tip = newTip;
        }

    }

