package homeWork1.pattern.builder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBuilder {
    private String url;
    private String userName;
    private String password;

    public ConnectionBuilder buildConnection(){
        reset();
        return this;
    }
    public ConnectionBuilder setUrl(String url){
        this.url = url;
        return this;
    }
    public ConnectionBuilder setUserName(String userName){
        this.userName = userName;
        return this;
    }
    public ConnectionBuilder setPassword(String password){
        this.password = password;
        return this;
    }
    public Connection build() throws SQLException {
        return  DriverManager.getConnection(url,userName,password);
    }
    private void reset(){
        this.url = null;
        this.userName = null;
        this.password = null;
    }
}
