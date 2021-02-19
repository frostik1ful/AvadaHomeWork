package homeWork2.pattern.proxy;

public class User {
    private final UserType userType;

    public User(UserType userType) {
        this.userType = userType;
    }

    public UserType getUserType() {
        return userType;
    }

    public enum UserType{
        USER,ADMIN
    }
}
