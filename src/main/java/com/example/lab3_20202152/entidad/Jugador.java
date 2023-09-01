package com.example.lab3_20202152.entidad;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;
import java.util.UUID;

@Getter
@Setter
public class Jugador {
    private int idJugador = new Random().nextInt();
    private String nombre;
    private int edad;
    private String;

    public Jugador() {
    }

    public Jugador(String nombre, String club) {
        this.nombre = nombre;
        this.club = club;

    }

}
