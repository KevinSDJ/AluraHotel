
package com.app.hotelalura.dto;

import java.awt.Component;

/**
 * Notas para mi yo futuro
 * 
 * los records tambien se pueden adaptar para que tipo y cantidad de parametros
 * que recibira , incluso se puede extender de interfaces y añadir methodos
 * no lo conocia, algo muy util.
*/

public record AdminDTO(Component comp,String email,String password) {
    public AdminDTO(String email,String password){
        this( null,email,password);
    }
}
