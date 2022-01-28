import people.FullTimeTeacher;
import people.PartTimeTeacher;
import people.Student;

import java.util.GregorianCalendar;

public class Main {

    private static University university;

    public static void main(String[] args) {
        university = new University();

        initializeTeachers();
        initializeStudents();
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

    public static void initializeStudents(){
        Student student1 = new Student("Laura", 123, new GregorianCalendar(2001, 05,18));
        Student student2 = new Student("Pedro", 234, new GregorianCalendar(1997,8,12));
        Student student3 = new Student("Ana", 345, new GregorianCalendar(1999, 2,23));
        Student student4 = new Student("Antonio",456, new GregorianCalendar(2003, 4,1));
        Student student5 = new Student("Josefa", 567, new GregorianCalendar(2003,4,2));
        Student student6 = new Student("Luis Miguel", 678, new GregorianCalendar(1989, 3,27));

        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);
        university.addStudent(student4);
        university.addStudent(student5);
        university.addStudent(student6);
    }

}
