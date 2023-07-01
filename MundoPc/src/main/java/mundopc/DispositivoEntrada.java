package mundopc;

public class DispositivoEntrada {
    private String tipoEntrada;
    private String marca;
    private double precio;
    
    public DispositivoEntrada(String tipoEntrada, String marca, double precio){
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
        this.precio = precio;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "DispositivoEntrada{" + "tipoEntrada=" + tipoEntrada + ", marca=" + marca + ", precio=" + precio + '}';
    }
    
}
