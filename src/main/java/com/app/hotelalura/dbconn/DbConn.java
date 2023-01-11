package com.app.hotelalura.dbconn;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;

public class DbConn {
    private String user="root";
    private String password="mysql";
    private String dbname= "test";
    private String url="jdbc:mysql://localhost/test";
    private static final DbConn instance=new DbConn();
    private String driverClass="com.mysql.cj.jdbc.Driver";
    private final DataSource dataSource;
    
    private DbConn(){
        ComboPooledDataSource poolDataSource= new ComboPooledDataSource();
        try {
            poolDataSource.setDriverClass(driverClass);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(DbConn.class.getName()).log(Level.SEVERE, null, ex);
        }
        poolDataSource.setMaxPoolSize(10);
        poolDataSource.setUser(user);
        poolDataSource.setPassword(password);
        poolDataSource.setJdbcUrl(url);
        
        this.dataSource= poolDataSource;
    }
    
    public static Connection getConnection() throws SQLException{
        return instance.exposeConnection();
    }
    public Connection exposeConnection() throws SQLException{
        return this.dataSource.getConnection();
    }
    public void setUser(String user){
        this.user= user;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setDbName(String dbname){
        this.dbname=dbname;
    }
    public void setUrl(String url){
        this.url=url;
    }
   
    public static DbConn getInstance(){
        return instance;
    }
}
