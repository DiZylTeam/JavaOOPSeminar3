package JavaOOPSeminar3;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private List<Student> studentList;

    public StudentGroup(List<StudentGroup> studentGroup) {
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this.studentList);
    }

    private Teacher teacher;

    public StudentGroup(List<Student> studentList, Teacher teacher) {
        this.studentList = studentList;
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public int getCountStudents(){
        return studentList.size();
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

    @Override
    public String toString() {
        return "studentList = " + studentList +
                ", teacher = " + teacher +
                '}';
    }
}
