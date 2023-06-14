package task5.service;

import task5.model.Student;
import task5.model.Teacher;
import task5.model.User;
import task5.repository.TeacherRepository;
import task5.repository.UserRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TeacherService implements UserService<Teacher> {
    private final UserRepository<Teacher> teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }


    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        Long id = teacherRepository.getMaxId() + 1;
        Teacher teacher = new Teacher(id, fullName, age, phoneNumber);
        teacherRepository.add(teacher);
    }

    @Override
    public List<Teacher> getAll() {
        return teacherRepository.getAll();
    }

    @Override
    public List<Teacher> getAllSortUsers() {
        List<Teacher> teachers = teacherRepository.getAll();
        Collections.sort(teachers);
        return teachers;
    }

    @Override
    public List<Teacher> getAllSortUsersByFamilyName() {
        List<Teacher> teachers = teacherRepository.getAll();
        teachers.sort(new UserComparator<>());
        return teachers;
    }

    @Override
    public List<Teacher> getAllSortUsersByAge() {
        List<Teacher> teachers = teacherRepository.getAll();
        teachers.sort(Comparator.comparing(User::getAge));
        return teachers;
    }

    @Override
    public void removeUser(String fullName) {
        teacherRepository.remove(fullName);
    }

    @Override
    public List<Teacher> getAllId() {
        return null;
    }

    @Override
    public void create(Teacher teacher, List<Student> studentsList) {

    }
}
