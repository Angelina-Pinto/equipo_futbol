/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.equipo_futbol;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class Equipo {
       private String nombreEquipo;
    private Entrenador entrenador;
    private List<Jugador> jugadores;

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.jugadores = new ArrayList<>();
    }

    public void asignarEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void entrenarEquipo() {
        System.out.println("Entrenamiento del equipo " + nombreEquipo);
        for (Jugador jugador : jugadores) {
            jugador.entrenar();
        }
        if (entrenador != null) {
            entrenador.dirigirEntrenamiento();
        }
    }

    public void jugarPartido() {
        System.out.println("Partido del equipo " + nombreEquipo);
        for (Jugador jugador : jugadores) {
            jugador.jugarPartido();
        }
        if (entrenador != null) {
            entrenador.dirigirPartido();
        }
    }
}
