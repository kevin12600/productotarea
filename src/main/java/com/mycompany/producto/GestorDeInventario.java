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
public class GestorDeInventario {
    
    private List<Producto> productos;
    private CalculadorDePrecio calculadorDePrecio;

    public GestorDeInventario(List<Producto> productos, CalculadorDePrecio calculadorDePrecio) {
        this.productos = productos;
        this.calculadorDePrecio = calculadorDePrecio;
    }

    public double calcularPrecioTotal() {
        return calculadorDePrecio.calcularPrecioTotal(productos);
    }

    public void setCalculadorDePrecio(CalculadorDePrecio calculadorDePrecio) {
        this.calculadorDePrecio = calculadorDePrecio;
    }
}
