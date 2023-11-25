/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author santy
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 2;
        int sumador = 4;
        String finalString = "";
        
        do {
            
            finalString = String.format("%s\n%d", finalString, num);
            num = num + sumador;
            sumador = sumador + 2;
            
        } while (num <= 110);
        
        System.out.println(finalString);
        
    }
    
}
