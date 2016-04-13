/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.facade;

/**
 *
 * @author Jeison y Oscar
 */
public interface IPalancaCambios {

    void InsertarVelocidad(int velocidad);

    void PuntoMuerto();

    int GetVelocidadActual();
}
