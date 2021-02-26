package homeWork3.pattern.iterator;

public class User {
    private String name;
    private UserType userType;

    public User(String name, UserType userType) {
        this.name = name;
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", userType=" + userType +
                '}';
    }

    public String getName() {
        return name;
    }

    public UserType getUserType() {
        return userType;
    }

    public enum UserType{
        USER,ADMIN
    }
}
