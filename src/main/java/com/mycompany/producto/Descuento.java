/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producto;

/**
 *
 * @author DELL LATITUDE 5401
 */
abstract class Descuento {
    
 public abstract double aplicarDescuento(Producto producto);
}

class DescuentoPorcentaje extends Descuento {
    private double porcentaje;

    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicarDescuento(Producto producto) {
        return producto.getPrecio() * (1 - porcentaje / 100);
    }
}

class DescuentoFijo extends Descuento {
    private double montoFijo;

    public DescuentoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    @Override
    public double aplicarDescuento(Producto producto) {
        return producto.getPrecio() - montoFijo;
    }
}
