/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlos;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author carlos.perez
 */
@XmlRootElement
public class Herramienta {

    private String nombreHerramienta;
    
    public Herramienta(){
        
    }
    public Herramienta(String _nombreHerramienta){
        this.nombreHerramienta = _nombreHerramienta;
    }

    public String getNombreHerramienta() {
        return nombreHerramienta;
    }

    public void setNombreHerramienta(String nombreHerramienta) {
        this.nombreHerramienta = nombreHerramienta;
    }
    
    
}
