package com.app.hotelalura.utils.base;

import java.util.ArrayList;
import java.util.List;

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
    
    private void notifyAllObservers(){
        for(Observer observer:observers){
            observer.update();
        }
    }
    
}
