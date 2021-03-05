package homeWork4.mvc.dao;


import homeWork4.mvc.model.Model;
import homeWork4.mvc.model.User;

public class FileReaderDao {

    public Model getModel() {
        return new User(readNameFromFile());
    }

    private String readNameFromFile() {
        return "Mike";
    }
}
