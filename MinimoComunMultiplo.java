/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculomcm;

/**
 *
 * @author Paula
 */
public class MinimoComunMultiplo {
    
    public int Calcular(int num1, int num2)
    {
        
        int multiplo = Math.abs(num1) * Math.abs(num2);
        
        int iterador = multiplo - 1;
        
        while (iterador > 0){
            if (iterador % num1 == 0 && iterador % num2 == 0){
                multiplo = iterador;
            }
            iterador = iterador - 1;
        }
        
        return multiplo;
    }   
    
        public int Calcular(int num1, int num2, int num3)
    {
        int multiplo = Math.abs(num1) * Math.abs(num2) * Math.abs(num3);
        
        int iterador = multiplo - 1;
        
        while (iterador > 0){
            if ((iterador % num1 == 0) && (iterador % num2 == 0) && (iterador % num3 == 0)){
                multiplo = iterador;
            }
            iterador = iterador - 1;
        }
        
        return multiplo;
    }   
}
