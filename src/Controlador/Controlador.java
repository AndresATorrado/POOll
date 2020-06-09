/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Vehiculo;
import static Modelo.Vehiculo.vehiculo;
import Vista.VistaParqueadero;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author estudiante
 */
public class Controlador implements ActionListener {

private Vehiculo vehiculo = null;
private VistaParqueadero vistaParqueadero = null;

    public Controlador(Vehiculo vehiculo,VistaParqueadero vistaParqueadero) {
    super();
    this.vehiculo=vehiculo; 
    this.vistaParqueadero=vistaParqueadero;
    actionListener(this);
    }

    public Controlador(VistaParqueadero p, Vehiculo v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

private void actionListener(ActionListener controlador){
vistaParqueadero.btnAgregar.addActionListener(controlador);
vistaParqueadero.btnLimpiar.addActionListener(controlador);
vistaParqueadero.btnReiniciar.addActionListener(controlador);
vistaParqueadero.btnTotalizar.addActionListener(controlador);
}

@Override
public void actionPerformed(ActionEvent e){
  
  String comando = e.getActionCommand();

        switch (comando) {

            case "Agregar":
                try {
                    Vehiculo.vehiculo.add(new Vehiculo(vistaParqueadero.txtPlaca.getText()));
                    
                    vistaParqueadero.txtPlaca.setText("");
                    
                } catch (HeadlessException | NumberFormatException ex) {

                    JOptionPane.showMessageDialog(null, "No sea bobo y metale datos al empleado >:u '", "Dcris Te Informa", JOptionPane.ERROR_MESSAGE);
                }
                break;
                 case "Totalizar":
                vistaParqueadero.txtResultados.setText("");

                for (Vehiculo dcris : Vehiculo.vehiculo) {

                    vistaParqueadero.txtResultados.append(dcris.toString());

                }
                JOptionPane.showMessageDialog(null, "Se Mostro un total de  '" + Vehiculo.vehiculo.size() + "' Empleados Almacenados", "Dcris Te Informa", JOptionPane.CLOSED_OPTION);
                break;
        }
        
}
    
    
    
    
  
  
  
 
public void ActionListener() {

        vistaParqueadero.btnAgregar.addActionListener(this);
        vistaParqueadero.btnTotalizar.addActionListener(this);

    }
    
}
 
 

