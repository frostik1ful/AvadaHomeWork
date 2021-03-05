package homeWork4.mvc.view;


import homeWork4.mvc.model.Model;

public class ConsoleView implements View {
    private String info;


    @Override
    public void setModel(Model model) {
        info = model.toString();
    }

    @Override
    public void show() {
        System.out.println("console output: " + info);
    }
}
