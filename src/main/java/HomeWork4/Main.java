package HomeWork4;

import HomeWork4.controler.TeacherController;
import HomeWork4.repository.TeacherRepository;
import HomeWork4.service.TeacherService;
import HomeWork4.view.SortType;
import HomeWork4.view.TeacherView;

public class Main {
    public static void main(String[] args) {
        TeacherView view = getTeacherView();

//----------------------------------------------------------------------
        view.create("Fedor Morozov", 33, "33");
        view.create("Petr Hlebov", 54, "4456");
        view.create("Sidor Menof", 50, "114");
        view.create("Elena Petrova", 42, "91");
        view.create("Anna Hpeg", 38, "101");
        view.sendOnConsole(SortType.NONE);
        view.sendOnConsole(SortType.NAME);
        view.sendOnConsole(SortType.FAMILY);
        view.sendOnConsole(SortType.AGE);
    }

    private static TeacherView getTeacherView() {
        TeacherRepository repository = new TeacherRepository();
        TeacherService service = new TeacherService(repository);
        TeacherController controller = new TeacherController(service);
        return new TeacherView(controller);
    }
}
