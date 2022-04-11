package pairProgramming.productos;

public class ProductoFactory {
    
    public Producto getProducto(String tipoProducto){
        if(tipoProducto == null){
            return null;
        }
        if(tipoProducto.equals("ALIMENTO")){
            return new Alimento();
        } else if(tipoProducto.equals("ELECTRODOMESTICO")){
            return new Electrodomestico();
        }
        return null;
    }
}
