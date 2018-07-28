package modelos;

public class Producto {

    public String nombre;
    public String descripcion;
    public float precio;
    public int cantidad;

    public String toString() {
        return "Producto " + this.nombre;
    }
}
