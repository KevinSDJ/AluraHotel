package com.app.hotelalura.utils;

import com.app.hotelalura.utils.base.Observer;
import com.app.hotelalura.utils.base.Subject;


public class InitToLoginChnn {
    private Subject subject= new Subject();
    private static final InitToLoginChnn instance = new InitToLoginChnn();
    
    private InitToLoginChnn(){}
    
    
    public static void notifyEvent(){
        instance.subject.notifyAction();
    }
    public static void addObserver(Observer observer){
        instance.subject.subscribe(observer);
    }
    public static void removeObserver(Observer observer){
        instance.subject.unsubscribe(observer);
    }
        
}
