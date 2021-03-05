package homeWork4.mvvm.view;

import homeWork4.mvvm.modelView.ViewModel;

public class TextView {
    private String text;
    private ViewModel viewModel;
    public String getText() {
        return text;
    }
    public void writeText(String text){
        this.text = text;
        viewModel.updateModel(text);
    }
    public void setText(String text) {
        this.text = text;
        System.out.println("textView updated text = "+text);
    }

    public void setViewModel(ViewModel viewModel) {
        this.viewModel = viewModel;
    }
}
