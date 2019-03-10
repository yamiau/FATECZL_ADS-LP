package prj_lt01seq;

/********************************************
Objetivo:       quadragésimo-quarto programa do lote
Programador:    Murillo Meira
Data:           19/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstLoop44 {
    public static void main(String args[])
    {
        double b, e, p, i = 2;
        
        b = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da Base"));
        e = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do Expoente"));
        p = b;
        
        if (e == 0) {
            JOptionPane.showMessageDialog(null, 1);
        }   else if (Math.abs(e) == 1) {
                if (e < 0) {
                    JOptionPane.showMessageDialog(null, (1/b) );
                } else {
                    JOptionPane.showMessageDialog(null, b);
                  }   
            }   else {
                if (e < 0) { 
                    for (i = 2; i >= e; i--) {
                        p *= b;
                    }   
                    JOptionPane.showMessageDialog(null, (1/p) );
                }   else { 
                        for (i = 2; i <= e; i++) {
                            p *= b;
                        }   
                        JOptionPane.showMessageDialog(null, p );
                        }
                }   
    } 
}