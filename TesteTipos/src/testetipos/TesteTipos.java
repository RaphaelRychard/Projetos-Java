/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testetipos;

/**
 *
 * @author rrych
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    
//    public static void main(String[] args) {
//        
//        // recebe valor
//        int idade = 30;
//        
//        // conver de int para string
//        String valor = Integer.toString(idade);
//        
//        // exibe valor
//        System.out.println(valor);
//    }
    
    
    public static void main(String[] args) {
        // RECEBE VALOR EM STRING
        String valor = "30.5";
        
        // CONVERTE DE STRING PARA VALOR FLUTUANTE 
        float idade = Float.parseFloat(valor);
        
        // EXIBI IDADE EM NUMEROS FLUTUANTE
        System.out.println(idade);
        
    }
    
}
