package prj_lt01mod;

/********************************************
Objetivo:       Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N! 
Programador:    Murillo Meira
Data:           10/03/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstLoopMod36 {
    public static void main(String args[])
    {
        int n;

        n   = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro"));
        
        serie_fat(n);
    }    
    
    static void serie_fat(int n)
    {
        double serie = 0, i = 1, fat = 1;
        
        while (i <= n) {
            fat = (fat * i);
            serie = ( serie + (1 / fat) );
            i++;
        }
        
        JOptionPane.showMessageDialog(null, serie);
    }
}
