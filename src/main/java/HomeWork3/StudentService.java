package HomeWork3;

import lombok.ToString;

import java.lang.annotation.Target;
import java.util.*;

public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }

    public void printAll() {
        for (Student student : studentRepository.getStudentGroup()) {
            System.out.println(student);
        }
    }

    public void deleteStudent(String fullName) {
        Iterator<Student> iterator = studentRepository.getStudentGroup().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getFullName().equals(fullName)) {
                iterator.remove();
            }
        }
    }

    public void SortName() {
        List<Student> students = new ArrayList<>();
        for (Student student : studentRepository.getStudentGroup()) {
            students.add(student);
        }
        Collections.sort(students);
        for (Student var : students
        ) {
            System.out.println(var);
        }
    }

//    public void SortLastName() {
//        List<Student> students = new ArrayList<>();
//        for (Student student : studentRepository.getStudentGroup()) {
//            String[] temp = student.getFullName().split(" ", 2);
//            for (String var : student.getFullName().split(" ", 2)
//            ) {
//                System.out.println(var);
//            }
//        }
//
//    }
//        public List<Student> SortLastName() {
//        List<Student> std = new ArrayList<>();
//            for (Student student:this
//                 ) {
//                std.add(student);
//            }
//            return std;
//    }
}
