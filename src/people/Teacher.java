package people;

public abstract class Teacher extends Person {

    private double baseSalary;

    public Teacher(long id, String name, double baseSalary) {
        super(id, name);
        this.baseSalary = baseSalary;
    }

    public abstract double getSalary();

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String toString() {
        return "Id: " + getId() + " · Name: " + getName() + " · Salary: " + getSalary();
    }
}
