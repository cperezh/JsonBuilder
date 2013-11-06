/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonapp.utils;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

/**
 *
 * @author carlos.perez
 */
public class JsonUtils {

    private final static String PATH_JSONS = "C:\\Personal\\proyectos\\JSONApp\\jsons\\";

    /**
     * Genera un Json de un objeto
     *
     * @param <T> clase del objeto que se serializa a Json
     * @param objeto
     * @throws IOException
     */
    public static <T extends Serializable> void generarJson(T objeto) throws IOException {

        ObjectMapper jsonMapper = new ObjectMapper();

        jsonMapper.configure(SerializationConfig.Feature.INDENT_OUTPUT, true);
        jsonMapper.writeValue(new File(PATH_JSONS + objeto.getClass().getSimpleName() + ".json"), objeto);

    }

    /**
     * Generar un objecto de un Json.
     *
     * @param <T> clase del objeto que crea
     * @param claseObjecto el objeto sobre el que se informa lo extraido del
     * Json.
     * @return Busca un Json que se llame como la clase, en la ruta de
     * generación de los Json.
     * @throws IOException
     */
    public static <T extends Serializable> T generarObjeto(T claseObjecto) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        claseObjecto = (T) mapper.readValue(new File(PATH_JSONS + claseObjecto.getClass().getSimpleName() + ".json"), claseObjecto.getClass());

        return claseObjecto;
    }
 }
