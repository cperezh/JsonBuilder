/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonapp;

import java.io.File;
import java.io.IOException;
import jsonapp.escenarioCliente.ArbolContenidosView;
import jsonapp.posicionGlobal.model.SolicitarIdentificadorVistaModel;
import jsonapp.posicionGlobal.view.MostrarVistaPosiciónGlobalView;
import jsonapp.test.TestView;
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

        JSONApp.generarObjetoArbolContenidosView();
        //JSONApp.generarJsonTest();

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
    
    public static void generarJsonTest() throws IOException {

        TestView testView;

        testView = new TestView();

        generarJson(testView);

    }

    public static ArbolContenidosView generarObjetoArbolContenidosView() throws IOException {

        ArbolContenidosView arbolContenidosView;

        arbolContenidosView = new ArbolContenidosView();

        arbolContenidosView = (ArbolContenidosView) JSONApp.generarObjeto(arbolContenidosView);

        return arbolContenidosView;
    }

    /**
     * Genera un Json de un objeto
     *
     * @param objeto
     * @throws IOException
     */
    private static void generarJson(Object objeto) throws IOException {

        ObjectMapper jsonMapper = new ObjectMapper();

        jsonMapper.configure(SerializationConfig.Feature.INDENT_OUTPUT, true);
        jsonMapper.writeValue(new File(PATH_JSONS + objeto.getClass().getSimpleName() + ".json"), objeto);

    }

    /**
     * Generar un objecto de un Json.
     *
     * @param claseObjecto la clase del objeto que queremos generar. Se pasa
     * inicializado y lo devuelve relleno. Busca un Json que se llame como la
     * clase, en la ruta de generación de los Json.
     * @return
     * @throws IOException
     */
    private static Object generarObjeto(Object claseObjecto) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        claseObjecto = mapper.readValue(new File(PATH_JSONS + claseObjecto.getClass().getSimpleName() + ".json"), claseObjecto.getClass());

        return claseObjecto;
    }

}
