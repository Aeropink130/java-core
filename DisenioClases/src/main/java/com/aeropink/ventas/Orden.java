
package com.aeropink.ventas;

public class Orden {
    
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    
    public Orden(){
        this.idOrden = ++contadorOrdenes;
        //inicializar arreglo
        productos = new Producto[MAX_PRODUCTOS];
    }
    
    public void agregarProducto(Producto producto){
        if(this.contadorProductos < MAX_PRODUCTOS){
            productos[contadorProductos++] = producto;
        } else{
            System.out.println("Se ha superado el maximo de productos: " + MAX_PRODUCTOS);
        }
        
    }
    
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            Producto producto = this.productos[i];
            total += producto.getPrecio();
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("Orden con #" + this.idOrden);
        System.out.println("Total de la orden" + this.calcularTotal());
        System.out.println("Productos de la orden:");
        for (int i = 0; i < contadorProductos; i++) {
            System.out.println(productos[i]);
        }
    }
}
