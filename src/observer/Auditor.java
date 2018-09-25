/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author admin
 */
public class Auditor implements IObservar{

    @Override
    public void actualizar(String accion, String lugar) {
        System.out.println("Grabar en base de datos que se produjo: "+accion+"en el lugar: "+lugar);
    }
    
}
