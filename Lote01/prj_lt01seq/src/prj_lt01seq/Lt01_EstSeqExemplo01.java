package prj_lt01seq;

/********************************************
Objetivo:       segundo programa em Java; soma de dois valores
Programador:    Murillo Meira
Data:           07/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstSeqExemplo01 {
    public static void main(String args[])
    {
        int A, B, C;
        
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
            /* Converts the inputed STR to INT */
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
        C = (A + B);
        
        JOptionPane.showMessageDialog(null, "O valor de C é " + C);
        
    }
}
