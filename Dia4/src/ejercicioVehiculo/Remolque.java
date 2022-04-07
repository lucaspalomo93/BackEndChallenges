package ejercicioVehiculo;

public class Remolque {
    private int peso;
    private int valor;

    public Remolque(int peso, int valor) {
        this.peso = peso;
        this.valor = valor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Remolque{" + "peso=" + peso + ", valor=" + valor + '}';
    }
    
    
    
    
    
}
