public class Employee {
    private String name;
    private double baseSalary; //luong co ban

    //Constructor
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    // Getter vaf Setter
    public String getName() {
        return this.name;
    }
    public double getSalary(){
        return this.baseSalary;
    }
}
public class Developer extends oke Employee{
    private double bonus;

    public Developer(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }
    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

}