package prj_lt01mod;

/********************************************
Objetivo:       Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
Programador:    Murillo Meira
Data:           07/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstDecMod24 {
    public static void main(String args[])
    {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
        
        divisibility(x);
    }
    
    static void divisibility(int x)
    {
        boolean bin     = ((x % 2) == 0);
        boolean tern    = ((x % 3) == 0);
        
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
