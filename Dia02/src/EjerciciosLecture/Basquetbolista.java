package EjerciciosLecture;

public class Basquetbolista implements IAcciones{

    public Basquetbolista() {
    }
    
    

    @Override
    public void mantenerPelota() {
        System.out.println("Aguanta la pelota tomandola con las manos y llevandola hacia el cuerpo");
    }

    @Override
    public void pasarPelota() {
        System.out.println("Lanza la pelota hacia la otra punta de la cancha hasta las manos de su compañero");
    }

    @Override
    public void detenerRival() {
        System.out.println("Intercepta la pelota pegandole un manotazo");
    }

    @Override
    public void anotar() {
        System.out.println("Tira desde la zona de los tres puntos");
    }
    
}
