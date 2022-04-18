package pairProgramming.productos;

import java.util.Scanner;

public class TestProductos {
    public static void main(String[] args) {
        
        ProductoFactory prodFactory = new ProductoFactory();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un tipo: ");
        String tipo = sc.nextLine();
        
        Producto p = prodFactory.getProducto(tipo);

        System.out.println("Ingrese un nombre: ");
        p.setNombre(sc.nextLine());
        System.out.println(p.getNombre());
        System.out.println(p.mostrarInformacion());
    }
}
