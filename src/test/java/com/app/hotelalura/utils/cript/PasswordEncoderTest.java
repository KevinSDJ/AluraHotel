package com.app.hotelalura.utils.cript;

import com.app.hotelalura.utils.enviroment.GetCredentialsDb;
import org.junit.Assert;
import org.junit.Test;

public class PasswordEncoderTest {
    
    public PasswordEncoderTest(){}
    
    
    @Test
    public void testEncoder(){
         
        try {
            PasswordEncoder.getUtils().encode("12345");
            Assert.assertEquals(true,true);
        } catch (Exception ex) {
            ex.printStackTrace();
            Assert.fail(ex.getMessage());
        }
    }
    @Test
    public void comparePassword(){
          
        try {
            String password = "12345";
            String passwordEncoder=PasswordEncoder.getUtils().encode(password);
            
            Boolean isEquals=PasswordEncoder.getUtils().compare(password, passwordEncoder);
            Assert.assertEquals(true,isEquals);
        } catch (Exception ex) {
            ex.printStackTrace();
            Assert.fail(ex.getMessage());
        }
    }
    
    @Test
    public void testEnviromentVar(){
         try {
            System.out.println(GetCredentialsDb.getSecret());
            Assert.assertEquals(true,true);
        } catch (Exception ex) {
            ex.printStackTrace();
            Assert.fail(ex.getMessage());
        }
    }
    
}
