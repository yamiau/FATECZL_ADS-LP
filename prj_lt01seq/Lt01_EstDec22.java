package prj_lt01seq;

/********************************************
Objetivo:       Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente. 
Programador:    Murillo Meira
Data:           07/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstDec22 {
    public static void main(String args[])
    {
        int a, b;
        
        a   = Integer.parseInt(JOptionPane.showInputDialog("Primeiro valor"));
        b   = Integer.parseInt(JOptionPane.showInputDialog("Segundo valor"));
        
        if (a > b) { 
            JOptionPane.showMessageDialog(null, "Ordem crescente: " + b + "; " + a + ".");
        }   else {
            JOptionPane.showMessageDialog(null, "Ordem crescente: " + a + " ; " + b + ".");
        }
    }
}
