package com.app.hotelalura.contexts;

import com.app.hotelalura.utils.base.Observer;
import com.app.hotelalura.utils.base.Subject;


public class ToggleChange extends Subject<Boolean> {
    private static final ToggleChange instance = new ToggleChange();
    
    
    private ToggleChange(){}
    
    
    private void setOpen(Boolean b){
        instance.setState(b);
        this.notifyAction(instance.getState());
    }
    public static Boolean isOpen(){
        return instance.getState();
    }
    
    public static void changeState(Boolean o){
        instance.setOpen(o);
    }
    
    public static void addObserver(Observer observer){
        instance.subscribe(observer);
    }
    public static void removeObserver(Observer observer){
        instance.unsubscribe(observer);
    }
    
        
}
