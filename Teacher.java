package JavaOOPSeminar3;

public class Teacher extends User{
    private Long teacherId;

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Teacher(String firstName, String secondName, String lastName, String birthDate, Long teacherId) {
        super(firstName, secondName, lastName, birthDate);
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId = " + teacherId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", birthDate=" + super.getBirthDate() +
                '}';
    }
}
