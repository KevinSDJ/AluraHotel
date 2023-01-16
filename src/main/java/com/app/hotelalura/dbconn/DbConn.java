package com.app.hotelalura.dbconn;

import com.app.hotelalura.utils.enviroment.GetCredentialsDb;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;

public class DbConn {
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
        poolDataSource.setUser(GetCredentialsDb.getUser());
        poolDataSource.setPassword(GetCredentialsDb.getPassword());
        poolDataSource.setJdbcUrl(GetCredentialsDb.getUrl());
        
        this.dataSource= poolDataSource;
    }
    
    public static Connection getConnection() throws SQLException{
        return instance.exposeConnection();
    }
    public Connection exposeConnection() throws SQLException{
        return this.dataSource.getConnection();
    }
   
    public static DbConn getInstance(){
        return instance;
    }
}
