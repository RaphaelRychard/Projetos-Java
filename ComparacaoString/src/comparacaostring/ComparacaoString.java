/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author rrych
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           
        String nome1 = "Raphael";
        String nome2 = "Raphael";
        String nome3 = new String ("Raphael");
        String res;
        
        res = (nome1.equals(nome3))? "igual" : "Diferente";
        
        System.out.println(res);
        
    }
    
}
