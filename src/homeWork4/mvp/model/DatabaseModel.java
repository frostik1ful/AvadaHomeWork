package homeWork4.mvp.model;

import homeWork3.pattern.command.DatabaseService;


public class DatabaseModel implements Model {
    private final DatabaseService databaseService = new DatabaseService();


    @Override
    public String getData() {
        return databaseService.getUsers().get(0);
    }
}
