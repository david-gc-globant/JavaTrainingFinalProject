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
        FullTimeTeacher fullTimeTeacher1 = new FullTimeTeacher(2123,"Luisa", 8000000, 15);
        FullTimeTeacher fullTimeTeacher2 = new FullTimeTeacher(2234,"Raul", 4000000, 2);

        PartTimeTeacher partTimeTeacher1 = new PartTimeTeacher(3123,"Valencio", 2300000, 40);
        PartTimeTeacher partTimeTeacher2 = new PartTimeTeacher(3234, "Marta", 2300000, 45);

        university.addTeacher(fullTimeTeacher1);
        university.addTeacher(fullTimeTeacher2);
        university.addTeacher(partTimeTeacher1);
        university.addTeacher(partTimeTeacher2);
    }

    public static void initializeStudents(){
        Student student1 = new Student(123,"Laura",  new GregorianCalendar(2001, 05,18));
        Student student2 = new Student(234,"Pedro",  new GregorianCalendar(1997,8,12));
        Student student3 = new Student(345,"Ana",  new GregorianCalendar(1999, 2,23));
        Student student4 = new Student(456,"Antonio", new GregorianCalendar(2003, 4,1));
        Student student5 = new Student(567, "Josefa", new GregorianCalendar(2003,4,2));
        Student student6 = new Student(678,"Luis Miguel",  new GregorianCalendar(1989, 3,27));

        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);
        university.addStudent(student4);
        university.addStudent(student5);
        university.addStudent(student6);
    }

}
