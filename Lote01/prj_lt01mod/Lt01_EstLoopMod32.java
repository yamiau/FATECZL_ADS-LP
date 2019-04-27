package prj_lt01mod;

/********************************************
Objetivo:       Receba um número inteiro. Calcule e mostre o seu fatorial. 
Programador:    Murillo Meira
Data:           10/03/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstLoopMod32 {
    public static void main(String args[])
    {
        int n;
        
        n   = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro e receba seu fatorial"));
        
        JOptionPane.showMessageDialog(null, n + " fatorial = " + fat(n));
    }
    
    static int fat(int n)
    {
        int fat = 1, i = 1;
        
        for (i = 1; i <= n; i++) {
            fat = (fat * i);
        }
        
        return fat;
    }
}
