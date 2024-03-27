package juego;

public class Pokemon {
    private String nombre;
    private String tipo;

    public Pokemon(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pokemon[ " + "(Nombre: " + nombre + ")(Tipo: " + tipo + ") ]";
    }
}
