/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacióninicial;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class cliente {
    int id_cliente;
        String nombre, direccion, telefono;

    
    void pedirDatos(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el ID del cliente: ");
        id_cliente = sc.nextInt();
        
        System.out.print("Introduce el Nombre del cliente: ");
        nombre = sc.next();
        sc.nextLine();
        
        System.out.print("Introduce la Dirección del cliente: ");
        direccion = sc.nextLine();
        
        System.out.print("Introduce el Teléfono del cliente: ");
        telefono = sc.next();
    }
    
    void guardarDatos(){
        String creaFichero = "./archivos/misClientes.txt";
        File fichero = new File(creaFichero);
        
        if (fichero.exists())
            System.out.println("El fichero ya existe.");
        try (BufferedWriter escritura = new BufferedWriter(new FileWriter(creaFichero))){       //try-with-resources. 
            //se cierra automáticamente al final del bloque sin necesidad de escribir un bloque 'finally'.
            escritura.write(toString());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    @Override
    public String toString() {
        return "Datos del cliente:\nidCliente: " + id_cliente + ", Nombre: " + nombre + ", Direcci\u00f3n: " + direccion + ", Telefono: " + telefono + ".";
    }
    
    
}
