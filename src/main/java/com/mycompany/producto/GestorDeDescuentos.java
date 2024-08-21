/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producto;

/**
 *
 * @author DELL LATITUDE 5401
 */
public class GestorDeDescuentos {
    private Descuento descuento;

    public GestorDeDescuentos(Descuento descuento) {
        this.descuento = descuento;
    }

    public void aplicarDescuento(Producto producto) {
        double precioConDescuento = descuento.aplicarDescuento(producto);
        producto.setPrecio(precioConDescuento);
    }
}
    

