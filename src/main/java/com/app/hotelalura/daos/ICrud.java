package com.app.hotelalura.daos;

import java.util.List;

public interface ICrud <T,V> {
    
    public List<T> findAll();
    public T findOne(V id);
    public V save(T o);
    public void delete(V id);
}
