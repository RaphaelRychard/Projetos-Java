/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buscabinaria;

import java.util.Arrays;

/**
 *
 * @author rrych
 */
public class BuscaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Declarando vetor
        int vet[] = {8, 3, 6, 12, 4, 9, 1,  2, 3};
        
        // busca binaria
        int p = Arrays.binarySearch(vet, 3);
        
        // EXIBI VETOR
        for (int v: vet) {
            System.out.println(" " + v);
        }
        
        System.out.println("o valor encontrado na posição: " + p);
    }
    
}
