package ejerciciosLecture;

import java.util.List;
import java.util.Scanner;

public class UsuarioPremium extends Usuario {

    public UsuarioPremium(String nombreUsuario, List<Cancion> canciones) {
        super(nombreUsuario, canciones);
    }

    private void escucharCancion(List<Cancion> canciones) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int tamanio = canciones.size();
        do {
            System.out.println(" 1.Pasar cancion -- 2. Salir");
            opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.println("Escuchando... " + canciones.get((int) (Math.random() * tamanio)).toString());
            }
        } while (opcion != 2);

        System.out.println("Gracias por utilizar Spotify");

    }
}
