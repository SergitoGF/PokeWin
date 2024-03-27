package juego;

public class Programa {
    public static void main(String[] args) {
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

        unPokemon.mostrarListado();


    }
}
