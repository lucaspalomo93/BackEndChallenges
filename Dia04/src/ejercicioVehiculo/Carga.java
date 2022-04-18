package ejercicioVehiculo;

public class Carga extends Vehiculo{
    private Remolque remolque;

    public Carga(String matricula, float carga) {
        super(matricula, carga);
        this.remolque = null;
    }



    @Override
    public void acelerar(float velocidad) {
        super.setVelocidad(velocidad);
        if(velocidad > 100 && this.remolque != null){
            System.out.println("La velocidad es muy rapida");
        }else{
            System.out.println("Aumentando la velocidad del transporte de carga a " + velocidad + "km/h");
        }
    }
    
    public void ponRemolque(Remolque remolque){
        this.remolque = remolque;
        System.out.println("El vehiculo tiene ahora un remolque: " + remolque);
    }
    
    public void quitaRemolque(){
        System.out.println("El vehiculo no tiene mas remolque");
        this.remolque = null;
    }

    @Override
    public String toString() {
        return "Carga{" + "matricula: " + super.getMatricula() + 
                "carga del transporte: " + super.getCarga() + 
                "Tiene remolque: " + this.remolque;
    }
    
    
    
    
    
}
