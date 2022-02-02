import exceptions.DataNotFoundException;
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

        scanner = new Scanner(System.in);

        boolean stopExecution = false;
        while (!stopExecution) {
            showMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("List of teachers: ");
                    for (Map.Entry<Long, Teacher> entry : university.getTeachers().entrySet()) {
                        System.out.println(entry.getValue().toString());
                    }
                    break;
                case 2:
                    listClassesMenu();
                    break;
                case 3:
                    addNewStudentToClass();
                    break;
                case 4:
                    addNewUniversityClass();
                    break;
                case 5:
                    listStudentsClasses();
                    break;
                case 6:
                    stopExecution=true;
                    break;
                default:
                    System.out.println("Please, choose a valid option");
            }
        }
    }

    public static void listStudentsClasses(){
        System.out.println("Please, enter the student's ID");
        long studentID = Long.parseLong(scanner.nextLine());

        List<UniversityClass> studentsClasses= university.getStudentsClasses(studentID);

        if(studentsClasses.isEmpty()){
            System.out.println("No classes were found for this ID. ");
        }else{
            System.out.println("The student with ID "+studentID+" is included in the following classes: ");
            for(UniversityClass universityClass: studentsClasses){
                System.out.println(universityClass.toString());
            }
        }

    }

    public static void addNewUniversityClass() {
        System.out.println("Please, enter the following information: \nName of the class:");
        String name = scanner.nextLine();

        System.out.println("Assigned classroom for this class:");
        String assignedClassroom = scanner.nextLine();

        UniversityClass universityClass = new UniversityClass(name, assignedClassroom);

        university.addUniversityClass(universityClass);

        while (true) {
            try {
                System.out.println("Teacher's ID: ");
                Long teachersId = Long.parseLong(scanner.nextLine());

                Teacher teacher = university.findTeacherById(teachersId);

                universityClass.setTeacher(teacher);
            } catch (DataNotFoundException dataNotFoundException) {
                System.out.println(dataNotFoundException.getMessage());
                continue;
            }
            break;
        }

        System.out.println("How many students will be added to this class? (number only):");
        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberOfStudents; i++) {
            while (true) {
                try {
                    System.out.println("ID of student " + i);
                    long studentID = Long.parseLong(scanner.nextLine());
                    Student student = university.findStudentById(studentID);

                    universityClass.addStudent(student);
                    break;
                } catch (DataNotFoundException dataNotFoundException) {
                    System.out.println(dataNotFoundException.getMessage());
                }
            }
        }

    }

    public static void addNewStudentToClass() {

        UniversityClass universityClass;

        while (true) {
            System.out.println("Please, enter the code of the class.");
            long code = Long.parseLong(scanner.nextLine());
            try {
                universityClass = university.findUniversityClassByCode(code);

                break;
            } catch (DataNotFoundException dataNotFoundException) {
                System.out.println(dataNotFoundException.getMessage());
            }
        }

        System.out.println("Please, enter the student's name.");
        String name = scanner.nextLine();


        while (true) {
            System.out.println("Please, enter the student's date of birth in the following format: YYYY-MM-DD");
            String dateOfBirth = scanner.nextLine();

            String[] dateOfBirthParts = dateOfBirth.split("-");

            if (dateOfBirthParts.length != 3) {
                System.out.println("Date of birth not valid.");
                continue;
            }

            int yearOfBirth = Integer.parseInt(dateOfBirthParts[0]);
            int monthOfBirth = Integer.parseInt(dateOfBirthParts[1]) - 1;
            int dayOfBirth = Integer.parseInt(dateOfBirthParts[2]);

            Student student = new Student(name, new GregorianCalendar(yearOfBirth, monthOfBirth, dayOfBirth));

            university.addStudent(student);
            universityClass.addStudent(student);
            break;
        }
    }

    public static void listClassesMenu() {
        System.out.println("List of classes: ");
        for (Map.Entry<Long, UniversityClass> entry : university.getUniversityClasses().entrySet()) {
            System.out.println("[ " + entry.getKey() + " ] " + entry.getValue().getName());
        }

        boolean stopExecution = false;
        while (!stopExecution) {

            System.out.println("        *-*-*-*-*-*-*-*-*-*-*-*-*   \n" +
                    "        Please, enter the code of a class to see its details or enter -1 to skip this step.");
            int choiceC = Integer.parseInt(scanner.nextLine());

            if (choiceC == -1) {
                stopExecution = true;
            } else {
                try {
                    UniversityClass universityClass = university.findUniversityClassByCode(choiceC);

                    System.out.println(universityClass);
                    System.out.println("Students: ");
                    for (Map.Entry<Long, Student> entry : universityClass.getStudents().entrySet()) {
                        System.out.println(entry.getValue().toString());
                    }

                } catch (DataNotFoundException dataNotFoundException) {
                    System.out.println(dataNotFoundException.getMessage());
                }
            }
        }
    }

    public static void showMenu() {
        System.out.println("*****************************\n" +
                "MENU: \n" +
                "1. List Professors \n" +
                "2. List all the classes \n" +
                "3. Add a new student to an existing class\n" +
                "4. Add a new class \n" +
                "5. List a student's classes \n" +
                "6. Exit. \n" +
                "*******************************");
    }

    public static void initializeUniversityClasses() {

        try {

            UniversityClass universityClass1 = new UniversityClass("Calculus I", "Room 1");
            UniversityClass universityClass2 = new UniversityClass("OOP", "Room 1");
            UniversityClass universityClass3 = new UniversityClass("Databases", "Room 2");
            UniversityClass universityClass4 = new UniversityClass("Data Structures", "Room 3");


            universityClass1.addStudent(university.findStudentById(5));
            universityClass1.addStudent(university.findStudentById(6));
            universityClass1.addStudent(university.findStudentById(7));

            universityClass1.setTeacher(university.findTeacherById(3));

            universityClass2.addStudent(university.findStudentById(6));
            universityClass2.addStudent(university.findStudentById(7));
            universityClass2.addStudent(university.findStudentById(8));
            universityClass2.addStudent(university.findStudentById(9));

            universityClass2.setTeacher(university.findTeacherById(1));

            universityClass3.addStudent(university.findStudentById(10));
            universityClass3.addStudent(university.findStudentById(5));

            universityClass3.setTeacher(university.findTeacherById(2));

            universityClass4.addStudent(university.findStudentById(5));
            universityClass4.addStudent(university.findStudentById(6));
            universityClass4.addStudent(university.findStudentById(7));
            universityClass4.addStudent(university.findStudentById(8));
            universityClass4.addStudent(university.findStudentById(9));
            universityClass4.addStudent(university.findStudentById(10));

            universityClass4.setTeacher(university.findTeacherById(4));

            university.addUniversityClass(universityClass1);
            university.addUniversityClass(universityClass2);
            university.addUniversityClass(universityClass3);
            university.addUniversityClass(universityClass4);

        } catch (DataNotFoundException dataNotFoundException) {
            System.out.println(dataNotFoundException.getMessage());
        }

    }

    public static void initializeTeachers() {
        FullTimeTeacher fullTimeTeacher1 = new FullTimeTeacher("Luisa", 80, 15);
        FullTimeTeacher fullTimeTeacher2 = new FullTimeTeacher("Raul", 40, 2);

        PartTimeTeacher partTimeTeacher1 = new PartTimeTeacher("Valencio", 23, 40);
        PartTimeTeacher partTimeTeacher2 = new PartTimeTeacher("Marta", 23, 45);

        university.addTeacher(fullTimeTeacher1);
        university.addTeacher(fullTimeTeacher2);
        university.addTeacher(partTimeTeacher1);
        university.addTeacher(partTimeTeacher2);
    }

    public static void initializeStudents() {
        Student student1 = new Student("Laura", new GregorianCalendar(2001, 5, 18));
        Student student2 = new Student("Pedro", new GregorianCalendar(1997, 8, 12));
        Student student3 = new Student("Ana", new GregorianCalendar(1999, 2, 23));
        Student student4 = new Student("Antonio", new GregorianCalendar(2003, 4, 1));
        Student student5 = new Student("Josefa", new GregorianCalendar(2003, 4, 2));
        Student student6 = new Student("Luis Miguel", new GregorianCalendar(1989, 3, 27));

        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);
        university.addStudent(student4);
        university.addStudent(student5);
        university.addStudent(student6);
    }

}
