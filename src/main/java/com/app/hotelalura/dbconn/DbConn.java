package com.app.hotelalura.dbconn;

import com.app.hotelalura.utils.enviroment.EnvVariables;
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
        poolDataSource.setUser(EnvVariables.getEnv("MYSQL_USER"));
        poolDataSource.setPassword(EnvVariables.getEnv("MYSQL_ROOT_PASSWORD"));
        poolDataSource.setJdbcUrl(EnvVariables.getEnv("URL"));
        
        this.dataSource= poolDataSource;
    }
    
    public Connection getConnection() throws SQLException,Exception,RuntimeException{
        return dataSource.getConnection();
    }
    public static DbConn getInstance(){
        return instance;
    }
}
