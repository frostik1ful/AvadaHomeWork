package homeWork3.pattern.command;

public class UserCommand extends Command {
    public UserCommand(TextView textView, DatabaseService service) {
        super(textView, service);
    }

    @Override
    public void execute() {
        textView.setText(service.getUsers().toString());
    }
}
