package homeWork4.mvp.view;

import homeWork4.mvc.model.Model;
import homeWork4.mvp.presenter.Presenter;

public class HtmlView implements View {
   private String info;
   private Presenter presenter;

    @Override
    public void setData(String data) {
        info = "<html><body><h1>"+data+"</h1></body></html>";
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void updateData() {
        presenter.updateDataFromFile();
        System.out.println(info);
    }
}
