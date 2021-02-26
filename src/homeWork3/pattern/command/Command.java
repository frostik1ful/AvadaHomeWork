package homeWork3.pattern.command;

import java.util.List;

public abstract class Command implements ICommand{
    final TextView textView;
    final DatabaseService service;


    public Command(TextView textView, DatabaseService service) {
        this.textView = textView;
        this.service = service;
    }

    //public abstract void execute();

}
