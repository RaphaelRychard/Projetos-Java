/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fucao001;

/**
 *
 * @author rrych
 */
public class Fatorial {
    
    private int nun = 0;
    private int fat = 0;
    private String formula = "";
    
    public void setValor (int n) {
        nun = n;
        int f = 1;
        
        String s = "";
        for (int c = n; c > 1; c--) {
            f *= c;
            s += c + " x ";
        }
        s += "1 = ";
        fat = f;
        formula = s;
    }
    
    
    public int getFatorial() {
        return fat;
    }
    
    public String getFormula() {
        return formula;
    }
    
}
