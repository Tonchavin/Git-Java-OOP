package task5;

import task5.controler.StudentController;
import task5.controler.TeacherController;
import task5.repository.StudentRepository;
import task5.repository.TeacherRepository;
import task5.service.StudentService;
import task5.service.TeacherService;
import task5.view.SortType;
import task5.view.StudentView;
import task5.view.TeacherView;

public class Main {
    public static void main(String[] args) {
        StudentView view = getStudentView();
        TeacherView view2 = getTeacherView();

//----------------------------------------------------------------------
        view.create("Ivan Morozov", 18, "02");
        view.create("Petr Vorobev", 19, "03");
        view.create("Sidor Sidorov", 20, "112");
        view.create("Elena Ivanova", 19, "911");
        view.create("Anna Morozova", 17, "01");
//----------------------------------------------------------------------
        view2.create("Petr Hlebov", 54, "4456");
//----------------------------------------------------------------------
        view.sendOnConsole(SortType.AGE);

//----------------------------------------------------------------------
        view2.sendOnConsole(SortType.AGE);
    }

    private static TeacherView getTeacherView() {
        TeacherRepository repository = new TeacherRepository();
        TeacherService service = new TeacherService(repository);
        TeacherController controller = new TeacherController(service);
        return new TeacherView(controller);
    }

    private static StudentView getStudentView() {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);
        return new StudentView(controller);
    }
}
