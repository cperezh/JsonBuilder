/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonapp;

import java.io.File;
import java.io.IOException;
import jsonapp.posicionGlobal.model.SolicitarIdentificadorVistaModel;
import jsonapp.posicionGlobal.view.MostrarVistaPosiciónGlobalView;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

/**
 *
 * @author carlos.perez
 */
public class JSONApp {
    
    private final static String PATH_JSONS = "C:\\Personal\\proyectos\\JSONApp\\jsons\\";

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        JSONApp.generarJsonMostrarMostrarVistaPosiciónGlobalView();
        JSONApp.generarJsonSolicitarIdentificadorVistaModel();

    }

    public static void generarJsonMostrarMostrarVistaPosiciónGlobalView() throws IOException {

        MostrarVistaPosiciónGlobalView mostrarVistaPosicionGlobalView;

        mostrarVistaPosicionGlobalView = new MostrarVistaPosiciónGlobalView();

        generarJson(mostrarVistaPosicionGlobalView);

    }
    
    public static void generarJsonSolicitarIdentificadorVistaModel() throws IOException {

        SolicitarIdentificadorVistaModel solicitarIdentificadorVistaModel;

        solicitarIdentificadorVistaModel = new SolicitarIdentificadorVistaModel();

        generarJson(solicitarIdentificadorVistaModel);

    }

    private static void generarJson(Object objeto) throws IOException {

        ObjectMapper jsonMapper = new ObjectMapper();

        jsonMapper.configure(SerializationConfig.Feature.INDENT_OUTPUT, true);
        jsonMapper.writeValue(new File(PATH_JSONS+objeto.getClass().getSimpleName()+".json"), objeto);

    }

}
