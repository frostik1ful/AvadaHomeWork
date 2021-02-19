package homeWork2.pattern.proxy;

public class DataDao {
    private final String name = "secretName";
    private final String password = "secretPassword";

    public String getName() {
        try {
            System.out.println("retrieving data from DB...");
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return name;
    }

    public String getPassword() {
        try {
            System.out.println("retrieving data from DB...");
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return password;
    }
}
