/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.logic;

import co.edu.udistrital.facade.IEmbrague;

/**
 *
 * @author estudiantes
 */
public class Embrague implements IEmbrague {

    @Override
    public void PresionarEmbrague() {
        System.out.println("Embrague presionado");

    }

    @Override
    public void SoltarEmbrague() {
        System.out.println("Embrague suelto");
    }

}
