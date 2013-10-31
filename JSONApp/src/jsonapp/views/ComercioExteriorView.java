/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonapp.views;

import java.io.Serializable;
import jsonapp.views.utils.CodigoProductoView;
import jsonapp.views.utils.ImporteMonetarioView;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author carlos.perez
 */
public class ComercioExteriorView implements Serializable {

    String numeroComercioExterior;
    String alias;
    ImporteMonetarioView limite;
    ImporteMonetarioView importeUtilizado;
    Boolean saldoInformado;
    CodigoProductoView codigoProductoComercial;
    String nombreProductoComercial;
    String codigoProductoUrsus;
    String codigoProductoCPP;

    public ComercioExteriorView() {
        numeroComercioExterior = "000012341234561234123412";
        alias = "Mi cuenta de comercio exterior";
        limite = new ImporteMonetarioView();
        importeUtilizado = new ImporteMonetarioView();
        saldoInformado = true;
        codigoProductoComercial = new CodigoProductoView();
        nombreProductoComercial = "Cuenta de comercio exterior";
        codigoProductoUrsus = "0000";
        codigoProductoCPP = "1111";
    }

    public String getNumeroComercioExterior() {
        return numeroComercioExterior;
    }

    public void setNumeroComercioExterior(String numeroComercioExterior) {
        this.numeroComercioExterior = numeroComercioExterior;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public ImporteMonetarioView getLimite() {
        return limite;
    }

    public void setLimite(ImporteMonetarioView limite) {
        this.limite = limite;
    }

    public ImporteMonetarioView getImporteUtilizado() {
        return importeUtilizado;
    }

    public void setImporteUtilizado(ImporteMonetarioView importeUtilizado) {
        this.importeUtilizado = importeUtilizado;
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
