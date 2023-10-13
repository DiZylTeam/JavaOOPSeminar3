package JavaOOPSeminar3.Controller;

import JavaOOPSeminar3.Service.DataService;
import JavaOOPSeminar3.Service.StreamService;
import JavaOOPSeminar3.Service.StudentGroupService;
import JavaOOPSeminar3.Student;
import JavaOOPSeminar3.Teacher;
import JavaOOPSeminar3.User;
import JavaOOPSeminar3.View.UserView;

import java.util.List;

public class UserController {

    private final DataService dataService = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final UserView userView = new UserView();

    private final StreamService streamService = new StreamService();

    public void createStudent(String firstName, String secondName, String lastName, String birthDate){
        dataService.create(firstName, secondName, lastName, birthDate);
        List<User> userList = dataService.getAll();
        userView.sendOnConsole(userList);
    }

    public void createStudentGroup(Teacher teacher, List<Student> students){
        studentGroupService.createStudentGroup(teacher, students);
    }

    public Student getStudentInStudentGroup(String firstName, String secondName){
        return studentGroupService.getStudentFromStudentGroup(firstName, secondName);
    }

    public List<Student> getSortedListStudentFromStudentGroup(){
        return studentGroupService.getSortedStudentGroup();
    }

    public List<Student> getSortedListByFIOStudentFromStudentGroup(){
        return studentGroupService.getSortedByFIOStudentGroup();
    }
}
