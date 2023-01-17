package com.app.hotelalura.utils.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Subject {
    
    private final List<Observer> observers= new ArrayList<>();
    
    public Subject(){
        
    }
    public void subscribe(Observer observer){
        this.observers.add(observer);
    }
    public void unsubscribe(Observer observer){
        observers.remove(observer);
    }
    public void notifyAction(){
        notifyAllObservers();
    }
    public void notifyState(Map<String,Object> data){
        notifyAllObservers(data);
    }
    
    private void notifyAllObservers(){
        for(Observer observer:observers){
            observer.update();
        }
    }
    public void notifyAllObservers(Map<String,Object> data){
        for(Observer observer:observers){
            observer.update(data);
        }
    }
    
}
