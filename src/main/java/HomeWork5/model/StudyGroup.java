package HomeWork5.model;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup extends User {
    private String Teacher;
    private List<Student> students;

    public StudyGroup(Long id, String fullName, Integer age, String phoneNumber, String teacher, List<Student> students) {
        super(id, fullName, age, phoneNumber);
        Teacher = teacher;
        this.students = students;
    }
    public void addGroupId(HomeWork5.model.Teacher teacher, List<Student> students){
        List<HomeWork5.model.Teacher> studyGroups = new ArrayList<>();
        studyGroups.add(teacher);
        studyGroups.add((HomeWork5.model.Teacher) students);
    }
}
