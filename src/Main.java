import people.FullTimeTeacher;
import people.PartTimeTeacher;

public class Main {

    private static University university;

    public static void main(String[] args) {
        university = new University();
    }

    public static void initializeTeachers() {
        FullTimeTeacher fullTimeTeacher1 = new FullTimeTeacher("Luisa", 8000000, 15);
        FullTimeTeacher fullTimeTeacher2 = new FullTimeTeacher("Raul", 4000000, 2);

        PartTimeTeacher partTimeTeacher1 = new PartTimeTeacher("Valencio", 2300000, 40);
        PartTimeTeacher partTimeTeacher2 = new PartTimeTeacher("Marta", 2300000, 45);

        university.addTeacher(fullTimeTeacher1);
        university.addTeacher(fullTimeTeacher2);
        university.addTeacher(partTimeTeacher1);
        university.addTeacher(partTimeTeacher2);
    }


}
