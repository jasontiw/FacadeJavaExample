/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.logic;

import co.edu.udistrital.facade.IAcelerador;

/**
 *
 * @author estudiantes
 */
public class Acelerador implements IAcelerador {

    @Override
    public void PresionarAcelerador() {
        System.out.println("Acelerador presionado");
    }

    @Override
    public void SoltarAcelerador() {
        System.out.println("Acelerador levantado");
    }

}
