package homeWork2.pattern.proxy;

public class CashedProxy implements IData{
    private final IData service;
    private String name;
    private String password;
    public CashedProxy(IData service) {
        this.service = service;
    }

    @Override
    public String getName() {
        if (name == null){
            name = service.getName();
        }
        return name;
    }

    @Override
    public String getPassword() {
        if (password == null){
            password = service.getPassword();
        }
        return password;
    }
}
