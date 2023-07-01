
package ventas;

import com.aeropink.ventas.*;

public class Ventas {
    
    public static void main(String[] args) {
        //crear varios objetos de tipo producto
        Producto producto1 = new Producto("Camisa", 50);
        Producto producto2 = new Producto("Pantalon", 100);
        Producto producto3 = new Producto("Calcetines", 35);
        Producto producto4 = new Producto("Calzones", 78);
        
        //creamos un objeto de tipo orden
        Orden orden1 = new Orden();
        //agregamos los productos al objeto orden
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto4);
        orden1.agregarProducto(producto3);
        
        //imprimir orden
        orden1.mostrarOrden();
        
        //orden 2
        Orden orden2 = new Orden();
        
        //Agregamos productos
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto3);
        
        orden2.mostrarOrden();
        
    }
}
