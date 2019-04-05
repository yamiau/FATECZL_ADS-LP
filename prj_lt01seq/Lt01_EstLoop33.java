package prj_lt01seq;

/********************************************
Objetivo:       Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
Programador:    Murillo Meira
Data:           14/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstLoop33 {
    public static void main(String args[])
    {
        int n;
        double i, serie = 0;
        
        n   = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro"));
                
        for (i = 1; i <= n; i++) {
            serie = ( serie + (1 / i) );
        }
        
        JOptionPane.showMessageDialog(null, serie);
    }
}
