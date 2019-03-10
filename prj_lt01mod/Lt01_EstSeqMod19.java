package prj_lt01mod;

/********************************************
Objetivo:       décimo-nono programa do lote
Programador:    Murillo Meira
Data:           14/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstSeqMod19 {
    public static void main(String args[])
    {
        double v1, v2;
        
        v1  = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor"));
        v2  = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor"));
        
        maior(v1, v2);
    }
    
    static void maior(double v1, double v2)
    {
            if (v1 == v2) {
            JOptionPane.showMessageDialog(null, "Os valores são iguais");
        }   else if (v1 > v2) { 
                    JOptionPane.showMessageDialog(null, v1 + " é o maior valor");
            }
            else { 
                    JOptionPane.showMessageDialog(null, v2 + " é o maior valor");
            }    
    }
}