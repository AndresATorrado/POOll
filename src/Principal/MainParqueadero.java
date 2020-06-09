/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Controlador.Controlador;
import Modelo.Vehiculo;
import Vista.VistaParqueadero;

/**
 *
 * @author estudiante
 */
public class MainParqueadero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     VistaParqueadero p = new VistaParqueadero();
     Vehiculo v = new Vehiculo();
     
        Controlador controlador = new Controlador(p,v);
     
    }
    
}
