/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author rrych
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int nun[] = {2, 4, 12, 5, 8, 0};
        
        Arrays.sort(nun);
        
        for (int valor: nun) {
            System.out.println("O vetor " + valor);
        }
    }
    
}
