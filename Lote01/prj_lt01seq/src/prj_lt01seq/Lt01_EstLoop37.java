package prj_lt01seq;

/********************************************
Objetivo:       Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo. 
Programador:    Murillo Meira
Data:           14/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstLoop37 {
    public static void main(String args[])
    {
        int n, f, f0, f1;
        
        n   = Integer.parseInt(JOptionPane.showInputDialog("Insira o Nésimo termo e receba a série Fibonacci"));
        f0 = 0;
        f1 = 1;
        
        
        
        for (int i = 0; i <= n; i++) {
            f = f0 + f1;
            f1 = f0;
            f0 = f;
            
            System.out.println(f);
        }
    }
}
