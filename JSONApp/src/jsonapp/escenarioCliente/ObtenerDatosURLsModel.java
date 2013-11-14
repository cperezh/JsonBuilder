package jsonapp.escenarioCliente;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlos.perez
 */
public class ObtenerDatosURLsModel implements Serializable{
    private String urlPiloto;
    private String url;

    public ObtenerDatosURLsModel() {
        urlPiloto = "/es/cuentas";
        url = "http://empresas.bankia.es/page/id-1-1003-1-101544-0-0-0.go";
    }

    public String getUrlPiloto() {
        return urlPiloto;
    }

    public void setUrlPiloto(String urlPiloto) {
        this.urlPiloto = urlPiloto;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    
}
