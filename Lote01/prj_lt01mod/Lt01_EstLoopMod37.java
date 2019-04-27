package prj_lt01mod;

/********************************************
Objetivo:       Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo. 
Programador:    Murillo Meira
Data:           10/03/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstLoopMod37 {
    public static void main(String args[])
    {
        int n;
        
        n   = Integer.parseInt(JOptionPane.showInputDialog("Insira o Nésimo termo e receba a série Fibonacci"));
        
        fibonacci(n);
    }

    static void fibonacci(int n)
    {    
        int f, f0, f1;
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
