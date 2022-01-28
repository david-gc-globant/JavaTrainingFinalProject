import people.Student;
import people.Teacher;

import java.util.HashMap;

public class University {

    private HashMap<Long, Teacher> teachers;
    private HashMap<Long, Student> students;
    private HashMap<Long, UniversityClass> universityClasses;

    public University() {
        teachers = new HashMap<>();
        students = new HashMap<>();
        universityClasses = new HashMap<>();
    }

    public University(HashMap<Long, Teacher> teachers, HashMap<Long, Student> students, HashMap<Long, UniversityClass> universityClasses) {
        this.teachers = teachers;
        this.students = students;
        this.universityClasses = universityClasses;
    }

    public Teacher findTeacherById(long id) {
        return teachers.get(id);
    }

    public Student findStudentById(long id){
        return students.get(id);
    }

    public UniversityClass findUniversityClassByCode(long code){
        return universityClasses.get(code);
    }

    public void addTeacher(Teacher teacher) {
        teachers.put(teacher.getId(), teacher);
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public void addUniversityClass(UniversityClass universityClass) {
        universityClasses.put(universityClass.getCode(), universityClass);
    }

    public HashMap<Long, Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(HashMap<Long, Teacher> teachers) {
        this.teachers = teachers;
    }

    public HashMap<Long, Student> getStudents() {
        return students;
    }

    public void setStudents(HashMap<Long, Student> students) {
        this.students = students;
    }

    public HashMap<Long, UniversityClass> getUniversityClasses() {
        return universityClasses;
    }

    public void setUniversityClasses(HashMap<Long, UniversityClass> universityClasses) {
        this.universityClasses = universityClasses;
    }
}
