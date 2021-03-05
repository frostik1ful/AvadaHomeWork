package homeWork4.mvp.presenter;

import homeWork4.mvp.model.DatabaseModel;
import homeWork4.mvp.model.FileReaderModel;
import homeWork4.mvp.model.Model;
import homeWork4.mvp.view.View;

public class Presenter {
    private final View view;
    private Model databaseModel = new DatabaseModel();
    private Model fileReaderModel = new FileReaderModel();

    public Presenter(View view) {
        this.view = view;
        view.setPresenter(this);
    }

    public void getDataFromDB() {
        view.setData(databaseModel.getData());
    }
    public void updateDataFromFile(){
        view.setData(fileReaderModel.getData());
    }
}
