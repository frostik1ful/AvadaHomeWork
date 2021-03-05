package homeWork4.mvc.dao;

import homeWork3.pattern.command.DatabaseService;
import homeWork4.mvc.model.Model;
import homeWork4.mvc.model.User;


public class DatabaseDao {
    private final DatabaseService databaseService = new DatabaseService();
    public Model getModel() {
        return new User(databaseService.getUsers().get(0));
    }
}
