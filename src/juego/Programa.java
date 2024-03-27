package juego;

import java.util.Scanner;

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
            System.out.println("2.Escoger pokemon.");
            System.out.println("3.Salir del juego.");
            System.out.print("Escoge una opción 1-3: ");
            opcion = entrada.nextInt();
            System.out.println(" ");


            switch (opcion) {
                case 1:
                    unPokemon.mostrarListado();
                    break;
                case 2:
                    int opcionElegida = 0;
                    do {
                        System.out.println(" ");
                        System.out.println("Elige un pokemon entre  1-4: ");
                        opcionElegida = entrada.nextInt();
                        if (opcionElegida  <= 0 || opcionElegida >= 5){
                            System.err.println("Debes escoger entre 1-4.");
                        } else {
                            unPokemon.mostrarPokemon(opcionElegida-1);
                        }

                    } while (opcionElegida <= 0 || opcionElegida >= 5);

                    break;
                case 3:
                    System.out.println("Cerrando sesión...");
                    salir = true;
                    break;
                default:
                    System.err.println("La opción escogida no existe");
            }
        } while (!salir);
        entrada.close();
    }

    private static void mostrarPokemons(ListasPokemon unPokemon) {
        unPokemon.mostrarListado();
    }

    private static ListasPokemon creacionPokemons() {
        //Creamos dos pokemons para el usuario y agregamos en la lista del usuario
        Pokemon pokemon1 = new Agua("Ossawott","Agua");
        Pokemon pokemon2 = new Fuego("Charmander", "Fuego");
        Pokemon pokemon3 = new Agua("Piplup","Agua");
        Pokemon pokemon4 = new Fuego("Flekinn", "Fuego");

        ListasPokemon unPokemon = new ListasPokemon();
        unPokemon.agregarListado(pokemon1);
        unPokemon.agregarListado(pokemon2);
        unPokemon.agregarListado(pokemon3);
        unPokemon.agregarListado(pokemon4);
        return unPokemon;
    }
}
