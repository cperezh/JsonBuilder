/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonapp.views.utils;

/**
 *
 * @author carlos.perez
 */
public class CodigoProductoView {

    String codigoProductoUrsus;
    String codigoProductoCPP;

    public CodigoProductoView() {
        codigoProductoUrsus = "0000";
        codigoProductoCPP = "1111";
    }

    public String getCodigoProductoUrsus() {
        return codigoProductoUrsus;
    }

    public void setCodigoProductoUrsus(String codigoProductoUrsus) {
        this.codigoProductoUrsus = codigoProductoUrsus;
    }

    public String getCodigoProductoCPP() {
        return codigoProductoCPP;
    }

    public void setCodigoProductoCPP(String codigoProductoCPP) {
        this.codigoProductoCPP = codigoProductoCPP;
    }
    
}
