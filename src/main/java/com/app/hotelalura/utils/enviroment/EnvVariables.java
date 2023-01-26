package com.app.hotelalura.utils.enviroment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class EnvVariables {
     private  Map<String,String> env;
     private final static EnvVariables instance=new EnvVariables();
     
     private EnvVariables(){
        File file;
        FileReader fileReader=null;
        BufferedReader buff;
        env=new HashMap<>();
         try {
            file = new File(System.getProperty("user.dir") + "/.env");
            fileReader = new FileReader(file);
            buff = new BufferedReader(fileReader);
            String line;
            while ((line = buff.readLine()) != null) {
                if(!line.isEmpty()){
                    env.put(line.split("=")[0], line.split("=")[1]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader!=null) {
                    fileReader.close();
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
         
     }
     
     private Map<String,String> exposeEnv(){
         return env;
     }
     
     public static String getEnv(String key){
         return instance.exposeEnv().get(key);
     }
}
