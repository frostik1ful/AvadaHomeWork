package homeWork4.mvvm;

import homeWork4.mvvm.model.DatabaseModel;
import homeWork4.mvvm.modelView.ViewModel;
import homeWork4.mvvm.view.TextView;

public class Launcher {
    public static void main(String[] args) {
        DatabaseModel databaseModel = new DatabaseModel();
        TextView textView = new TextView();
        ViewModel viewModel = new ViewModel(textView,databaseModel);
        textView.writeText("some text");
        databaseModel.setData("new text");
    }
}
