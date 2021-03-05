package homeWork4.mvp.view;


import homeWork4.mvp.presenter.Presenter;

public interface View {
    void setData(String data);
    void setPresenter(Presenter presenter);
    void updateData();
}
