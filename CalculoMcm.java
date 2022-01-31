/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculomcm;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Paula
 */
public class CalculoMcm {
          
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
       
        int num1 = 0;
        int num2 = 0;
        
        String error = "Por favor, ejecuta de nuevo la aplicación e introduce un número entero.";
        
        try {
            System.out.println("Por favor, indica el primer número");
            num1 = scan.nextInt();            
        } catch (InputMismatchException e) {                        
            System.out.println(error);
            System.exit(0);
        }
        
        if (num1 != 0) {
            try {       
                System.out.println("Por favor, indica el segundo número");
                num2 = scan.nextInt();
            } catch (InputMismatchException e) {                        
                System.out.println(error);    
                System.exit(0);
            }
        } else {
            System.out.println(error);    
            System.exit(0);
        }

        
        if (num2 != 0) {            
            MinimoComunMultiplo mcm = new MinimoComunMultiplo();            
            int resultado = mcm.Calcular(num1, num2);  
            
            System.out.println("El Minimo Comun Multiplo de " + num1 + " y de " + num2 + " es " + resultado + ".");
        
        } else {
            System.out.println(error);    
            System.exit(0);        
        }

        
    }
    
}
