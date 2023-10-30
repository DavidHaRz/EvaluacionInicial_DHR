/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacióninicial;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        double resultado;
        
        try {
        System.out.println("Introduce 2 números:");
        System.out.print("Número 1: ");
        n1 = sc.nextInt();
        System.out.print("Número 2: ");
        n2 = sc.nextInt();
        
        resultado = (double) n1 / n2;
        
        System.out.println("El resultado es: " + resultado);
        } catch (java.util.InputMismatchException e){
            System.out.println("No se ha podido realizar la operación");
        } /*catch (java.lang.ArithmeticException ex){
            System.out.println("El cero no es un número válido");
            
            do{
                System.out.println("Introduce de nuevo el número 2: ");
            n2 = sc.nextInt();
            }while (n2 == 0);
            
            resultado = n1 / n2;
        }*/
    }
    
}
