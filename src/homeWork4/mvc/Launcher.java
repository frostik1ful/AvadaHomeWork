package homeWork4.mvc;

import homeWork4.mvc.controller.Controller;
import homeWork4.mvc.view.ConsoleView;
import homeWork4.mvc.view.HtmlView;
import homeWork4.mvc.view.View;


public class Launcher {
    public static void main(String[] args) {
        Controller controller = new Controller();
        View consoleView = new ConsoleView();
        View htmlView = new HtmlView();

        controller.getInfoFromDatabase(consoleView);
        controller.getInfoFromFile(htmlView);

        consoleView.show();
        htmlView.show();
    }
}
