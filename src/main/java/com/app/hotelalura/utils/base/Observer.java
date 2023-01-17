package com.app.hotelalura.utils.base;

import java.util.Map;


public interface Observer {
    
    abstract public void update();
    abstract public void update(Map<String,Object> data);
}
