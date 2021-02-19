package homeWork2.pattern.decorator;

public class TextEncryptionDao implements TextDao {
    private final TextDao textDao;

    public TextEncryptionDao(TextDao textDao) {
        this.textDao = textDao;
    }

    @Override
    public void saveText(String text) {
        String encrypted = encryptText(text);
        textDao.saveText(encrypted);
    }

    @Override
    public String getText() {
        return decryptText(textDao.getText());
    }

    private String encryptText(String text) {
        char[] chars = text.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char c : chars) {
            builder.append(++c);
        }
        return builder.toString();
    }

    private String decryptText(String text) {
        char[] chars = text.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char c : chars) {
            builder.append(--c);
        }
        return builder.toString();
    }
}
