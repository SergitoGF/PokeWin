package juego;

public abstract class Pokemon {
    private String nombre;
    private String tipo;
    private int vida;

    public Pokemon(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = 100;
    }

    @Override
    public String toString() {
        return "Pokemon [" + "(Nombre: " + nombre + ") (Tipo: " + tipo + ") (Vida: " + vida + ")]";
    }
}
