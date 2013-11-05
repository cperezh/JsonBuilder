/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsonapp.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlos.perez
 */
public class TestView implements Serializable{
    
    List<Test> listaTest;

    public TestView() {
        listaTest = new ArrayList<>();
        listaTest.add(new Test());
        listaTest.add(new Test());
    }

    public List<Test> getListaTest() {
        return listaTest;
    }

    public void setListaTest(List<Test> listaTest) {
        this.listaTest = listaTest;
    }
    
    
}
