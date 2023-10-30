/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacióninicial;

/**
 *
 * @author David
 */
public class EvaluaciónInicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        cliente miCliente = new cliente();
        miCliente.pedirDatos();
        String datos = miCliente.toString();
        miCliente.guardarDatos();
        System.out.println(datos);
    }
    
}
