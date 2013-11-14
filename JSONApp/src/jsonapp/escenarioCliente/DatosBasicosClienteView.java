/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonapp.escenarioCliente;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author carlos.perez
 */
class DatosBasicosClienteView implements Serializable{

    private String nombreRazonSocial;
    private String fechaUltimaConexion;

    public DatosBasicosClienteView() {
        nombreRazonSocial = "Clint Eastwood";
        fechaUltimaConexion = String.valueOf(new Date().getTime());
    }

    public String getNombreRazonSocial() {
        return nombreRazonSocial;
    }

    public String getFechaUltimaConexion() {
        return fechaUltimaConexion;
    }

    public void setNombreRazonSocial(String nombreRazonSocial) {
        this.nombreRazonSocial = nombreRazonSocial;
    }

    public void setFechaUltimaConexion(String fechaUltimaConexion) {
        this.fechaUltimaConexion = fechaUltimaConexion;
    }
}
