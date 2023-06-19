package HomeWork5.service;

import HomeWork5.model.Student;
import HomeWork5.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {
    public List<Teacher> StudyGroupServices(Teacher teacher, List<Student> studentList){
        List<Teacher> studyGroupService = new ArrayList<>();
        studyGroupService.add(teacher);
        studyGroupService.add((Teacher) studentList);
        return studyGroupService;
    }
}
