/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.sound.midi.Soundbank;

/**
 *
 * @author rrych
 */
public class ResolucaoTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Toolkit resu = Toolkit.getDefaultToolkit();
        Dimension dim = resu.getScreenSize();
        System.out.print("A resolução da ela é: ");
        System.out.print(dim.width);
        System.out.print(" x ");
        System.out.println(dim.height);
    }
    
}
