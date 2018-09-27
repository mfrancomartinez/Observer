/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Sujeto {
    private ArrayList <IObservar> observadores;
    private String accion;
    private String lugar;
    
    public Sujeto(){
        observadores = new ArrayList <IObservar>();
        }
    
    public void añadirObs (IObservar o){
        observadores.add(o);
    }
    
    public void retirarObs (IObservar o){
        observadores.remove(o);
    }
    
    public void ejecutarAccion (String a , String l){
        this.accion = a;
        this.lugar = l;
        notificar();
    }
    
    public void notificar(){
        for (IObservar o: observadores){
            o.actualizar(this.accion, this.lugar);
        }
    }
}
