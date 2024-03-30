package juego;

/**
 * @author Sergio Gago Fernández
 * @version 1.0
 * @see ListasPokemon
 */
public class Pokemon {
    private String nombre;
    private String tipo;

    /**
     * Constructor de Pokemon.
     * @param nombre Nombre del pokemon tipo String
     * @param tipo tipo de pokemon tipo String
     */
    public Pokemon(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    /**
     * @return Devuelve el nombre del Pokemon
     * @since 1.1
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return Devuelve el tipo de Pokemon
     * @since 1.1
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @return Devuelve una línea con todos los datos de un Pokemon.
     * @since 1.5
     */
    @Override
    public String toString() {
        return "Pokemon [" + "(Nombre: " + nombre + ") (Tipo: " + tipo + ")]";
    }
}
