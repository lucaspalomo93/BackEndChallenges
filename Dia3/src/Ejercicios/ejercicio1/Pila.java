package Ejercicios.ejercicio1;


/*
Crear un programa para implementa una pila utilizando una lista enlazada como estructura de datos, 
Dicha pila deberá almacenar cualquier tipo de objeto, y deberás implementar métodos para ellos como por ejemplo:

Insertar un objeto en la pila (push).
Recuperar un objeto de la pila (pop).
Obtener el objeto de la cima (top) de la pila, sin extraerlo.
Averiguar si hay algún objeto almacenado en la pila.
Devolver el número de objetos almacenados en la pila.

*/

public class Pila {
    int vectorPila[];
    int tope;
    
    public Pila(int tamanio){
        vectorPila = new int[tamanio];
        tope = 0;
    }
    
    public void insertar(int numero){
        vectorPila[tope] = numero;
        tope++;
    }
    
    public int eliminar(){
        int eliminar = 0;
        if(tope == 0){
            System.out.println("La pila esta vacia");
        }else{
            eliminar = vectorPila[tope];
            tope--;
        }
        return eliminar;
    }
    
    public boolean vacio(){
        if(tope == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public void mostrarPila(){
        for(int i= 0; i < vectorPila.length; i++){
            System.out.println("Elemento " + i + " = " + vectorPila[i]);
        }
    }
}
