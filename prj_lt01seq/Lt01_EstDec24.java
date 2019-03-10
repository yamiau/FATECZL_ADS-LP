package prj_lt01seq;

/********************************************
Objetivo:       vigésimo-quarto programa do lote
Programador:    Murillo Meira
Data:           07/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstDec24 {
    public static void main(String args[])
    {
        int x;
        boolean bin, tern;
        
        x       = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
        bin     = ((x % 2) == 0);
        tern    = ((x % 3) == 0);
        
         if ( (bin == true) & (tern == true) ) {
             JOptionPane.showMessageDialog(null, x + " é divisível por 2 e 3.");
        }   else if (bin == true) {
            JOptionPane.showMessageDialog(null, x + " é divisível por 2.");
        }   else if (tern == true) {
            JOptionPane.showMessageDialog(null, x + " é divisível por 3.");
        }   else {
            JOptionPane.showMessageDialog(null, x + " não é divisível por 2 nem 3.");
        }
    }
}
