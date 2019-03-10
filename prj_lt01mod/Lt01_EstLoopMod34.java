package prj_lt01mod;

/********************************************
Objetivo:       trigésimo-quarto programa do lote
Programador:    Murillo Meira
Data:           10/03/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstLoopMod34 {
    public static void main(String args[])
    {
        int n;  
        n   = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro e receba sua tabuada"));
        
        tabuada(n);
    }            
    
    static void tabuada(int n)
    {
        for (int i = 1; i < 11; i++) {
            System.out.println(n + "x" + i + " = " + (n * i));
        }
    }
}
