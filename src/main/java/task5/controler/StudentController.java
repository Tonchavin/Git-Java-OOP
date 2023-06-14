package task5.controler;

import task5.model.Student;
import task5.model.Teacher;
import task5.service.StudentService;
import task5.service.UserService;

import java.util.List;

public class StudentController implements UserController<Student> {

    public UserService<Student> studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void create(Teacher teacher, List<Student> studentsList) {

    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        studentService.create(fullName, age, phoneNumber);
    }

    @Override
    public List<Student> getAllSortUsers() {
        return studentService.getAllSortUsers();
    }

    @Override
    public List<Student> getAllSortUsersByFamilyName() {
        return studentService.getAllSortUsersByFamilyName();
    }

    @Override
    public boolean removeUser(String fullName) {
        studentService.removeUser(fullName);
        return true;
    }

    @Override
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @Override
    public List<Student> getAllSortUsersByAge() {
        return studentService.getAllSortUsersByAge();
    }
}
