package ejercicioVehiculo;

public class Vehiculo {

    private String matricula;
    private float carga;
    private float velocidad;

    public Vehiculo(String matricula, float carga) {
        this.matricula = matricula;
        this.carga = carga;
        this.velocidad = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", carga=" + carga + ", velocidad=" + velocidad + '}';
    }

    protected void acelerar(float velocidad) {
        this.velocidad = velocidad;
        System.out.println("Acelerando a " + velocidad + "km/h");
    }

}
