package homeWork4.mvp.view;


import homeWork4.mvp.presenter.Presenter;

public class ConsoleView implements View {
    private  Presenter presenter;
    private String info;

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void updateData() {
        presenter.getDataFromDB();
        System.out.println("console: "+info);
    }

    @Override
    public void setData(String data) {
        info = data;
    }
}
