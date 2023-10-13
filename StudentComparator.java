package JavaOOPSeminar3;

import java.util.Comparator;
// создание Компаратора
public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());   // сравниваем по именам
        if (resultOfComparing == 0) {       // если они равны, т.е. результат равен 0 ->
            resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());   // сравниваем по отчествам
            if (resultOfComparing == 0) {   // если отчества равны ->
                return o1.getLastName().compareTo(o2.getLastName());    // возвращаем сравнение по фамилиям
            } else {
                return resultOfComparing;   // иначе возвращаем сравнение по отчествам
            }
        } else {
            return  resultOfComparing;  // иначе возвращаем сравнение по именам
        }
    }
}
