package ejercicioVehiculo;

public class Particular extends Vehiculo {

    private int numeroDePuertas;

    public Particular(String matricula, float carga, int numeroDePuertas) {
        super(matricula, carga);
        this.numeroDePuertas = numeroDePuertas;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public void acelerar(float velocidad) {
        super.setVelocidad(velocidad);
        System.out.println("Acelerando el vehiculo Particular a " + velocidad + "km/h");
    }

    @Override
    public String toString() {
        return "Particular{" + "numeroDePuertas=" + numeroDePuertas + super.toString();
    }

    
    public void mostrarNumeroDePuertas(){
        System.out.println("Cantidad de puertas: " + this.numeroDePuertas);
    }
}
