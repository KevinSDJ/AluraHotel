package com.app.hotelalura.utils.base;

import java.util.ArrayList;
import java.util.List;

public abstract class  Subject<T> {
    
    protected List<Observer> observers= new ArrayList<>();
    protected T state;
    
    public Subject(){}

    public void insertState(T o){
        this.state=o;
    }

    public void subscribe(Observer observer){
        this.observers.add(observer);
    }
    public void unsubscribe(Observer observer){
        observers.remove(observer);
    }
    public void notifyAction(T o){
        notifyAllObservers(o);
    }
    private void notifyAllObservers(T o){
        for(Observer observer:observers){
            observer.update(o);
        }
    }
    
    
}
