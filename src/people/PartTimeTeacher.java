package people;

public class PartTimeTeacher extends Teacher {

    private int activeHoursPerWeek;

    public PartTimeTeacher(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double getSalary() {
        return getBaseSalary() * activeHoursPerWeek;
    }
}
