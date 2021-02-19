package homeWork2.pattern.proxy;

public class DataService implements IData{
    private DataDao dao = new DataDao();
    @Override
    public String getName() {
        return dao.getName();
    }

    @Override
    public String getPassword() {
        return dao.getPassword();
    }
}
