package EjercicioPOO;
//del segundo ejercicio punto 3
public class NoPerecedero extends Producto{
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() +"NoPerecedero{" +
                "tipo='" + tipo + '\'' +
                '}';
    }

    public NoPerecedero(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }
}
