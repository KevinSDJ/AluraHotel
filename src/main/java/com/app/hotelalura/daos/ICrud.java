package com.app.hotelalura.daos;

import java.util.List;
import java.util.Optional;

public interface ICrud <T,V> {
    /**
     * Solo realice esta interfaz por cuestion de tiempo,
     * pero lo ideal seria realizar una clase crud donde 
     * mapee los atributos y clases sin tener que repetir codigo 
     * en cada dao
     * @return 
     * @throws java.lang.Exception
    */
    public List<T> findAll() throws Exception;
    public Optional<T> findOne(V id) throws Exception;
    public V save(T o) throws Exception;
    public void delete(V id) throws Exception;
}
