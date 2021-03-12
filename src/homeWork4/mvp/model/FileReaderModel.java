package homeWork4.mvp.model;



public class FileReaderModel implements Model {

    @Override
    public String getData() {
        return readNameFromFile();
    }
    private String readNameFromFile() {
        return "Mike";
    }
}
