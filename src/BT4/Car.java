package BT4;

public class Car extends Vehicle{
    public Car(){
        super();
    }
    @Override
    public void getModel() {
        System.out.println("Car Model: " + model);
    }
}
