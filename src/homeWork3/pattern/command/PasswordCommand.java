package homeWork3.pattern.command;

public class PasswordCommand extends Command {
    public PasswordCommand(TextView textView, DatabaseService service) {
        super(textView, service);
    }

    @Override
    public void execute() {
        textView.setText(service.getPasswords().toString());
    }
}
