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
public class TarjetasView implements Serializable {

    String numeroDeTarjeta;
    String alias;
    ImporteMonetarioView limiteCredito;
    ImporteMonetarioView saldoDisponible;
    Boolean saldoInformado;
    CodigoProductoView codigoProductoComercial;
    String nombreProductoComercial;
    String codigoProductoUrsus;
    String codigoProductoCPP;

    public TarjetasView() {
        numeroDeTarjeta = "4621462146214621";
        alias = "Mi cuenta";
        limiteCredito = new ImporteMonetarioView();
        saldoDisponible = new ImporteMonetarioView();
        saldoInformado = true;
        codigoProductoComercial = new CodigoProductoView();
        nombreProductoComercial = "Cuenta corriente";
        codigoProductoUrsus = "0000";
        codigoProductoCPP = "1111";
    }

    public String getNumeroDeTarjeta() {
        return numeroDeTarjeta;
    }

    public void setNumeroDeTarjeta(String numeroDeTarjeta) {
        this.numeroDeTarjeta = numeroDeTarjeta;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public ImporteMonetarioView getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(ImporteMonetarioView limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public ImporteMonetarioView getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(ImporteMonetarioView saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
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
