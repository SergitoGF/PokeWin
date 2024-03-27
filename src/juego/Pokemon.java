package juego;

/**
 * @author Sergio Gago Fernández
 * @version 1.0
 */
public class Pokemon {
    private String nombre;
    private String tipo;

    public Pokemon(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Pokemon [" + "(Nombre: " + nombre + ") (Tipo: " + tipo + ")]";
    }
}
