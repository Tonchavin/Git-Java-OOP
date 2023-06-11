package task4;

import task4.controler.StudentController;
import task4.model.Student;
import task4.model.StudentGroup;
import task4.repository.StudentRepository;
import task4.service.StudentService;
import task4.view.SortType;
import task4.view.StudentView;
import task4.view.UserView;

public class Main {
    public static void main(String[] args) {
        StudentView view = getStudentView();
//        StudentRepository repository = new StudentRepository();
//        StudentService service = new StudentService(repository);
//        StudentController controller = new StudentController(service);
//        StudentGroup group = new StudentGroup();
//----------------------------------------------------------------------
        view.create("Ivan Morozov",18,"02");
        view.create("Petr Vorobev",19,"03");
        view.create("Sidor Sidorov",20,"112");
        view.sendOnConsole(SortType.NONE);
        view.create("Elena Ivanova",19,"911");
        view.create("Anna Morozova",17, "01");
        view.sendOnConsole(SortType.NONE);
        view.sendOnConsole(SortType.NAME);
        view.sendOnConsole(SortType.FAMILY);
        view.sendOnConsole(SortType.AGE);
//        controller.addStudent(new Student(4L, "Ivan Morozov"));
//        controller.addStudent(new Student(6L, "Petr Vorobev"));
//        controller.addStudent(new Student(2L, "Sidor Sidorov"));
//        controller.addStudent(new Student(1L, "Elena Ivanova"));
//        controller.addStudent(new Student(8L, "Anna Morozova"));
//        controller.printAll();
//        controller.sortStudents();
//        controller.printAll();
//        controller.sortByFamilyName();
//        controller.printAll();
    }

    private static StudentView getStudentView() {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);
//        StudentGroup group = new StudentGroup();
        return new StudentView(controller);
    }
}
