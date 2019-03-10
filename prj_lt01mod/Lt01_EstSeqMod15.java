package prj_lt01mod;

/********************************************
Objetivo:       décimo-quinto programa do lote
Programador:    Murillo Meira
Data:           14/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstSeqMod15 {
    public static void main(String args[])
    { 
    int b, c;
    
    b = Integer.parseInt(JOptionPane.showInputDialog("Cateto 1"));
    c = Integer.parseInt(JOptionPane.showInputDialog("Cateto 2"));
    
    hipo_calc(b, c);
    }
    
    static void hipo_calc(int b, int c)
    {
    double a = ( (b * b) + (c * c) );
    a = (Math.sqrt(a));
    
    JOptionPane.showMessageDialog(null, "Hipotenusa = " + (int)a); 
            
    } 
}
