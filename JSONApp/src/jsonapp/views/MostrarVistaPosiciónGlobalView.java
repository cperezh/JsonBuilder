/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonapp.views;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author carlos.perez
 */
public class MostrarVistaPosiciónGlobalView implements Serializable {

    List<CuentasView> listaCuentas;
    List<CuentasView> listaCuentasNoRelacionadas;
    List<FondosView> listaFondos;
    List<FondosView> listaFondosNoRelacionados;
    List<CuentasView> listaCuentasExtranjero;
    List<CuentasView> listaCuentasExtranjeroNoRelacionadas;
    List<DepositosView> listaPlazosEnDivisas;
    List<DepositosView> listaPlazosEnDivisasNoRelacionados;
    List<TarjetasView> listaTarjetas;
    List<TarjetasView> listaTarjetasNoRelacionadas;
    List<ValoresView> listaValores;
    List<ValoresView> listaValoresNoRelacionados;
    List<PlanesView> listaPlanesDePensiones;
    List<PlanesView> listaPlanesDePensionesNoRelacionados;
    List<CarterasView> listaCartera;
    List<CarterasView> listaCarteraNoRelacionadas;
    List<PrestamosView> listaPrestamos;
    List<PrestamosView> listaPrestamosNoRelacionados;
    List<DepositosView> listaDepositosPlazo;
    List<DepositosView> listaDepositosPlazoNoRelacionados;
    List<DepositosView> listaDepositosFinanciero;
    List<DepositosView> listaDepositosFinancieroNoRelacionados;
    List<ComercioExteriorView> listaComercioExterior;
    List<ComercioExteriorView> listaComercioExteriorNoRelacionados;
    List<LineaDeTesoreriasView> listaLineasDeTesoreria;
    List<LineaDeTesoreriasView> listaLineasDeTesoreriaNoRelacionadas;
    List<AvalesView> listaAvales;
    List<AvalesView> listaAvalesNoRelacionados;
    List<LineaDeAvalesView> listaLineasDeAval;
    List<LineaDeAvalesView> listaLineasDeAvalNoRelacionadas;
    List<LibretaDinamicaView> listaLibretasDinámica;
    List<LibretaDinamicaView> listaLibretasDinámicaNoRelacionadas;
    List<CarterasView> listaCarterasGestionada;
    List<CarterasView> listaCarterasGestionadaNoRelacionadas;
    List<LPPView> listaLPPs;
    List<LPPView> listaLPPsNoRelacionados;

    public MostrarVistaPosiciónGlobalView() {
        listaCuentas = new ArrayList<>(Arrays.asList(new CuentasView()));
        listaCuentasNoRelacionadas = new ArrayList<>(Arrays.asList(new CuentasView()));
        listaFondos = new ArrayList<>(Arrays.asList(new FondosView()));
        //listaFondosNoRelacionados =  new ArrayList<>(Arrays.asList(new FondosView()));
        listaFondosNoRelacionados = new ArrayList<>();
        listaCuentasExtranjero = new ArrayList<>(Arrays.asList(new CuentasView()));
        //listaCuentasExtranjeroNoRelacionadas = new ArrayList<>(Arrays.asList(new CuentasView()));
        listaCuentasExtranjeroNoRelacionadas = new ArrayList<>();
        listaPlazosEnDivisas = new ArrayList<>(Arrays.asList(new DepositosView()));
        listaPlazosEnDivisasNoRelacionados = new ArrayList<>(Arrays.asList(new DepositosView()));
        listaTarjetas = new ArrayList<>(Arrays.asList(new TarjetasView()));
        listaTarjetasNoRelacionadas = new ArrayList<>(Arrays.asList(new TarjetasView()));
        listaValores = new ArrayList<>(Arrays.asList(new ValoresView()));
        listaValoresNoRelacionados = new ArrayList<>(Arrays.asList(new ValoresView()));
        listaPlanesDePensiones = new ArrayList<>(Arrays.asList(new PlanesView()));
        listaPlanesDePensionesNoRelacionados = new ArrayList<>(Arrays.asList(new PlanesView()));
        listaCartera = new ArrayList<>(Arrays.asList(new CarterasView()));
        listaCarteraNoRelacionadas = new ArrayList<>(Arrays.asList(new CarterasView()));
        listaPrestamos = new ArrayList<>(Arrays.asList(new PrestamosView()));
        listaPrestamosNoRelacionados = new ArrayList<>(Arrays.asList(new PrestamosView()));
        listaDepositosPlazo = new ArrayList<>(Arrays.asList(new DepositosView()));
        listaDepositosPlazoNoRelacionados = new ArrayList<>(Arrays.asList(new DepositosView()));
        listaDepositosFinanciero = new ArrayList<>(Arrays.asList(new DepositosView()));
        listaDepositosFinancieroNoRelacionados = new ArrayList<>(Arrays.asList(new DepositosView()));
        listaComercioExterior = new ArrayList<>(Arrays.asList(new ComercioExteriorView()));
        listaComercioExteriorNoRelacionados = new ArrayList<>(Arrays.asList(new ComercioExteriorView()));
        listaLineasDeTesoreria = new ArrayList<>(Arrays.asList(new LineaDeTesoreriasView()));
        listaLineasDeTesoreriaNoRelacionadas = new ArrayList<>(Arrays.asList(new LineaDeTesoreriasView()));
        listaAvales = new ArrayList<>(Arrays.asList(new AvalesView()));
        listaAvalesNoRelacionados = new ArrayList<>(Arrays.asList(new AvalesView()));
        listaLineasDeAval = new ArrayList<>(Arrays.asList(new LineaDeAvalesView()));
        listaLineasDeAvalNoRelacionadas = new ArrayList<>(Arrays.asList(new LineaDeAvalesView()));
        listaLibretasDinámica = new ArrayList<>(Arrays.asList(new LibretaDinamicaView()));
        listaLibretasDinámicaNoRelacionadas = new ArrayList<>(Arrays.asList(new LibretaDinamicaView()));
        listaCarterasGestionada = new ArrayList<>(Arrays.asList(new CarterasView()));
        listaCarterasGestionadaNoRelacionadas = new ArrayList<>(Arrays.asList(new CarterasView()));
        listaLPPs = new ArrayList<>(Arrays.asList(new LPPView()));
        listaLPPsNoRelacionados = new ArrayList<>(Arrays.asList(new LPPView()));
    }

    public List<CuentasView> getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(List<CuentasView> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }

    public List<CuentasView> getListaCuentasNoRelacionadas() {
        return listaCuentasNoRelacionadas;
    }

    public void setListaCuentasNoRelacionadas(List<CuentasView> listaCuentasNoRelacionadas) {
        this.listaCuentasNoRelacionadas = listaCuentasNoRelacionadas;
    }

    public List<FondosView> getListaFondos() {
        return listaFondos;
    }

    public void setListaFondos(List<FondosView> listaFondos) {
        this.listaFondos = listaFondos;
    }

    public List<FondosView> getListaFondosNoRelacionados() {
        return listaFondosNoRelacionados;
    }

    public void setListaFondosNoRelacionados(List<FondosView> listaFondosNoRelacionados) {
        this.listaFondosNoRelacionados = listaFondosNoRelacionados;
    }

    public List<CuentasView> getListaCuentasExtranjero() {
        return listaCuentasExtranjero;
    }

    public void setListaCuentasExtranjero(List<CuentasView> listaCuentasExtranjero) {
        this.listaCuentasExtranjero = listaCuentasExtranjero;
    }

    public List<CuentasView> getListaCuentasExtranjeroNoRelacionadas() {
        return listaCuentasExtranjeroNoRelacionadas;
    }

    public void setListaCuentasExtranjeroNoRelacionadas(List<CuentasView> listaCuentasExtranjeroNoRelacionadas) {
        this.listaCuentasExtranjeroNoRelacionadas = listaCuentasExtranjeroNoRelacionadas;
    }

    public List<DepositosView> getListaPlazosEnDivisas() {
        return listaPlazosEnDivisas;
    }

    public void setListaPlazosEnDivisas(List<DepositosView> listaPlazosEnDivisas) {
        this.listaPlazosEnDivisas = listaPlazosEnDivisas;
    }

    public List<DepositosView> getListaPlazosEnDivisasNoRelacionados() {
        return listaPlazosEnDivisasNoRelacionados;
    }

    public void setListaPlazosEnDivisasNoRelacionados(List<DepositosView> listaPlazosEnDivisasNoRelacionados) {
        this.listaPlazosEnDivisasNoRelacionados = listaPlazosEnDivisasNoRelacionados;
    }

    public List<TarjetasView> getListaTarjetas() {
        return listaTarjetas;
    }

    public void setListaTarjetas(List<TarjetasView> listaTarjetas) {
        this.listaTarjetas = listaTarjetas;
    }

    public List<TarjetasView> getListaTarjetasNoRelacionadas() {
        return listaTarjetasNoRelacionadas;
    }

    public void setListaTarjetasNoRelacionadas(List<TarjetasView> listaTarjetasNoRelacionadas) {
        this.listaTarjetasNoRelacionadas = listaTarjetasNoRelacionadas;
    }

    public List<ValoresView> getListaValores() {
        return listaValores;
    }

    public void setListaValores(List<ValoresView> listaValores) {
        this.listaValores = listaValores;
    }

    public List<ValoresView> getListaValoresNoRelacionados() {
        return listaValoresNoRelacionados;
    }

    public void setListaValoresNoRelacionados(List<ValoresView> listaValoresNoRelacionados) {
        this.listaValoresNoRelacionados = listaValoresNoRelacionados;
    }

    public List<PlanesView> getListaPlanesDePensiones() {
        return listaPlanesDePensiones;
    }

    public void setListaPlanesDePensiones(List<PlanesView> listaPlanesDePensiones) {
        this.listaPlanesDePensiones = listaPlanesDePensiones;
    }

    public List<PlanesView> getListaPlanesDePensionesNoRelacionados() {
        return listaPlanesDePensionesNoRelacionados;
    }

    public void setListaPlanesDePensionesNoRelacionados(List<PlanesView> listaPlanesDePensionesNoRelacionados) {
        this.listaPlanesDePensionesNoRelacionados = listaPlanesDePensionesNoRelacionados;
    }

    public List<CarterasView> getListaCartera() {
        return listaCartera;
    }

    public void setListaCartera(List<CarterasView> listaCartera) {
        this.listaCartera = listaCartera;
    }

    public List<CarterasView> getListaCarteraNoRelacionadas() {
        return listaCarteraNoRelacionadas;
    }

    public void setListaCarteraNoRelacionadas(List<CarterasView> listaCarteraNoRelacionadas) {
        this.listaCarteraNoRelacionadas = listaCarteraNoRelacionadas;
    }

    public List<PrestamosView> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(List<PrestamosView> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    public List<PrestamosView> getListaPrestamosNoRelacionados() {
        return listaPrestamosNoRelacionados;
    }

    public void setListaPrestamosNoRelacionados(List<PrestamosView> listaPrestamosNoRelacionados) {
        this.listaPrestamosNoRelacionados = listaPrestamosNoRelacionados;
    }

    public List<DepositosView> getListaDepositosPlazo() {
        return listaDepositosPlazo;
    }

    public void setListaDepositosPlazo(List<DepositosView> listaDepositosPlazo) {
        this.listaDepositosPlazo = listaDepositosPlazo;
    }

    public List<DepositosView> getListaDepositosPlazoNoRelacionados() {
        return listaDepositosPlazoNoRelacionados;
    }

    public void setListaDepositosPlazoNoRelacionados(List<DepositosView> listaDepositosPlazoNoRelacionados) {
        this.listaDepositosPlazoNoRelacionados = listaDepositosPlazoNoRelacionados;
    }

    public List<DepositosView> getListaDepositosFinanciero() {
        return listaDepositosFinanciero;
    }

    public void setListaDepositosFinanciero(List<DepositosView> listaDepositosFinanciero) {
        this.listaDepositosFinanciero = listaDepositosFinanciero;
    }

    public List<DepositosView> getListaDepositosFinancieroNoRelacionados() {
        return listaDepositosFinancieroNoRelacionados;
    }

    public void setListaDepositosFinancieroNoRelacionados(List<DepositosView> listaDepositosFinancieroNoRelacionados) {
        this.listaDepositosFinancieroNoRelacionados = listaDepositosFinancieroNoRelacionados;
    }

    public List<ComercioExteriorView> getListaComercioExterior() {
        return listaComercioExterior;
    }

    public void setListaComercioExterior(List<ComercioExteriorView> listaComercioExterior) {
        this.listaComercioExterior = listaComercioExterior;
    }

    public List<ComercioExteriorView> getListaComercioExteriorNoRelacionados() {
        return listaComercioExteriorNoRelacionados;
    }

    public void setListaComercioExteriorNoRelacionados(List<ComercioExteriorView> listaComercioExteriorNoRelacionados) {
        this.listaComercioExteriorNoRelacionados = listaComercioExteriorNoRelacionados;
    }

    public List<LineaDeTesoreriasView> getListaLineasDeTesoreria() {
        return listaLineasDeTesoreria;
    }

    public void setListaLineasDeTesoreria(List<LineaDeTesoreriasView> listaLineasDeTesoreria) {
        this.listaLineasDeTesoreria = listaLineasDeTesoreria;
    }

    public List<LineaDeTesoreriasView> getListaLineasDeTesoreriaNoRelacionadas() {
        return listaLineasDeTesoreriaNoRelacionadas;
    }

    public void setListaLineasDeTesoreriaNoRelacionadas(List<LineaDeTesoreriasView> listaLineasDeTesoreriaNoRelacionadas) {
        this.listaLineasDeTesoreriaNoRelacionadas = listaLineasDeTesoreriaNoRelacionadas;
    }

    public List<AvalesView> getListaAvales() {
        return listaAvales;
    }

    public void setListaAvales(List<AvalesView> listaAvales) {
        this.listaAvales = listaAvales;
    }

    public List<AvalesView> getListaAvalesNoRelacionados() {
        return listaAvalesNoRelacionados;
    }

    public void setListaAvalesNoRelacionados(List<AvalesView> listaAvalesNoRelacionados) {
        this.listaAvalesNoRelacionados = listaAvalesNoRelacionados;
    }

    public List<LineaDeAvalesView> getListaLineasDeAval() {
        return listaLineasDeAval;
    }

    public void setListaLineasDeAval(List<LineaDeAvalesView> listaLineasDeAval) {
        this.listaLineasDeAval = listaLineasDeAval;
    }

    public List<LineaDeAvalesView> getListaLineasDeAvalNoRelacionadas() {
        return listaLineasDeAvalNoRelacionadas;
    }

    public void setListaLineasDeAvalNoRelacionadas(List<LineaDeAvalesView> listaLineasDeAvalNoRelacionadas) {
        this.listaLineasDeAvalNoRelacionadas = listaLineasDeAvalNoRelacionadas;
    }

    public List<LibretaDinamicaView> getListaLibretasDinámica() {
        return listaLibretasDinámica;
    }

    public void setListaLibretasDinámica(List<LibretaDinamicaView> listaLibretasDinámica) {
        this.listaLibretasDinámica = listaLibretasDinámica;
    }

    public List<LibretaDinamicaView> getListaLibretasDinámicaNoRelacionadas() {
        return listaLibretasDinámicaNoRelacionadas;
    }

    public void setListaLibretasDinámicaNoRelacionadas(List<LibretaDinamicaView> listaLibretasDinámicaNoRelacionadas) {
        this.listaLibretasDinámicaNoRelacionadas = listaLibretasDinámicaNoRelacionadas;
    }

    public List<CarterasView> getListaCarterasGestionada() {
        return listaCarterasGestionada;
    }

    public void setListaCarterasGestionada(List<CarterasView> listaCarterasGestionada) {
        this.listaCarterasGestionada = listaCarterasGestionada;
    }

    public List<CarterasView> getListaCarterasGestionadaNoRelacionadas() {
        return listaCarterasGestionadaNoRelacionadas;
    }

    public void setListaCarterasGestionadaNoRelacionadas(List<CarterasView> listaCarterasGestionadaNoRelacionadas) {
        this.listaCarterasGestionadaNoRelacionadas = listaCarterasGestionadaNoRelacionadas;
    }

    public List<LPPView> getListaLPPs() {
        return listaLPPs;
    }

    public void setListaLPPs(List<LPPView> listaLPPs) {
        this.listaLPPs = listaLPPs;
    }

    public List<LPPView> getListaLPPsNoRelacionados() {
        return listaLPPsNoRelacionados;
    }

    public void setListaLPPsNoRelacionados(List<LPPView> listaLPPsNoRelacionados) {
        this.listaLPPsNoRelacionados = listaLPPsNoRelacionados;
    }
    

}
