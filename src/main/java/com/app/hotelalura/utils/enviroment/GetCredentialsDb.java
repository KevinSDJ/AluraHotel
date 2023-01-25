package com.app.hotelalura.utils.enviroment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GetCredentialsDb {
     private String user;
     private String password;
     private String dbname;
     private String url;
     private String secret;
     private final static GetCredentialsDb instance=new GetCredentialsDb();
     
     private GetCredentialsDb(){
        File file = null;
        FileReader fileReader = null;
        BufferedReader buff = null;
         try {
            file = new File(System.getProperty("user.dir") + "/.env");
            fileReader = new FileReader(file);
            buff = new BufferedReader(fileReader);
            String line;
            Map<String,String> env= new HashMap<>();
            while ((line = buff.readLine()) != null) {
                env.put(line.split("=")[0], line.split("=")[1]);
            }
            this.user=env.get("MYSQL_USER");
            this.password= env.get("MYSQL_ROOT_PASSWORD");
            this.url=env.get("URL");
            this.secret=env.get("SECRET");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fileReader) {
                    fileReader.close();
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
         
     }

     public static String getUser(){
          return instance.user;
     }
     public static String getPassword(){
         return instance.password;
     }
     public static String getDbName(){
         return instance.dbname;
     }
     public static String getUrl(){
         return instance.url;
     }
     public static String getSecret(){
         return instance.secret;
     }
}
