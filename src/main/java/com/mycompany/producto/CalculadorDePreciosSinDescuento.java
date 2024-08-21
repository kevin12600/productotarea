/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producto;

/**
 *
 * @author DELL LATITUDE 5401
 */
import java.util.List;
class CalculadorDePreciosSinDescuento implements CalculadorDePrecio {
    
@Override
    public double calcularPrecioTotal(List<Producto> productos) {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total;
    }
}

class CalculadorDePrecioConDescuento implements CalculadorDePrecio {
    private Descuento descuento;

    public CalculadorDePrecioConDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    @Override
    public double calcularPrecioTotal(List<Producto> productos) {
        double total = 0;
        for (Producto producto : productos) {
            double precioConDescuento = descuento.aplicarDescuento(producto);
            total += precioConDescuento * producto.getCantidad();
        }
        return total;
    }
}

class CalculadorDePreciosPorCategoria implements CalculadorDePrecio {
    private Categoria categoria;

    public CalculadorDePreciosPorCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public double calcularPrecioTotal(List<Producto> productos) {
        double total = 0;
        for (Producto producto : productos) {
            if (categoria.getProductos().contains(producto)) {
                total += producto.getPrecio() * producto.getCantidad();
            }
        }
        return total;
    }
}