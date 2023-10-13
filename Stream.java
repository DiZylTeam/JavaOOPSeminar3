package JavaOOPSeminar3;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    private final List<StudentGroup> studentGroups;
    private int count;

    public Stream(List<StudentGroup> studentGroups) {
        this.count = 0;
        this.studentGroups = studentGroups;
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    @Override
    public String toString() {
        return "Stream {" +
                "studentGroups =" + studentGroups +
                '}';
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            @Override
            public boolean hasNext() {
                count++;
                return count < studentGroups.size() - 1;
            }

            @Override
            public StudentGroup next() {
                if (!hasNext()){
                    return null;
                }
                return studentGroups.get(count);
            }
        };
    }
    public void removeGrope(){
        this.studentGroups.remove(count);
    }
    public void setZeroCount(){
        this.count = 0;
    }

}


