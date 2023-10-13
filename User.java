package JavaOOPSeminar3;

import java.util.Objects;

public class User {
    private String firstName;
    private String secondName;
    private String lastName;
    private String birthDate;

    public User(String firstName, String secondName, String lastName, String birthDate) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return  "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Objects.equals(getFirstName(), student.getFirstName()) && Objects.equals(getSecondName(), student.getSecondName()) && Objects.equals(getLastName(), student.getLastName()) && Objects.equals(getBirthDate(), student.getBirthDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getSecondName(), getLastName(), getBirthDate());
    }
}
