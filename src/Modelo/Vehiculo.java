/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author estudiante
 */
public class Vehiculo {
 
 String placa;
 String modelo;
 String fecha;
 String tipo;
 int valor;
public static ArrayList <Vehiculo> vehiculo= new ArrayList<>();
    public Vehiculo() {
    }
 
    public Vehiculo(String placa, String modelo, String fecha, String tipo, int valor) {
        this.placa = placa;
        this.modelo = modelo;
        this.fecha = fecha;
        this.tipo = tipo;
        this.valor = valor;
    }
public Vehiculo(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    
 
}
