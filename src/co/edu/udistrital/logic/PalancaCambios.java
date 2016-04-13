/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.logic;

import co.edu.udistrital.facade.IPalancaCambios;
import java.io.Console;

/**
 *
 * @author estudiantes
 */
public class PalancaCambios implements IPalancaCambios {

    private int _velocidadActual;

    @Override
    public void InsertarVelocidad(int velocidad) {
        System.out.println("Introduciendo marcha " + velocidad);
        this._velocidadActual = velocidad;
    }

    @Override
    public void PuntoMuerto() {
        System.out.println("Sacando velocidad " + this._velocidadActual);

        this._velocidadActual = 0;
    }

    @Override
    public int GetVelocidadActual() {
        return _velocidadActual;
    }

}
