package prj_lt01mod;

/********************************************
Objetivo:       Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. 
*               Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre. 
Programador:    Murillo Meira
Data:           07/03/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstDecMod20 {
    public static void main(String args[])
    {
        int A, B, C, D;
        
        A = Integer.parseInt(JOptionPane.showInputDialog("Coeficiente A"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Coeficiente B"));
        C = Integer.parseInt(JOptionPane.showInputDialog("Coeficiente C"));
        D = ((B * B)-(4 * A * C));
        
        raizes(D, A, B);
    }
    
    static void raizes(int D, int A, int B)
    {
        if (D < 0) {
            JOptionPane.showMessageDialog(null, "A equação não possui raízes reais!");
        } else {
           double x1 = ( ((-1 * B)+(Math.pow(D,0.5))) / (2 * A) );
           double x2 = ( ((-1 * B)-(Math.pow(D,0.5))) / (2 * A) );
            JOptionPane.showMessageDialog(null, "x1 = " + x1 + "; x2 = " + x2);
        }
    }
}
