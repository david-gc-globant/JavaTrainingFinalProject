package people;

public abstract class Teacher {

    private double baseSalary;

    public Teacher(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double getSalary();

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
