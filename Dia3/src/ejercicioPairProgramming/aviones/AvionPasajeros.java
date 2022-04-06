package ejercicioPairProgramming.aviones;

import java.util.List;
import java.util.Random;

public class AvionPasajeros extends Avion{
    private int cargaMaxima;
    private int cantMaxPasajeros;
    private List<Aeromoza> aeromozas;
    private List<Pasajero> pasajeros;
    

    public AvionPasajeros(int cantAsi, int hs, float tam, List<Aeromoza> aeromozas, List<Pasajero> pasajeros, int cantMaxPasajeros, int cargaMaxima) {
        super(cantAsi, hs, tam);
        this.aeromozas = aeromozas;
        this. pasajeros = pasajeros;
        this.cantMaxPasajeros = cantMaxPasajeros;
        this.cargaMaxima = cargaMaxima;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public List<Aeromoza> getAeromozas() {
        return aeromozas;
    }

    public void setAeromozas(List<Aeromoza> aeromozas) {
        this.aeromozas = aeromozas;
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        return "AvionPasajeros{" + "cargaMaxima=" + cargaMaxima + ", aeromozas=" + aeromozas + ", pasajeros=" + pasajeros + '}';
    }
    
    public void cargarEquipaje(){
        float cargaEquipaje = 0; 
        //int num1 = rd.nextInt(1000);
        for(int i = 1; i < this.pasajeros.size(); i++){       
            cargaEquipaje += 100;
        }
        if(cargaEquipaje > this.cargaMaxima){
            System.out.println("********************* Alguien lleva demasiado equipaje... **********************");
        }else{
            System.out.println("********************* Todos los equipajes han sido cargados ********************");
        }
    }
    
    public void comprobarEspacio(){
        System.out.println("****************** COMPROBANDO ESPACIO ****************");
        if(this.pasajeros.size() > this. cantMaxPasajeros){
            System.out.println("Limite de pasajeros excedidos");
        }else if(this.pasajeros.size() < this.cantMaxPasajeros){
            System.out.println("Quedan espacios libres");
        }else{
            System.out.println("Todos los asientos estan ocupado");
        }
    }
    
    public void listarPasajeros(){
        System.out.println("************ LISTA DE PASAJAEROS ***************");
        for(int i = 0; i<this.pasajeros.size(); i++){
            System.out.println(this.pasajeros.get(i));
        }
    }
    
    
    
}
