/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonapp.posicionGlobal.view;

import java.io.Serializable;
import jsonapp.views.utils.CodigoProductoView;
import jsonapp.views.utils.ImporteMonetarioView;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author carlos.perez
 */
public class LPPView implements Serializable {

    String numeroLPP;
    String alias;
    ImporteMonetarioView capitalConcedido;
    ImporteMonetarioView deudaPendiente;
    Boolean saldoInformado;
    CodigoProductoView codigoProductoComercial;
    String nombreProductoComercial;
    String codigoProductoUrsus;
    String codigoProductoCPP;

    public LPPView() {
        numeroLPP = "000012341234561234123412";
        alias = "Mi LPP personal";
        capitalConcedido = new ImporteMonetarioView();
        deudaPendiente = new ImporteMonetarioView();
        saldoInformado = true;
        codigoProductoComercial = new CodigoProductoView();
        nombreProductoComercial = "LPP de Bankia";
        codigoProductoUrsus = "0000";
        codigoProductoCPP = "1111";
    }

    public String getNumeroLPP() {
        return numeroLPP;
    }

    public void setNumeroLPP(String numeroLPP) {
        this.numeroLPP = numeroLPP;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public ImporteMonetarioView getCapitalConcedido() {
        return capitalConcedido;
    }

    public void setCapitalConcedido(ImporteMonetarioView capitalConcedido) {
        this.capitalConcedido = capitalConcedido;
    }

    public ImporteMonetarioView getDeudaPendiente() {
        return deudaPendiente;
    }

    public void setDeudaPendiente(ImporteMonetarioView deudaPendiente) {
        this.deudaPendiente = deudaPendiente;
    }

    public Boolean isSaldoInformado() {
        return saldoInformado;
    }

    public void setSaldoInformado(Boolean saldoInformado) {
        this.saldoInformado = saldoInformado;
    }

    @JsonIgnore
    public CodigoProductoView getCodigoProductoComercial() {
        return codigoProductoComercial;
    }

    public void setCodigoProductoComercial(CodigoProductoView codigoProductoComercial) {
        this.codigoProductoComercial = codigoProductoComercial;
    }

    public String getNombreProductoComercial() {
        return nombreProductoComercial;
    }

    public void setNombreProductoComercial(String nombreProductoComercial) {
        this.nombreProductoComercial = nombreProductoComercial;
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
