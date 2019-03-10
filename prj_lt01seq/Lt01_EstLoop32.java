package prj_lt01seq;

/********************************************
Objetivo:       trigésimo-segundo programa do lote
Programador:    Murillo Meira
Data:           14/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstLoop32 {
    public static void main(String args[])
    {
        int n, fat, i;
        
        fat = 1;
        n   = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro e receba seu fatorial"));
        
        for (i = 1; i <= n; i++) {
            fat = (fat * i);
        }
        
        JOptionPane.showMessageDialog(null, n + " fatorial = " + fat);
    }
}
