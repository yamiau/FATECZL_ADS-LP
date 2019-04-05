package prj_lt01seq;

/********************************************
Objetivo:       Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N! 
Programador:    Murillo Meira
Data:           14/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstLoop36 {
    public static void main(String args[])
    {
        int n;
        double serie = 0, i = 1, fat = 1;

        n   = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro"));
        
        while (i <= n) {
            fat = (fat * i);
            serie = ( serie + (1 / fat) );
            i++;
        }
        
        JOptionPane.showMessageDialog(null, serie);
    }
}
