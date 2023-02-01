package com.app.hotelalura.daos;

import java.util.List;
import java.util.Optional;

public interface ICrud <T,V> {
    /**
     * @return 
     * @throws java.lang.Exception
    */
    public List<T> findAll() throws Exception;
    public Optional<T> findOne(V id) throws Exception;
    public V save(T o) throws Exception;
    public void delete(V id) throws Exception;
    public void update (T o) throws Exception;
}
