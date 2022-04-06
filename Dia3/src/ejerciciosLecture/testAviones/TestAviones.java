package ejerciciosLecture.testAviones;

import ejercicioPairProgramming.aviones.Aeromoza;
import ejercicioPairProgramming.aviones.AvionPasajeros;
import ejercicioPairProgramming.aviones.Combate;
import ejercicioPairProgramming.aviones.Pasajero;
import java.util.ArrayList;
import java.util.List;

public class TestAviones {
    public static void main(String[] args) {
        Pasajero pasajero1 = new Pasajero("Lucas", "Palomo");
        Pasajero pasajero2 = new Pasajero("Lautaro", "Bernal");
        Pasajero pasajero3 = new Pasajero("Jose", "Lopez");
        Pasajero pasajero4 = new Pasajero("Maria", "Gonzales");
        Pasajero pasajero5 = new Pasajero("Martin", "Perez");
        
        Aeromoza aeromoza1 = new Aeromoza("Juana", "Fernandez");
        Aeromoza aeromoza2 = new Aeromoza("Lucia", "Dominguez");
        
        List<Pasajero> pasajeros = new ArrayList<>();
        pasajeros.add(pasajero1);
        pasajeros.add(pasajero2);
        pasajeros.add(pasajero3);
        pasajeros.add(pasajero4);
        pasajeros.add(pasajero5);
        
        List<Aeromoza> aeromozas = new ArrayList<>();
        aeromozas.add(aeromoza1);
        aeromozas.add(aeromoza2);
        
        AvionPasajeros avionPasajero1 = new AvionPasajeros(6, 100, 50, aeromozas, pasajeros, 5, 400);
        avionPasajero1.despegar();
        avionPasajero1.aterrizar();
        avionPasajero1.cargarEquipaje();
        avionPasajero1.comprobarEspacio();
        avionPasajero1.listarPasajeros();
        
        Combate avionCombate1 = new Combate(2, 150, 25.50f, 6, 100);
        avionCombate1.accionesEvasivas();
        avionCombate1.disparar(70);
        avionCombate1.lanzarMisiles(4);
        avionCombate1.comprobarSuministros();
        
    }
}
