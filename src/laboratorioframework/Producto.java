package laboratorioframework;
/**
 *
 * @author Leonard Manrique
 */
public class Producto {
    private final String nombre; 
    private final int cantidad; 
    //constructor de la clase producto
    public Producto(String s, int i) {
        nombre = s;
        cantidad = i;
    }
    //método de la clase object
    @Override
    public String toString(){
        return ("Nombre: "+nombre+" Cantidad: "+cantidad);
    }
    //métodos de encapsulamiento
    public String getNombre() {
        return this.nombre;
    } 
    public int getCantidad(){
        return this.cantidad;
    }
} 