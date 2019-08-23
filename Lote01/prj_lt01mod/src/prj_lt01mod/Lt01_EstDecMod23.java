package prj_lt01mod;

/********************************************
Objetivo:       Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente 
Programador:    Murillo Meira
Data:           07/03/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstDecMod23 {
    public static void main(String args[])
    {
        int n1, n2, n3, nx;
        
        n1  = Integer.parseInt(JOptionPane.showInputDialog("Primeiro valor"));
        n2  = Integer.parseInt(JOptionPane.showInputDialog("Segundo valor"));
        n3  = Integer.parseInt(JOptionPane.showInputDialog("Terceiro valor"));
        nx  = Integer.parseInt(JOptionPane.showInputDialog("Quarto valor"));
        
        ordem(n1, n2, n3, nx);
    }

    static void ordem(int n1, int n2, int n3, int nx)
    {
        if (nx < n1) {
            JOptionPane.showMessageDialog(null, "Ordem crescente: " + nx + "/" + n1 + "/" + n2 + "/" + n3);
        }   else if (nx > n3) {
            JOptionPane.showMessageDialog(null, "Ordem crescente: " + n1 + "/" + n2 + "/" + n3 +  "/" + nx);
        }   else if ((nx >= n1) & (nx <= n2)) {
            JOptionPane.showMessageDialog(null, "Ordem crescente: " + n1 + "/" + nx + "/" + n2 + "/" + n3);
        }   else {
            JOptionPane.showMessageDialog(null, "Ordem crescente: " + n1 + "/" + n2 + "/" + nx + "/" + n3);
        }
    }
}
