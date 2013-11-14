/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonapp.escenarioCliente;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import jsonapp.utils.JsonUtils;

/**
 *
 * @author carlos.perez
 */
public class PresentarEscenarioClienteView implements Serializable {

    private String urlIrA;
    private String nombreRazonSocial;
    private String fechaUltimaConexion;
    private List<ContenidoView> menuNavegacionVista;

    public PresentarEscenarioClienteView() throws IOException {
        this.urlIrA = "/es/cuentas";
        this.nombreRazonSocial = "Clint Eastwood";
        this.fechaUltimaConexion = String.valueOf(new Date().getTime());
        this.menuNavegacionVista = JsonUtils.generarListaObjeto(new ContenidoView());
    }

    public String getUrlIrA() {
        return urlIrA;
    }

    public void setUrlIrA(String urlIrA) {
        this.urlIrA = urlIrA;
    }

    public List<ContenidoView> getMenuNavegacionVista() {
        return menuNavegacionVista;
    }

    public void setMenuNavegacionVista(List<ContenidoView> menuNavegacionVista) {
        this.menuNavegacionVista = menuNavegacionVista;
    }

    public String getNombreRazonSocial() {
        return nombreRazonSocial;
    }

    public void setNombreRazonSocial(String nombreRazonSocial) {
        this.nombreRazonSocial = nombreRazonSocial;
    }

    public String getFechaUltimaConexion() {
        return fechaUltimaConexion;
    }

    public void setFechaUltimaConexion(String fechaUltimaConexion) {
        this.fechaUltimaConexion = fechaUltimaConexion;
    }
    

}
