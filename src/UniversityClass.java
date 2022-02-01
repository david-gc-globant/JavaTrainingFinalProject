import people.Student;
import people.Teacher;

import java.util.List;

public class UniversityClass {

    private long code;
    private String name;
    private String assignedClassroom;
    private List<Student> studentList;
    private Teacher teacher;

    private static long codeCounter=0;

    public UniversityClass(String name, String assignedClassroom, List<Student> studentList, Teacher teacher) {
        codeCounter++;
        setCode(codeCounter);
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

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String toString(){
        return "Code: "+getCode()+" · Name: "+getName()+" · Assigned classroom: "+getAssignedClassroom()+" · Teacher: "+getTeacher().getName();
    }
}
