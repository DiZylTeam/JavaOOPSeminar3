package JavaOOPSeminar3.Service;

import JavaOOPSeminar3.Stream;
import JavaOOPSeminar3.StudentGroup;

import java.util.List;

public class StreamService {
    private Stream stream;

    public void createStream(List<StudentGroup> studentGroup) {
        this.stream = new Stream(studentGroup);
    }

    public Stream getStream() {
        return stream;
    }

}
