package homeWork4;


import homeWork4.mvc.controller.Controller;
import homeWork4.mvp.presenter.Presenter;
import homeWork4.mvp.view.ConsoleView;
import homeWork4.mvp.view.HtmlView;

import homeWork4.mvp.view.View;
import homeWork4.mvvm.model.DatabaseModel;
import homeWork4.mvvm.modelView.ViewModel;
import homeWork4.mvvm.view.TextView;

public class Launcher {
    public static void main(String[] args) {
        /*//MVC
        Controller controller = new Controller();
        View consoleView = new ConsoleView();
        View htmlView = new HtmlView();

        controller.getInfoFromDatabase(consoleView);
        controller.getInfoFromFile(htmlView);

        consoleView.show();
        htmlView.show();
        //MVP
        View htmlView = new HtmlView();
        View consoleView = new ConsoleView();
        Presenter htmlPresenter = new Presenter(htmlView);
        Presenter consolePresenter = new Presenter(consoleView);

        htmlView.updateData();
        consoleView.updateData();
        //MVVM
        DatabaseModel databaseModel = new DatabaseModel();
        TextView textView = new TextView();
        ViewModel viewModel = new ViewModel(textView,databaseModel);
        textView.writeText("some text");
        databaseModel.setData("new text");*/
    }
}
