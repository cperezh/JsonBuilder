/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsonapp;

import java.io.File;
import java.io.IOException;
import jsonapp.views.MostrarVistaPosiciónGlobalView;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;


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

            ObjectMapper jsonMapper = new ObjectMapper();
            
            MostrarVistaPosiciónGlobalView mostrarVistaPosicionGlobalView;
            
            mostrarVistaPosicionGlobalView = new MostrarVistaPosiciónGlobalView();
            
            
            jsonMapper.configure(SerializationConfig.Feature.INDENT_OUTPUT, true);
            jsonMapper.writeValue(new File("C:\\Personal\\proyectos\\JSONApp\\mostrarVistaPosicionGlobalView.json"),mostrarVistaPosicionGlobalView);
      
            
       
    }
    
}
