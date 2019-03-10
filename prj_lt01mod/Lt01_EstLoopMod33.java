package prj_lt01mod;

/********************************************
Objetivo:       trigésimo-terceiro programa do lote
Programador:    Murillo Meira
Data:           10/03/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstLoopMod33 {
    public static void main(String args[])
    {
        int n;
    
        n   = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro"));
        
        JOptionPane.showMessageDialog(null, serie(n));
    }

    static double serie(int n)
    {    
        double i, serie = 0;        
        
        for (i = 1; i <= n; i++) {
            serie = ( serie + (1 / i) );
        }
        
        return serie;
    }
}
