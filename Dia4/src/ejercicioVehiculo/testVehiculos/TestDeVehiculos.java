package ejercicioVehiculo.testVehiculos;

import ejercicioVehiculo.Carga;
import ejercicioVehiculo.Particular;
import ejercicioVehiculo.Remolque;

public class TestDeVehiculos {

    public static void main(String[] args) {
        Remolque remolque1 = new Remolque(800, 15000);

        Carga carga1 = new Carga("abc123", 500);

        Particular particular1 = new Particular("jjg432", 150.50f, 4);
        
//        particular1.mostrarNumeroDePuertas();
//        particular1.acelerar(120);
//        System.out.println(particular1);
        
        carga1.acelerar(120);
        carga1.ponRemolque(remolque1);
        carga1.acelerar(130);
        carga1.quitaRemolque();
        System.out.println(carga1);
    }
}
