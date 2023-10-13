package JavaOOPSeminar3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Test3();
    }

//    public static void Test1() {
//        Student student1 = new Student("Dmitry", "Nikolaevich", "Zyl", "04.09.1983", 111L);
//        Student student2 = new Student("Timofei", "Dmitrievich", "Zyl", "06.08.2000", 222L);
//        Student student3 = new Student("Ivan", "Petrovich", "Mask", "05.06.1999", 333L);
//        Student student4 = new Student("Sergei", "Sergeevich", "Kent", "01.01.2001", 444L);
//        Teacher teacher = new Teacher("Aleksandr", "Sergeevich", "Pushkin", "25.03.1900", 1010L);
//        List<Student> studentList = new ArrayList<>(List.of(new Student[]{student1, student2, student3, student4}));
//        StudentGroupIterator iterator = new StudentGroupIterator(studentList);
////            iterator.next();    // переходит и возвращает следующий элемент
////            iterator.remove();  // удаляет текущий элемент
////            iterator.zeroCount();   // обнуляет индекс созданным методом zeroCount()
//        StudentGroup studentGroup = new StudentGroup(studentList, teacher);
//        for (Student item : studentGroup) {     // цикл foreach для прохождения по списку
//            System.out.println((item));
//        }
//
////            while (iterator.hasNext()){       // цикл while для прохождения по списку с помощью итератора
////                System.out.println(iterator.next());
////            }
//    }

    // == Сравнение значений и сортировка по какому-либо признаку ==
    //              == (в нашем случае по studentID) ==
//    public static void Test2() {
//        Student student1 = new Student("Dmitry", "Nikolaevich", "Zyl", "04.09.1983", 111L);
//        Student student2 = new Student("Timofei", "Dmitrievich", "Zyl", "06.08.2000", 222L);
//        Student student3 = new Student("Ivan", "Petrovich", "Mask", "05.06.1999", 333L);
//        Student student4 = new Student("Sergei", "Sergeevich", "Kent", "01.01.2001", 444L);
//        Teacher teacher = new Teacher("Aleksandr", "Sergeevich", "Pushkin", "25.03.1900", 1010L);
//        List<Student> studentList = new ArrayList<>(List.of(new Student[]{student4, student2, student3, student1}));
//
//        for (Student item : studentList) {  // перебор и вывод списка в изначальном состоянии
//            System.out.println((item));
//        }
//        System.out.println();
//        Collections.sort(studentList);  // сортируем список с помощью метода sort в классе Collections
//        for (Student item : studentList) {  // перебираем новый отсортированный список и выводим на консоль
//            System.out.println(item);
//        }
//    }

    public static void Test3() {
        Student student1 = new Student("Dmitry", "Nikolaevich", "Zyl", "04.09.1983", 111L);
        Student student2 = new Student("Timofei", "Dmitrievich", "Zyl", "06.08.2000", 222L);
        Student student3 = new Student("Ivan", "Petrovich", "Mask", "05.06.1999", 333L);
        Student student4 = new Student("Sergei", "Sergeevich", "Kent", "01.01.2001", 444L);
        Teacher teacher = new Teacher("Aleksandr", "Sergeevich", "Pushkin", "25.03.1900", 1010L);
        List<Student> studentList1 = new ArrayList<>(List.of(new Student[]{student4, student2, student3, student1}));

        Student student5 = new Student("Sergei", "Petrovich", "Petrov", "15.06.1995", 555L);
        Student student6 = new Student("Aleksei", "Sergeevich", "Sidorov", "09.05.2003", 666L);
        Student student7 = new Student("Nikolai", "Nikolaevich", "Lomov", "18.11.2005", 777L);
        Student student8 = new Student("Sergei", "Dmitrievich", "Tolstoy", "05.04.1991", 888L);
        Teacher teacher2 = new Teacher("Fyodor", "Petrovich", "Ivanov", "15.09.1956", 1111L);
        List<Student> studentList2 = new ArrayList<>(List.of(new Student[]{student7, student5, student8, student6}));


        List<StudentGroup> studentGroupList1 = new ArrayList<>(List.of(new StudentGroup(studentList1, teacher)));
        // System.out.println("StudentGroup №1: " + studentGroupList1);
        List<StudentGroup> studentGroupList2 = new ArrayList<>(List.of(new StudentGroup(studentList2, teacher2)));
        // System.out.println("StudentGroup №2: " + studentGroupList2);

        List<Stream> stream1 = new ArrayList<>();
        stream1.add(new Stream(studentGroupList1));
        stream1.add(new Stream(studentGroupList2));
        System.out.println("Stream №1: " + stream1);




//        for (Student item : studentList1) {  // перебор и вывод списка в изначальном состоянии
//            System.out.println((item));
//        }
//        System.out.println();
//        Collections.sort(studentList1);  // сортируем список с помощью метода sort в классе Collections
//        for (Student item : studentList1) {  // перебираем новый отсортированный список и выводим на консоль
//            System.out.println(item);
//        }
    }
}
