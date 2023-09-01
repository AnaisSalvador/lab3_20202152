package com.example.lab3_20202152.entidad;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;
import java.util.UUID;

@Getter
@Setter

public class Estadio {
    //id estadio - string nombre - string provincia - string club
    private int idEstadio = new Random().nextInt();
    private String nombre;
    private String provincia;
    private String club;

    public Estadio() {
    }

    public Estadio(String nombre, String provincia) {
        this.nombre = nombre;
        this.provincia = provincia;
    }

}
