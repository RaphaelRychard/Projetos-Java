/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros;

import java.util.Scanner;
import javax.xml.transform.Source;

/**
 *
 * @author rrych
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nun, soma = 0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        
        do {
            System.out.print("Digite um número: ");
            nun = teclado.nextInt();
            soma += nun;
            
            System.out.print("Quer Continuar? ");
            resp = teclado.next();
            
        } while (resp.equalsIgnoreCase("S"));
        
        System.out.println("A soma de todos os valores é: " + soma);
    }
    
    
}
