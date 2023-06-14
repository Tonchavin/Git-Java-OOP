package task5.service;

import task5.model.Student;
import task5.model.StudentGroup;
import task5.model.Teacher;
import task5.model.WorkGroup;
import task5.repository.StudentRepository;
import task5.repository.UserRepository;

import javax.management.openmbean.CompositeData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WorkGroupService {

    public List<WorkGroup> workGroupList(Teacher teacher, List<Student> studentsList){
        return workGroupList(teacher,studentsList);
    }

    public List<WorkGroup> getAll() {
        return null;
    }
}
