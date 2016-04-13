/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.presentation;

import co.edu.udistrital.facade.IAcelerador;
import co.edu.udistrital.facade.IEmbrague;
import co.edu.udistrital.facade.IPalancaCambios;
import co.edu.udistrital.logic.Acelerador;
import co.edu.udistrital.logic.Centralita;
import co.edu.udistrital.logic.Embrague;
import co.edu.udistrital.logic.PalancaCambios;

/**
 *
 * @author estudiantes
 */
public class Main {

    public static void main(String args[]) {

//        IAcelerador acelerador = new Acelerador();
//        IEmbrague embrague = new Embrague();
//        IPalancaCambios palancaCambios = new PalancaCambios();
//
//        acelerador.SoltarAcelerador();
//        embrague.PresionarEmbrague();
//        palancaCambios.PuntoMuerto();
//        palancaCambios.InsertarVelocidad(3);
//        embrague.SoltarEmbrague();
//        acelerador.PresionarAcelerador();
        IAcelerador acelerador = new Acelerador();
        IEmbrague embrague = new Embrague();
        IPalancaCambios palancaCambios = new PalancaCambios();

        Centralita centralita = new Centralita(embrague, acelerador, palancaCambios);
        centralita.AumentarMarcha();
    }
}
