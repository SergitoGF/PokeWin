package juego;

import java.util.ArrayList;

public class Pokemon {
    private String nombre;
    private Tipo tipo;
    private ArrayList<Pokemon> listadoUsuario;
    private ArrayList<Pokemon> listadoEnemigo;

    public Pokemon(String nombre, Tipo tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.listadoUsuario = new ArrayList<>();
        this.listadoEnemigo = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
}
