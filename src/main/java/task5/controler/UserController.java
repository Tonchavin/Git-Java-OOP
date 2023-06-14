package task5.controler;

import task5.model.Student;
import task5.model.Teacher;
import task5.model.User;

import java.util.List;

public interface UserController<T extends User> {
    void create(Teacher teacher, List<Student> studentsList);

    void create(String fullName, Integer age, String phoneNumber);

    List<T> getAllSortUsers();

    List<T> getAllSortUsersByFamilyName();

    boolean removeUser(String fullName);

    List<T> getAll();

    List<T> getAllSortUsersByAge();

}
