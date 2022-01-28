package people;

public class FullTimeTeacher extends Teacher {

    private int yearsOfExperience;

    public FullTimeTeacher(long id, String name, double baseSalary, int yearsOfExperience) {
        super(id, name, baseSalary);
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public double getSalary() {
        return getBaseSalary()*yearsOfExperience*1.1;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
