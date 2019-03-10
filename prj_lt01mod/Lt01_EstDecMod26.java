package prj_lt01mod;

/********************************************
Objetivo:       vigésimo-sexto programa do lote
Programador:    Murillo Meira
Data:           07/03/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstDecMod26 {
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
        
        multiplicity(x, y);
    }

    public static void multiplicity(int x, int y)
    {
        if ( ((y % x) ==0) == true ) { 
            JOptionPane.showMessageDialog(null, y + " é múltiplo de " + x);
        }   else {
            JOptionPane.showMessageDialog(null, y + " não é múltiplo de " + x);
        }
    }
}
