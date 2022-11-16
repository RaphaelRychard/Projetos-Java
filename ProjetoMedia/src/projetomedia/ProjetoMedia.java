/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetomedia;

import java.util.Scanner;

/**
 *
 * @author rrych
 */
public class ProjetoMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // OBEJTO PARA ESNNAER DO TECLADO
        Scanner teclado = new Scanner(System.in);
        
        // NOTAS
        System.out.print("Digite sua primeria nota: ");
        float n1 = teclado.nextFloat();
        
        System.out.print("Digite a sua segunda nota: ");
        float n2 = teclado.nextFloat();
        
        // MEDIA
        float media = (n1 + n2) / 2;
        
        System.out.format("\nA media e %.2f", media);
        System.out.println(" ");
        
        if (media > 9) {
            System.out.println("Pareabens");
        }
        
        
    }
    
}
