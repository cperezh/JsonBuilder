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
public class PlanesView implements Serializable {

    String numeroDePlan;
    String alias;
    ImporteMonetarioView derechoConsolidado;
    Boolean saldoInformado;
    CodigoProductoView codigoProductoComercial;
    String nombreProductoComercial;
    String codigoProductoUrsus;
    String codigoProductoCPP;

    public PlanesView() {
        numeroDePlan = "17789201051626";
        alias = "PLAN DE PENSIONES CAJAMADRID RENT";
        derechoConsolidado = new ImporteMonetarioView();
        saldoInformado = true;
        codigoProductoComercial = new CodigoProductoView();
        nombreProductoComercial = "Bankia Planes de pensiones";
        codigoProductoUrsus = "0000";
        codigoProductoCPP = "1111";
    }

    public String getNumeroDePlan() {
        return numeroDePlan;
    }

    public void setNumeroDePlan(String numeroDePlan) {
        this.numeroDePlan = numeroDePlan;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public ImporteMonetarioView getDerechoConsolidado() {
        return derechoConsolidado;
    }

    public void setDerechoConsolidado(ImporteMonetarioView derechoConsolidado) {
        this.derechoConsolidado = derechoConsolidado;
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
