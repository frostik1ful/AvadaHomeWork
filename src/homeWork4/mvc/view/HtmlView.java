package homeWork4.mvc.view;

import homeWork4.mvc.controller.Controller;
import homeWork4.mvc.model.Model;

public class HtmlView implements View{
   private String info="";
   private Controller controller;

    public HtmlView(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void setModel(Model model) {
        info = "<html><body><h1>"+model.toString()+"</h1></body></html>";
    }

    @Override
    public void show() {
        this.controller.getInfoFromFile(this);
        System.out.println(info);
    }
}
