package homeWork3.pattern.command;

public class EmailCommand extends Command {

    public EmailCommand(TextView textView, DatabaseService service) {
        super(textView, service);
    }

    @Override
    public void execute() {
        textView.setText(service.getEmails().toString());
    }
}
