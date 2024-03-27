package juego;

import java.util.ArrayList;

/**
 * @author Sergio Gago Fernández
 * @version 1.0
 */
public class ListasPokemon {
    private ArrayList<Pokemon> listado;

    public ListasPokemon() {
        this.listado = new ArrayList<>();
    }

    public void agregarListado(Pokemon unPokemon) {
        listado.add(unPokemon);
    }

    public void mostrarLista() {
        System.out.println(" ");
        System.out.println("***Lista de Pokemons***");
        for (Pokemon unPokemon : listado) {
            System.out.println(unPokemon.toString());
        }
        System.out.println(" ");
    }

    public void mostrarListado() {
        System.out.println(" ");
        System.out.println("***Lista de Pokemons***");
        for (Pokemon unPokemon : listado) {
            System.out.println(unPokemon.toString());
        }
        System.out.println(" ");
    }

    public void buscarNombre(String nombre) {
        boolean encontrado = false;
        for (Pokemon unPokemon : listado) {
            if (unPokemon.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("¡¡POKEMON ENCONTRADO!!");
                System.out.println(unPokemon);
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("¡¡NO SE ENCUENTRA EL POKEMON!!");
        }
    }

    public void pokemonsTipo(String tipo) {
        boolean encontrado = false;
        for (Pokemon unPokemon : listado) {
            if (unPokemon.getTipo().equalsIgnoreCase(tipo)) {
                System.out.println(unPokemon);
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("¡¡NO EXISTE ESE TIPO DE POKEMON!!");
        }
    }
}
