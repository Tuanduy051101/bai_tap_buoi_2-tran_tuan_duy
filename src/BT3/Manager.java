package BT3;

public class Manager extends Employee {
    public Manager() {

    }

    @Override
    public void calculateBonus() {
        double bonus = salary * 0.20;
        System.out.println(position + "'s Bonus: $" + bonus);
    }

    public void manageProject() {
        System.out.println(name + " is managing a project.");
    }
}
