/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.equipo_futbol;

/**
 *
 * @author Dell
 */
public class Futbolista extends Persona implements Jugador {
    
     private String posicion;

    public Futbolista(String nombre, int edad, String posicion) {
        super(nombre, edad);
        this.posicion = posicion;
    }

  

    @Override
    public String getPosicion() {
        System.out.println("El futbolista está entrenando."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
         return null;
    }

    @Override
    public void entrenar() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    System.out.println("El futbolista está entrenando."); 
    }

    @Override
    public void jugarPartido() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    System.out.println("El futbolista está jugando el partido."); 
    }
    
}
