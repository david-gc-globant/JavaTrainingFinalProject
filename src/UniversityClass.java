import people.Student;
import people.Teacher;

import java.util.List;

public class UniversityClass {

    private String name;
    private String assignedClassroom;
    private List<Student> studentList;
    private Teacher teacher;

    public UniversityClass(String name, String assignedClassroom, List<Student> studentList, Teacher teacher) {
        this.name = name;
        this.assignedClassroom = assignedClassroom;
        this.studentList = studentList;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAssignedClassroom() {
        return assignedClassroom;
    }

    public void setAssignedClassroom(String assignedClassroom) {
        this.assignedClassroom = assignedClassroom;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}