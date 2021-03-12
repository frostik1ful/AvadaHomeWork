package homeWork4.mvc.view;


import homeWork4.mvc.controller.Controller;
import homeWork4.mvc.model.Model;

public class ConsoleView implements View {
    private String info;
    private Controller controller;

    public ConsoleView(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void setModel(Model model) {
        info = model.toString();
    }

    @Override
    public void show() {
        this.controller.getInfoFromDatabase(this);
        System.out.println("console output: " + info);
    }
}
