package BT4;

public class Trunk extends Vehicle{
    public Trunk() {
        super();
    }
    @Override
    public void getModel() {
        System.out.println("Trunk Model: " + model);
    }
}
