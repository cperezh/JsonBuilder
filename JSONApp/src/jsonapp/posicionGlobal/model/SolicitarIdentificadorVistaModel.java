/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonapp.posicionGlobal.model;

import java.io.Serializable;

/**
 *
 * @author carlos.perez
 */
public class SolicitarIdentificadorVistaModel implements Serializable {

    private Integer identificadorVista;

    public SolicitarIdentificadorVistaModel() {
        this.identificadorVista = 1;
    }

    public Integer getIdentificadorVista() {
        return identificadorVista;
    }

    public void setIdentificadorVista(Integer identificadorVista) {
        this.identificadorVista = identificadorVista;
    }

}
