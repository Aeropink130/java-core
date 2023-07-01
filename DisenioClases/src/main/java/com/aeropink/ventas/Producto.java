
package com.aeropink.ventas;

public class Producto {
    
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    
    //constructor vacio
    private Producto(){
        idProducto = ++contadorProductos;
    }
    
    //constructor sobrecargado de 2 argumentos
    public Producto(String nombre, double precio){
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
}
