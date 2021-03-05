package homeWork4.mvc.controller;


import homeWork4.mvc.dao.DatabaseDao;
import homeWork4.mvc.dao.FileReaderDao;
import homeWork4.mvc.view.View;


public class Controller {
    private final DatabaseDao database = new DatabaseDao();
    private final FileReaderDao fileReader = new FileReaderDao();

    public void getInfoFromFile(View view){
       view.setModel(fileReader.getModel());
    }
    public void getInfoFromDatabase(View view){
        view.setModel(database.getModel());
    }

}
