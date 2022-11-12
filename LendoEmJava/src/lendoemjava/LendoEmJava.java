/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lendoemjava;

import java.util.Scanner;


/**
 *
 * @author rrych
 */
public class LendoEmJava { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // pega objeto para pegar a nota do aluno
        Scanner teclado = new Scanner(System.in);
        
        //pedindo nome
        System.out.print("Digite o nome do aluno: ");
        String user = teclado.nextLine();
        
        //pedindo nota
        System.out.print("Digite a nota do Aluno: ");
        float nota = teclado.nextFloat();
        
        //exibindo nota formatada 
        System.out.format("\nA nota do %s foi %.2f", user, nota);
        System.out.println(" ");
        
        
    }
    
}
