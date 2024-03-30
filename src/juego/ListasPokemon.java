package juego;

import java.util.ArrayList;

/**
 * @author Sergio Gago Fernández
 * @version 1.0
 * @see Pokemon
 */
public class ListasPokemon {
    private ArrayList<Pokemon> listado;

    /**
     * Constructor de ListasPokemon
     */
    public ListasPokemon() {
        this.listado = new ArrayList<>();
    }

    /**
     * Agrega un objeto Pokemon en la lista.
     * @param unPokemon Objeto  de tipo Pokemon
     * @since 1.1
     */
    public void agregarListado(Pokemon unPokemon) {
        listado.add(unPokemon);
    }

    /**
     * Muestra la lista completa de Pokemons
     * @deprecated remplazado por {@link #mostrarListado()}
     * @since 1.5
     */
    public void mostrarLista() {
        System.out.println(" ");
        System.out.println("***Lista de Pokemons***");
        for (Pokemon unPokemon : listado) {
            System.out.println(unPokemon.toString());
        }
        System.out.println(" ");
    }

    /**
     * Muestra la lista completa de Pokemons
     * @since 1.5
     */
    public void mostrarListado() {
        System.out.println(" ");
        System.out.println("***Lista de Pokemons***");
        for (Pokemon unPokemon : listado) {
            System.out.println(unPokemon.toString());
        }
        System.out.println(" ");
    }

    /**
     * @param nombre Nombre de pokemon tipo String
     * @return Devuelve true si se encontró el pokemon, false en caso contrario.
     * @since 1.1
     * @see ListasPokemon
     */
    public boolean buscarNombre(String nombre) {
        for (Pokemon unPokemon : listado) {
            if (unPokemon.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("¡¡POKEMON ENCONTRADO!!");
                System.out.println(unPokemon);
                return true;
            }
        }
        return false;
    }

    /**
     * Busca pokemons en la lista del tipo especificado por parámetro.
     * @param tipo tipo de pokemon de tipo String
     * @since 1.1
     * @see ListasPokemon
     */
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
