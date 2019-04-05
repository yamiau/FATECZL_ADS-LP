package prj_lt01seq;

/********************************************
Objetivo:       Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor. 
Programador:    Murillo Meira
Data:           07/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstDec26 {
    public static void main(String args[])
    {
        int x, y;
        
        x   = Integer.parseInt(JOptionPane.showInputDialog("Primeiro inteiro = ?"));
        y   = Integer.parseInt(JOptionPane.showInputDialog("Segundo inteiro = ?"));
        
        if (x > y) {
            int z = x;
            x = y;
            y = z;
        }
        
        if ( ((y % x) ==0) == true ) { 
            JOptionPane.showMessageDialog(null, y + " é múltiplo de " + x);
        }   else {
            JOptionPane.showMessageDialog(null, y + " não é múltiplo de " + x);
        }
    }
}
