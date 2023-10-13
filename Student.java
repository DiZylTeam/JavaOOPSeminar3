package JavaOOPSeminar3;

public class Student extends User implements Comparable<Student>{
    private Long studentId;

    public Student(String firstName, String secondName, String lastName, String birthDate, Long studentId) {
        super(firstName, secondName, lastName, birthDate);
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId = " + studentId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", birthDate=" + super.getBirthDate() +
                '}';
    }

    @Override
    public int compareTo(Student o) {       // метод для сравнения текущего значения со следующим
        if (this.studentId == o.studentId)
            return 0;
        else if (this.studentId < o.studentId)
            return -1;
        return 1;
        // return this.studentId.compareTo(o.studentId);
    }
}
