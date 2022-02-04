package people;

import java.util.Calendar;

public class Student extends Person {

    private Calendar dateOfBirth;

    public Student(String name, Calendar dateOfBirth) {
        super(name);
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {

        Calendar today = Calendar.getInstance();

        int age = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);

        if (today.get(Calendar.DAY_OF_YEAR) < dateOfBirth.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }

        return age;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        return "Id: " + getId() + " · Name: " + getName() + " · Age: " + getAge();
    }
}
