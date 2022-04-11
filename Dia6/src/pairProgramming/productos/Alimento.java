package pairProgramming.productos;

public class Alimento extends Producto{
    private String tipoDeAlimento;
    private boolean estaVencido;
    
    
    public Alimento(){
        
    }
    
    public Alimento(String tipoDeAlimento, boolean estaVencido, String nombre, int id, double precio) {
        super(nombre, id, precio);
        this.tipoDeAlimento = tipoDeAlimento;
        this.estaVencido = estaVencido;
    }

    public String getTipoDeAlimento() {
        return tipoDeAlimento;
    }

    public void setTipoDeAlimento(String tipoDeAlimento) {
        this.tipoDeAlimento = tipoDeAlimento;
    }
    
//    public boolean isVencido(){
//        return this.estaVencido;
//    }
    
    
}
