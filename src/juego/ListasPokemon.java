package juego;

import java.util.ArrayList;

public class ListasPokemon {
    private ArrayList<Pokemon> listado;

    public ListasPokemon() {
        this.listado = new ArrayList<Pokemon>();
    }

    public void agregarListado(Pokemon unPokemon){
        listado.add(unPokemon);
    }
    public void mostrarListado(){
        System.out.println("***Pokemons del usuario***");
        for (Pokemon unPokemon : listado){
            System.out.println(unPokemon.toString());
        }
    }

}
