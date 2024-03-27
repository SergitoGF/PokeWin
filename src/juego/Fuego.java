package juego;

public class Fuego extends Pokemon implements Ataques {

    public Fuego(String nombre, String tipo) {
        super(nombre, tipo);
    }

    @Override
    public void mostrarAtaques() {
        System.out.println("Lanzallamas");
        System.out.println("Ascuas");
        System.out.println("Humareda");
    }
}
