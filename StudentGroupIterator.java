package JavaOOPSeminar3;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private int count;
    private List<Student> studentList;

    public StudentGroupIterator(List<Student> studentList) {
        this.studentList = studentList;
        this.count = 0;
    }

    public void zeroCount(){
        this.count = 0;
    }

    @Override
    public boolean hasNext() {
        return count < studentList.size();
    }

    @Override
    public Student next() {
        if(!hasNext())
            return null;
        return studentList.get(count++);
    }

    @Override
    public void remove() {
        studentList.remove(count);
    }
}
