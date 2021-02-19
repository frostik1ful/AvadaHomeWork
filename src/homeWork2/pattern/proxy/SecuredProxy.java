package homeWork2.pattern.proxy;

public class SecuredProxy implements IData{
    private final User user;
    private final IData service;
    public SecuredProxy(User user, IData service) {
        this.user = user;
        this.service = service;
    }

    @Override
    public String getName() {
        if (user.getUserType() == User.UserType.ADMIN){
            return service.getName();
        }
        return "Access is denied";
    }

    @Override
    public String getPassword() {
        if (user.getUserType() == User.UserType.ADMIN){
            return service.getPassword();
        }
        return "Access is denied";
    }
}
