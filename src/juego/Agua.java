package juego;

public class Agua extends Pokemon implements Ataques {

    public Agua(String nombre, String tipo) {
        super(nombre, tipo);
    }

    @Override
    public void mostrarAtaques() {
        System.out.println("Hidrocañón");
        System.out.println("Pistola Agua");
        System.out.println("Danza lluvia");
    }
}
