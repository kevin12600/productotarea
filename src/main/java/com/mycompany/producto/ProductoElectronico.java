/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producto;

/**
 *
 * @author DELL LATITUDE 5401
 */
 class ProductoElectronico extends Producto{
     private int garantia;

    public ProductoElectronico(int garantia, String nombre, double precio, int cantidad, Object proveedor) {
        super(nombre, precio, cantidad, proveedor);
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }

     @Override
   public String getDetalles(){
       return "Electrónico: " + getNombre() + " - Garantía: " + garantia + " meses";
    }
   }
class ProductoAlimenticio extends Producto {
    private String fechaDeCaducidad;

    public ProductoAlimenticio(String nombre, double precio, int cantidad, Proveedor proveedor, String fechaDeCaducidad) {
        super(nombre, precio, cantidad, proveedor);
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    public String getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }

    @Override
    public String getDetalles() {
        return "Alimenticio: " + getNombre() + " - Caducidad: " + fechaDeCaducidad;
    }
}
