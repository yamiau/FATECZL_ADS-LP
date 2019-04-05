package prj_lt01seq;

/********************************************
Objetivo:       Receba 2 valores reais. Calcule e mostre o maior deles.
Programador:    Murillo Meira
Data:           07/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstSeq19 {
    public static void main(String args[])
    {
        double v1, v2;
        
        v1  = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor"));
        v2  = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor"));
        
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