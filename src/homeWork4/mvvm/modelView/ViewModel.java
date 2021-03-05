package homeWork4.mvvm.modelView;

import homeWork4.mvvm.model.DatabaseModel;
import homeWork4.mvvm.view.TextView;

public class ViewModel {
    private final TextView textView;
    private final DatabaseModel databaseModel;

    public ViewModel(TextView textView, DatabaseModel databaseModel) {
        this.textView = textView;
        this.databaseModel = databaseModel;
        textView.setViewModel(this);
        databaseModel.setViewModel(this);
    }

    public void updateView(String s){
        textView.setText(s);
    }
    public void updateModel(String s){
        databaseModel.setDataFromViewModel(s);
    }
}
