/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.equipo_futbol;

/**
 *
 * @author Dell
 */
public class Equipo_futbol {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        Futbolista jugador1 = new Futbolista("Lionel Messi", 36, "Delantero");
        Futbolista jugador2 = new Futbolista("Sergio Ramos", 38, "Defensa");
        
         Entrenador entrenador = new Entrenador("Pep Guardiola", 53, 20);
         
        Equipo equipo = new Equipo("Bayer munich");
        equipo.agregarJugador(jugador1);
        equipo.agregarJugador(jugador2);
        equipo.asignarEntrenador(entrenador);

        // Entrenar y jugar partido
        equipo.entrenarEquipo();
        equipo.jugarPartido();
        System.out.println("--------------------------------------------------------------------");
       
        Futbolista jugador3 = new Futbolista("Lionel Messi", 36, "Delantero");
        Futbolista jugador4 = new Futbolista("Sergio Ramos", 38, "Defensa");
        
         Entrenador entrenador1 = new Entrenador("Pep Guardiola", 53, 20);
         
        Equipo equipo1 = new Equipo("Manchester United");
        equipo1.agregarJugador(jugador3);
        equipo1.agregarJugador(jugador4);
        equipo1.asignarEntrenador(entrenador1);

        // Entrenar y jugar partido
        equipo1.entrenarEquipo();
        equipo1.jugarPartido();

    }
}
