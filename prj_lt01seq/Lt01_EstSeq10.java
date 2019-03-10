package prj_lt01seq;

/********************************************
Objetivo:       décimo programa do lote
Programador:    Murillo Meira
Data:           07/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstSeq10 {
    public static void main(String args[])
    {
        double x, y, z;
        
        x = Double.parseDouble(JOptionPane.showInputDialog("Primeiro real"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Segundo real"));
        z = (Math.abs(x - y));
        
        JOptionPane.showMessageDialog(null, "Diferença entre os reais: " + z);
    }
}
