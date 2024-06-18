package BT4;

public class Motorbike extends Vehicle {
    public  Motorbike() {
        super();
    }

    @Override
    public void getModel() {
        System.out.println("Motorbike Model: " + model);
    }
}
