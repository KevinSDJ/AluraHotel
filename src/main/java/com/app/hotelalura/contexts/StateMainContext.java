package com.app.hotelalura.contexts;

import com.app.hotelalura.utils.base.Observer;
import com.app.hotelalura.utils.base.Subject;

public class StateMainContext extends Subject<Boolean>{
    private static final StateMainContext instance=new StateMainContext();
    
    private StateMainContext(){}
    
    public static void addState(Boolean s){
          instance.insertState(s);
    }
   
    public static void changeLoginState(){
        instance.setState(!instance.getState());
        instance.notifyAction(instance.getState());
    }
    
    public static void addObserver(Observer observer){
        instance.subscribe(observer);
    }
    public static void removeObserver(Observer observer){
        instance.unsubscribe(observer);
    }
    
    
}

