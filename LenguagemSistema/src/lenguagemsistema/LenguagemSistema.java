/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lenguagemsistema;

import java.util.Locale;

/**
 *
 * @author rrych
 */
public class LenguagemSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale local = Locale.getDefault();
        System.out.print("O seu sistema está em ");
        System.out.println(local.getDisplayLanguage(local));
    }
    
}
