package prj_lt01seq;

/********************************************
Objetivo:       vigésimo-terceiro programa do lote
Programador:    Murillo Meira
Data:           07/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstDec23 {
    public static void main(String args[])
    {
        int n1, n2, n3, nx;
        
        n1  = Integer.parseInt(JOptionPane.showInputDialog("Primeiro valor"));
        n2  = Integer.parseInt(JOptionPane.showInputDialog("Segundo valor"));
        n3  = Integer.parseInt(JOptionPane.showInputDialog("Terceiro valor"));
        nx  = Integer.parseInt(JOptionPane.showInputDialog("Quarto valor"));
        
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
