package homeWork4.mvp;

import homeWork4.mvp.presenter.Presenter;
import homeWork4.mvp.view.ConsoleView;
import homeWork4.mvp.view.HtmlView;
import homeWork4.mvp.view.View;

public class Launcher {
    public static void main(String[] args) {
        View htmlView = new HtmlView();
        View consoleView = new ConsoleView();
        Presenter htmlPresenter = new Presenter(htmlView);
        Presenter consolePresenter = new Presenter(consoleView);

        htmlView.updateData();
        consoleView.updateData();
    }
}
