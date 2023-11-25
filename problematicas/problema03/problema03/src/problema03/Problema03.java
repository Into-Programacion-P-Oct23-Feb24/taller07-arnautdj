/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author santy
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 2;
        int sumador = 3;
        String finalString = "";
        
        do {
            
            finalString = String.format("%s\n%d", finalString, num);
            num = num + sumador;
            sumador = sumador + 2;
            
        } while (num <= 37);
        
        System.out.println(finalString);
    }
    
}
