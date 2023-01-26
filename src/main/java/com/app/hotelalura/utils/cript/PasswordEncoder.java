package com.app.hotelalura.utils.cript;

import com.password4j.Hash;
import com.password4j.HashChecker;
import com.password4j.Password;

public class PasswordEncoder {
  
   
    private static final PasswordEncoder instance= new PasswordEncoder();

    private PasswordEncoder() {
       
    }

    public String encode(String text) throws Exception{
        
        Hash hash= Password.hash(text)
                .addPepper("secret")
                .addRandomSalt(32).withArgon2();
       
        return hash.getResult();
    };
    
    public Boolean compare(String textPlain, String encodertext){
        HashChecker check = Password.check(textPlain, encodertext);
        check.addPepper("secret");
         return check.withArgon2();
    }
    public static PasswordEncoder getUtils(){
        return instance;
    };

}
