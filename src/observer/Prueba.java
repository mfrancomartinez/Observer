/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Prueba {
    Sujeto sujeto;
    Correo correo;
    Auditor auditor;
    Informante informante;


public void ejecutarPrueba (){
sujeto = new Sujeto();
correo = new Correo();
auditor = new Auditor();
informante = new Informante();
String accion ="";
String lugar = "";
int opAccion;
int opRegistra;
Scanner sc = new Scanner(System.in);


do{
    escribemenu();
    opAccion = sc.nextInt();
    sc.nextLine();
    switch(opAccion){
        case 1:
            System.out.println("Escribe la acción");
            accion = sc.nextLine();
            System.out.println("Escribe el lugar");
            lugar = sc.nextLine();
            sujeto.ejecutarAccion(accion, lugar);
            System.out.println("\n\n");
            break;
        
        case 2:
            escribeSeleccion();
            agregaObservador(sc.nextInt());
            break;
        
        case 3 : 
            escribeSeleccion();
            retiraObservador(sc.nextInt());
            break;
        
        case 0:
            System.exit(0);
        
        default:
            System.out.println("Opción errada");
    }
    
}while(opAccion!=0);

}

public void escribemenu(){
    System.out.println("****************MENU**************");
    System.out.println("Escoge una opción:");
    System.out.println("    1.-Realiza una opción");
    System.out.println("    2.-Agrega un observador");
    System.out.println("    3.-Retira un observador");
    System.out.println("    0.-Sal del programa");
      
}

public void escribeSeleccion(){
    System.out.println("Escoge una opción");
    System.out.println("    1.-Envía un correo");
    System.out.println("    2.-Registrar auditoría");
    System.out.println("    3.-Informa al jefe");
}

public void agregaObservador(int o){
    boolean ok = true;
    
    switch(o){
        case 1:
            sujeto.añadirObs(correo);
            break;
        case 2:
            sujeto.añadirObs(auditor);
            break;
        case 3:
            sujeto.añadirObs(informante);
            break;
        default:
            ok = false;
            System.out.println("Opción errada");
        
    }
    if (ok= true){
        System.out.println("Observador agregado");
    }
}

public void retiraObservador(int o){
    boolean ok = true;
    
    switch(o){
        case 1: 
            sujeto.retirarObs(correo);
            break;
        case 2:
            sujeto.retirarObs(auditor);
            break;
        case 3:
            sujeto.retirarObs(informante);
            break;
        default:
            ok = false;
            System.out.println("Opción errada");
            
    }
    if (ok =true){
        System.out.println("Observador retirado");
    }
}

}
