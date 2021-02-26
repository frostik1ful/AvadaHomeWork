package homeWork3.pattern.command;

public class Button {
    private ICommand command;


    public Button(ICommand command) {
        this.command = command;
    }
    public Button(){

    }

    public void click() {
        command.execute();

    }

    public void setCommand(ICommand command) {
        this.command = command;
    }


}
