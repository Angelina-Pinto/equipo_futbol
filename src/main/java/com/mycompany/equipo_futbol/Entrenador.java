/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.equipo_futbol;

/**
 *
 * @author Dell
 */
public class Entrenador extends Persona{
     private int aniosExperiencia;
     
     public Entrenador(String nombre, int edad, int aniosExperiencia) {
        super(nombre, edad);
        this.aniosExperiencia = aniosExperiencia;
    }   
     
      public void dirigirEntrenamiento() {
        System.out.println(getNombre() + " está dirigiendo el entrenamiento.");
    }

   public void dirigirPartido() {
        System.out.println(getNombre() + " está dirigiendo el partido.");
    }
}