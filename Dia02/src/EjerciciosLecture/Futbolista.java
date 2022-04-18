package EjerciciosLecture;

public class Futbolista implements IAcciones{
    
    String nombre;

    public Futbolista(String nombre) {
        this.nombre = nombre;
    }
    
    

    @Override
    public void mantenerPelota() {
        System.out.println("Cubre la pelota pisandola");
    }

    @Override
    public void pasarPelota() {
        System.out.println("Patea la pelota hacia un compañero");
    }

    @Override
    public void detenerRival() {
        System.out.println("Se tira a barrer interceptando al rival");
    }

    @Override
    public void anotar() {
        System.out.println("Patea hacia el arco apuntando al angulo superior derecho");
    }
    
}
