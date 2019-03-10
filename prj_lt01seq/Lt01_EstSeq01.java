package prj_lt01seq;

/********************************************
Objetivo:       primeiro programa pro lote
Programador:    Murillo Meira
Data:           07/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstSeq01 {
    public static void main(String args[])
    {
        double l, A;
        
        l = Double.parseDouble(JOptionPane.showInputDialog("Insira a medida lado do quadrado"));
        A = (l * l);
                
        JOptionPane.showMessageDialog(null, "A Área do quadrado é " + A);               
    }
} 