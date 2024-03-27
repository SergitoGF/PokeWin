package juego;

import java.util.Scanner;

/**
 * @author Sergio Gago Fernández
 * @version 1.0
 */
public class Programa {
    public static void main(String[] args) {
        ListasPokemon unPokemon = creacionPokemons();
        mostrarMenu(unPokemon);
    }

    private static void mostrarMenu(ListasPokemon unPokemon) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        boolean salir = false;
        do {
            System.out.println("***Menú de opciones***");
            System.out.println("1.Mostrar Pokemons.");
            System.out.println("2.Buscar pokemon por nombre.");
            System.out.println("3.Mostrar pokemons por tipo.");
            System.out.println("4.Salir del juego.");
            System.out.print("Escoge una opción 1-4: ");
            opcion = entrada.nextInt();
            System.out.println(" ");


            switch (opcion) {
                case 1:
                    unPokemon.mostrarListado();
                    break;
                case 2:
                    System.out.println("Nombre del pokemon: ");
                    String nombre = entrada.next();
                    System.out.println(" ");
                    unPokemon.buscarNombre(nombre);
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("¿Qué tipo de pokemon quieres ver?");
                    String tipo = entrada.next();
                    System.out.println(" ");
                    unPokemon.pokemonsTipo(tipo);
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println("Cerrando sesión...");
                    salir = true;
                    break;
                default:
                    System.out.println("La opción escogida no existe");
            }
        } while (!salir);
        entrada.close();
    }

    private static void mostrarPokemons(ListasPokemon unPokemon) {
        unPokemon.mostrarListado();
    }

    private static ListasPokemon creacionPokemons() {
        //Creamos dos pokemons para el usuario y agregamos en la lista del usuario
        Pokemon pokemon1 = new Pokemon("Ossawott","Agua");
        Pokemon pokemon2 = new Pokemon("Charmander", "Fuego");
        Pokemon pokemon3 = new Pokemon("Piplup","Agua");
        Pokemon pokemon4 = new Pokemon("Flekinn", "Fuego");

        ListasPokemon unPokemon = new ListasPokemon();
        unPokemon.agregarListado(pokemon1);
        unPokemon.agregarListado(pokemon2);
        unPokemon.agregarListado(pokemon3);
        unPokemon.agregarListado(pokemon4);
        return unPokemon;
    }
}
