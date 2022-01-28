package people;

import java.util.Calendar;

public class Student extends Person {

    private long id;
    private Calendar dateOfBirth;

    public Student(String name, long id, Calendar dateOfBirth) {
        super(name);
        this.id = id;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
