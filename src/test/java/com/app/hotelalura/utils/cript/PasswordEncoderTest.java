package com.app.hotelalura.utils.cript;

import com.app.hotelalura.utils.enviroment.EnvVariables;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

public class PasswordEncoderTest {
    
    public PasswordEncoderTest(){}
    
    
    @Test
    public void testEncoder(){
         
        try {
            String ps=PasswordEncoder.getUtils().encode("12345");
            System.out.println(ps.length());
            assertEquals(true,true);
        } catch (Exception ex) {
            ex.printStackTrace();
            fail(ex.getMessage());
        }
    }
    @Test
    public void comparePassword(){
          
        try {
            String password = "12345";
            String passwordEncoder=PasswordEncoder.getUtils().encode(password);
            
            Boolean isEquals=PasswordEncoder.getUtils().compare(password, passwordEncoder);
            assertEquals(true,isEquals);
        } catch (Exception ex) {
            ex.printStackTrace();
            fail(ex.getMessage());
        }
    }
    
    @Test
    public void testEnviromentVar(){
       String d=EnvVariables.getEnv("SECRET");
       assertEquals(true, !d.isEmpty());
       fail("fail enviroment utils");
    }
    
}
