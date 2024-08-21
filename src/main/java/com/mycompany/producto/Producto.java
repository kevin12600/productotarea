/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.producto;

/**
 *
 * @author DELL LATITUDE 5401
 */
abstract class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    private Proveedor proveedor;

    public Producto(String nombre, double precio, int cantidad, Proveedor proveedor) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
    }
    
     public abstract String getDetalles();

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }
     

    
    }

