/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;


import javax.swing.JOptionPane;


/**
 *
 * @author rrych
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Olá Mundo", "Boas Vndas", JOptionPane.ERROR_MESSAGE);
        int n, s = 0, contP = 0, contI = 0, contC = 0, c = 0, m = 0;
        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>infome um número: <em><strong>[VALOR 0 INTERRONPE]</strong></em></html>"));
          
            s+=n;
       
        } while (n != 0);
        
        JOptionPane.showMessageDialog(null, "<html>Resltado Final <hr>"
                + "Total de valores:  " + s
                + "</html>");
    }
    
}
