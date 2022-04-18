package ejerciciosLecture;

import java.util.List;
import java.util.Scanner;

public class UsuarioStandard extends Usuario {

    public UsuarioStandard(String nombreUsuario, List<Cancion> canciones) {
        super(nombreUsuario, canciones);
    }

    public void escucharCancion(List<Cancion> canciones) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int tamanio = canciones.size();
        int cont = 3;
        do {
            System.out.println(" 1.Pasar cancion -- 2. Salir");
            opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.println("Escuchando... " + canciones.get((int) (Math.random() * tamanio)).toString());
                cont--;
            }
        } while (opcion != 2 && cont > 0);

        System.out.println("Ha alcanzado el limite de reproduccion, pasese a premium para mas beneficios!");

    }
}
