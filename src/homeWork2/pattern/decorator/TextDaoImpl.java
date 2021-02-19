package homeWork2.pattern.decorator;

public final class TextDaoImpl implements TextDao {
    private final DatabaseService service = new DatabaseService();

    @Override
    public void saveText(String text) {
        service.saveText(text);
    }

    @Override
    public String getText() {
        return service.getText();
    }
}

