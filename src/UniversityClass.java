import people.Student;
import people.Teacher;

import java.util.HashMap;

public class UniversityClass {

    private long code;
    private String name;
    private String assignedClassroom;
    private HashMap<Long, Student> students;
    private Teacher teacher;

    private static long codeCounter=0;

    public UniversityClass(String name, String assignedClassroom, HashMap<Long, Student> students, Teacher teacher) {
        this(name, assignedClassroom);
        this.students = students;
        this.teacher = teacher;
    }

    public UniversityClass(String name, String assignedClassroom){
        codeCounter++;
        setCode(codeCounter);
        this.name = name;
        this.assignedClassroom = assignedClassroom;

        this.students = new HashMap<>();
    }

    public void addStudent(Student student){
        students.put(student.getId(), student);
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

    public HashMap<Long, Student> getStudents() {
        return students;
    }

    public void setStudents(HashMap<Long, Student> students) {
        this.students = students;
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
