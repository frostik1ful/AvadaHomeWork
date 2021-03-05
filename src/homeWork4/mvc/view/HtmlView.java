package homeWork4.mvc.view;

import homeWork4.mvc.controller.Controller;
import homeWork4.mvc.model.Model;

public class HtmlView implements View{
   private String info="";





    @Override
    public void setModel(Model model) {
        info = "<html><body><h1>"+model.toString()+"</h1></body></html>";
    }

    @Override
    public void show() {
        System.out.println(info);
    }
}
