import people.Student;
import people.Teacher;

import java.util.LinkedList;
import java.util.List;

public class University {

    private List<Teacher> teachers;
    private List<Student> students;
    private List<UniversityClass> universityClasses;

    public University() {
        teachers = new LinkedList<>();
        students = new LinkedList<>();
        universityClasses = new LinkedList<>();
    }

    public University(List<Teacher> teachers, List<Student> students, List<UniversityClass> universityClasses) {
        this.teachers = teachers;
        this.students = students;
        this.universityClasses = universityClasses;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addUniversityClass(UniversityClass universityClass) {
        universityClasses.add(universityClass);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<UniversityClass> getUniversityClasses() {
        return universityClasses;
    }

    public void setUniversityClasses(List<UniversityClass> universityClasses) {
        this.universityClasses = universityClasses;
    }
}
