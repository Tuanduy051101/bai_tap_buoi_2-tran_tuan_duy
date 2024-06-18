package BT3;

public class Developer extends Employee {
    public Developer() {
    }

    @Override
    public void calculateBonus() {
        double bonus = salary * 0.15;  // Developers get a 15% bonus
        System.out.println(position + "'s Bonus: $" + bonus);
    }

    public void writeCode() {
        System.out.println(name + " is writing code in Java");
    }
}
