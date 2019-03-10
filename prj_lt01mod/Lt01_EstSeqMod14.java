package prj_lt01mod;

/********************************************
Objetivo:       décimo-quarto programa do lote
Programador:    Murillo Meira
Data:           14/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstSeqMod14 {
    public static void main(String args[])
    { 
        double a, b, c;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Ângulo 1"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Ângulo 2"));
    
        ang3(a, b);
    }    
    
    static void ang3(double a, double b)
    {
        JOptionPane.showMessageDialog(null, "Ângulo 3 = " + (180 - a - b) );
    }
}
