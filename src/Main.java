import people.FullTimeTeacher;
import people.PartTimeTeacher;
import people.Student;
import people.Teacher;

import java.util.*;

public class Main {

    private static University university;

    private static Scanner scanner;

    public static void main(String[] args) {
        university = new University();

        initializeTeachers();
        initializeStudents();
        initializeUniversityClasses();

        scanner= new Scanner(System.in);

        boolean stopExecution=false;
        while(!stopExecution){
            showMenu();
            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.println("List of teachers: ");
                    for (Map.Entry<Long, Teacher> entry : university.getTeachers().entrySet()) {
                        System.out.println(entry.getValue().toString());
                    }
                    break;
                case 2:
                    System.out.println("List of classes: ");
                    for (Map.Entry<Long, UniversityClass> entry : university.getUniversityClasses().entrySet()) {
                        System.out.println("[ "+entry.getKey()+" ] "+entry.getValue().getName());
                    }

                    System.out.println("        *-*-*-*-*-*-*-*-*-*-*-*-*   \n"+
                                       "        Please, enter the code of a class to see its details or enter -1 to skip this step.");
                    int choiceC= scanner.nextInt();

                    UniversityClass universityClass= university.findUniversityClassByCode(choiceC);

                    if(choiceC==-1){
                        break;
                    }else if (universityClass==null){
                        System.out.println("Code not found");
                    }else{
                        System.out.println(universityClass);
                        System.out.println("Students: ");
                        for(Student student: universityClass.getStudentList()){
                            System.out.println(student.toString());
                        }
                    }

                    break;
                default:
                    System.out.println("Please, choose a valid option");
            }
        }
    }

    public static void showMenu(){
        System.out.println("*****************************\n"+
                "MENU: \n"+
                "1. List Professors \n"+
                "2. List all the classes \n"+
                "3. Add a new student \n"+
                "4. Add a new class \n"+
                "5. List a student's classes \n"+
                "6. Exit. \n"+
                "*******************************");
    }

    public static void initializeUniversityClasses(){

        List<Student> studentsClass1 = new LinkedList<>();
        studentsClass1.add(university.findStudentById(123));
        studentsClass1.add(university.findStudentById(234));
        studentsClass1.add(university.findStudentById(345));

        Teacher teacherClass1= university.findTeacherById(2123);

        UniversityClass universityClass1= new UniversityClass(1, "Calculus I", "Room 1", studentsClass1, teacherClass1);

        List<Student> studentsClass2 = new LinkedList<>();
        studentsClass2.add(university.findStudentById(234));
        studentsClass2.add(university.findStudentById(456));
        studentsClass2.add(university.findStudentById(567));
        studentsClass2.add(university.findStudentById(123));

        Teacher teacherClass2= university.findTeacherById(2234);

        UniversityClass universityClass2= new UniversityClass(2, "OOP", "Room 1", studentsClass2, teacherClass2);

        List<Student> studentsClass3 = new LinkedList<>();
        studentsClass3.add(university.findStudentById(567));
        studentsClass3.add(university.findStudentById(678));

        Teacher teacherClass3= university.findTeacherById(3123);

        UniversityClass universityClass3= new UniversityClass(3, "Databases", "Room 2", studentsClass3, teacherClass3);

        List<Student> studentsClass4 = new LinkedList<>();
        studentsClass4.add(university.findStudentById(123));
        studentsClass4.add(university.findStudentById(234));
        studentsClass4.add(university.findStudentById(345));
        studentsClass4.add(university.findStudentById(456));
        studentsClass4.add(university.findStudentById(567));
        studentsClass4.add(university.findStudentById(678));

        Teacher teacherClass4= university.findTeacherById(3234);

        UniversityClass universityClass4= new UniversityClass(4, "Data Structures", "Room 3", studentsClass4, teacherClass4);


        university.addUniversityClass(universityClass1);
        university.addUniversityClass(universityClass2);
        university.addUniversityClass(universityClass3);
        university.addUniversityClass(universityClass4);
    }

    public static void initializeTeachers() {
        FullTimeTeacher fullTimeTeacher1 = new FullTimeTeacher(2123,"Luisa", 80, 15);
        FullTimeTeacher fullTimeTeacher2 = new FullTimeTeacher(2234,"Raul", 40, 2);

        PartTimeTeacher partTimeTeacher1 = new PartTimeTeacher(3123,"Valencio", 23, 40);
        PartTimeTeacher partTimeTeacher2 = new PartTimeTeacher(3234, "Marta", 23, 45);

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
