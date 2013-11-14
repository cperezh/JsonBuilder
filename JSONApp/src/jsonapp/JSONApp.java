/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonapp;

import jsonapp.escenarioCliente.ObtenerDatosURLsModel;
import java.io.IOException;
import java.util.List;
import jsonapp.escenarioCliente.ArbolContenidosView;
import jsonapp.escenarioCliente.Contenido;
import jsonapp.escenarioCliente.PresentarEscenarioClienteView;
import jsonapp.posicionGlobal.model.SolicitarIdentificadorVistaModel;
import jsonapp.posicionGlobal.view.MostrarVistaPosiciónGlobalView;
import jsonapp.test.TestView;
import jsonapp.utils.JsonUtils;

/**
 *
 * @author carlos.perez
 */
public class JSONApp {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

       // JSONApp.generarObjetoArbolContenidosView();
       // JSONApp.generarObjetoArbolContenidosView2();
       // JSONApp.generarJsonArbolContenidosView2();
        //JSONApp.generarJsonTest();
        JSONApp.generarJsonPresentarEscenarioClienteView();
        //JSONApp.generarJsonObtenerDatosURLsModel();
        //JSONApp.generarJsonMostrarMostrarVistaPosiciónGlobalView();

    }

    public static void generarJsonMostrarMostrarVistaPosiciónGlobalView() throws IOException {

        MostrarVistaPosiciónGlobalView mostrarVistaPosicionGlobalView;

        mostrarVistaPosicionGlobalView = new MostrarVistaPosiciónGlobalView();

        JsonUtils.generarJson(mostrarVistaPosicionGlobalView);

    }

    public static void generarJsonSolicitarIdentificadorVistaModel() throws IOException {

        SolicitarIdentificadorVistaModel solicitarIdentificadorVistaModel;

        solicitarIdentificadorVistaModel = new SolicitarIdentificadorVistaModel();

        JsonUtils.generarJson(solicitarIdentificadorVistaModel);

    }

    public static void generarJsonTest() throws IOException {

        TestView testView;

        testView = new TestView();

        JsonUtils.generarJson(testView);

    }

    public static ArbolContenidosView generarObjetoArbolContenidosView() throws IOException {

        ArbolContenidosView arbolContenidosView;

        arbolContenidosView = new ArbolContenidosView();

        arbolContenidosView = JsonUtils.generarObjeto(arbolContenidosView);

        return arbolContenidosView;
    }

    public static List<Contenido> generarObjetoArbolContenidosView2() throws IOException {

        List<Contenido> listaContenidos;

        listaContenidos = JsonUtils.generarListaObjeto(new Contenido());

        return listaContenidos;
    }
    
     public static void generarJsonPresentarEscenarioClienteView() throws IOException{

        PresentarEscenarioClienteView presentarEscenarioClienteView;

        presentarEscenarioClienteView = new PresentarEscenarioClienteView();

        JsonUtils.generarJson(presentarEscenarioClienteView);

    }  

    private static void generarJsonObtenerDatosURLsModel() throws IOException {
        ObtenerDatosURLsModel obtenerDatosURLsModel;

        obtenerDatosURLsModel = new ObtenerDatosURLsModel();

        JsonUtils.generarJson(obtenerDatosURLsModel);
    }
    
}
