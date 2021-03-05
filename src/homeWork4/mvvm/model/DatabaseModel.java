package homeWork4.mvvm.model;

import homeWork4.mvvm.modelView.ViewModel;

public class DatabaseModel {
    private ViewModel viewModel;
    private String data;
    public void setDataFromViewModel(String s){
        System.out.println("text received from textView = "+s);
        this.data = s;
    }
    public void setData(String s){
        this.data = s;
        viewModel.updateView(s);

    }

    public void setViewModel(ViewModel viewModel) {
        this.viewModel = viewModel;
    }
}
