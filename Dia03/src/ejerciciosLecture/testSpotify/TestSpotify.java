package ejerciciosLecture.testSpotify;

import ejerciciosLecture.Cancion;
import ejerciciosLecture.UsuarioStandard;
import java.util.ArrayList;
import java.util.List;

public class TestSpotify {

    public static void main(String[] args) {
        Cancion cancion1 = new Cancion("Yellow Submarine", "mp3");
        Cancion cancion2 = new Cancion("Vamos Las Bandas", "mp3");
        Cancion cancion3 = new Cancion("Message In A Bottle", "mp3");
        Cancion cancion4 = new Cancion("Comfortably Numb", "mp3");
        List<Cancion> canciones = new ArrayList<Cancion>();
        
        canciones.add(cancion1);
        canciones.add(cancion2);
        canciones.add(cancion3);
        canciones.add(cancion4);
        
        UsuarioStandard usuariostd = new UsuarioStandard("lucas", canciones);
        usuariostd.escucharCancion(canciones);
    }

}
