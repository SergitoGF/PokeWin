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

    public void mostrarLista(){
        System.out.println(" ");
        System.out.println("***Lista de Pokemons***");
        for (Pokemon unPokemon : listado){
            System.out.println(unPokemon.toString());
        }
        System.out.println(" ");
    }
    public void mostrarListado(){
        System.out.println(" ");
        System.out.println("***Lista de Pokemons***");
        for (Pokemon unPokemon : listado){
            System.out.println(unPokemon.toString());
        }
        System.out.println(" ");
    }
     public void mostrarPokemon(int opcionElegida){
         System.out.println(" ");
         System.out.println("***Pokemon escogido***");
         Pokemon unPokemon = null;
         unPokemon = listado.get(opcionElegida);
         System.out.println(unPokemon);
         System.out.println(" ");
         System.out.println("***Ataques del pokemon**");
         mostrarAtaque(opcionElegida);
         System.out.println(" ");
     }
     public void mostrarAtaque(int opcionElegida){
         Pokemon unPokemon = null;
         unPokemon = listado.get(opcionElegida);
         if (unPokemon instanceof Agua esAgua){
             esAgua.mostrarAtaques();
         } else if (unPokemon instanceof Fuego esFuego){
             esFuego.mostrarAtaques();
         }
     }
}
