package people;

public class PartTimeTeacher extends Teacher {

    private int activeHoursPerWeek;

    public PartTimeTeacher(long id, String name, double baseSalary, int activeHoursPerWeek) {
        super(id, name, baseSalary);
        this.activeHoursPerWeek = activeHoursPerWeek;
    }

    @Override
    public double getSalary() {
        return getBaseSalary() * activeHoursPerWeek;
    }

    public int getActiveHoursPerWeek() {
        return activeHoursPerWeek;
    }

    public void setActiveHoursPerWeek(int activeHoursPerWeek) {
        this.activeHoursPerWeek = activeHoursPerWeek;
    }
}
