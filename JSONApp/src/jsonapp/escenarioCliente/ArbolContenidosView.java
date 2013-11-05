/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonapp.escenarioCliente;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlos.perez
 */
public class ArbolContenidosView implements Serializable{

    private List<Contenido> arbolContenidos;
    
    public ArbolContenidosView(){
        arbolContenidos = new ArrayList<>();
    }

    public List<Contenido> getArbolContenidos() {
        return arbolContenidos;
    }

    public void setArbolContenidos(List<Contenido> arbolContenidos) {
        this.arbolContenidos = arbolContenidos;
    }
    
    
}
