/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producto;

/**
 *
 * @author DELL LATITUDE 5401
 */
import java.util.ArrayList;
import java.util.List;
public class AplicacionInventario {
    public static void main(String[] args) {
        Proveedor proveedor1 = new Proveedor("Proveedor A");
        Proveedor proveedor2 = new Proveedor("Proveedor B");

        Producto producto1 = new ProductoElectronico("Televisor", 500, 10, proveedor1, 24);
        Producto producto2 = new ProductoAlimenticio("Manzana", 2, 100, proveedor2, "2024-09-01");

        Categoria categoríaElectrónicos = new Categoria("Electrónicos");
        Categoria categoríaAlimentos = new Categoria("Alimentos");

        categoríaElectrónicos.agregarProducto(producto1);
        categoríaAlimentos.agregarProducto(producto2);

        List<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);

        GestorDeInventario gestorDeInventario = new GestorDeInventario(productos, new CalculadorDePreciosSinDescuento());
        System.out.println("Precio total sin descuento: " + gestorDeInventario.calcularPrecioTotal());

        gestorDeInventario.setCalculadorDePrecio(new CalculadorDePrecioConDescuento(new DescuentoPorcentaje(10)));
        System.out.println("Precio total con descuento del 10%: " + gestorDeInventario.calcularPrecioTotal());

        gestorDeInventario.setCalculadorDePrecio(new CalculadorDePrecioPorCategoria(categoriaElectronicos));
        System.out.println("Precio total de electrónicos: " + gestorDeInventario.calcularPrecioTotal());
    }
}
    

