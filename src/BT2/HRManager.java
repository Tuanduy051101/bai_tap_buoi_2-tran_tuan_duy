package BT2;

public class HRManager extends Employee {

    @Override
    public void work() {
        System.out.println("Managing employees");
    }

    @Override
    public void getSalary() {
        System.out.println("Manager salary: 70000\n");
    }

    public void  addEmployee() {
        System.out.println("Adding new employee!");
    }
}
