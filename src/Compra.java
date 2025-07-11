public class Compra implements Comparable<Compra> {
    private double valor;
    private String descripcion;

    public Compra(String descripcion, double valor) {
        this.valor = valor;
        this.descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Compra: valor=" + valor + ", descripcion=" + descripcion;
    }

    @Override
    public int compareTo(Compra otraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(otraCompra.getValor()));
    }
}
