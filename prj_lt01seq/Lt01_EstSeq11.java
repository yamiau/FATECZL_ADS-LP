package prj_lt01seq;

/********************************************
Objetivo:       Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência. 
Programador:    Murillo Meira
Data:           07/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstSeq11 {
    public static void main(String args[])
    { 
        double r, c;
        
        r = Double.parseDouble(JOptionPane.showInputDialog("Raio da circunferência"));
        c = ( r * 3 * 3.14);
        
        JOptionPane.showMessageDialog(null, "Comprimento da circunferência: " + c);
    }
}
