package pairprogramming1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        String usuario, contrasenia, usuarioReingresado, contraseniaReingresada;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un nuevo Usuario: ");
        usuario = sc.next();
        
        System.out.println("Ingrese una nueva contraseña: ");
        contrasenia = sc.next();
        
        System.out.println("Usuario y contraseña creados!");
        
        System.out.println("****************************");
        
        System.out.println("Reingrese su usuario para loguearse: ");
        usuarioReingresado = sc.next();
        
        System.out.println("Reingrese su contraseña: ");
        contraseniaReingresada = sc.next();
        
        if((usuario.equals(usuarioReingresado)) && contrasenia.equals(contraseniaReingresada)){
            System.out.println("Se ha logueado correctamente!");
        }else{
            System.out.println("Datos invalidos");
        }
 
            
    }

}
