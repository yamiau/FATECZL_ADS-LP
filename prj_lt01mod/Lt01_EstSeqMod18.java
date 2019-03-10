package prj_lt01mod;

/********************************************
Objetivo:       décimo-oitavo programa do lote
Programador:    Murillo Meira
Data:           14/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstSeqMod18 {
    public static void main(String args[])
    {
        int x, y;
        
        x   = Integer.parseInt(JOptionPane.showInputDialog("Primeiro valor"));
        y   = Integer.parseInt(JOptionPane.showInputDialog("Segundo valor"));
        
        diff(x, y);
    }
    
    static void diff(int x, int y)
    {
        if (x >= y ) {
            JOptionPane.showMessageDialog(null, "Diferença entre " + x + " e " + y + " : " + (x - y));
        }   else {
            JOptionPane.showMessageDialog(null, "Diferença entre " + y + " e " + x + " : " + (y - x));
        }
    }
}
