package prj_lt01seq;

/********************************************
Objetivo:       Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço
Programador:    Murillo Meira
Data:           14/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstDec28 {
    public static void main(String args[])
    {
        double precoa, vmensal, precon;
        
        precoa  = Double.parseDouble(JOptionPane.showInputDialog("Insira o preço atual do produto"));
        vmensal = Double.parseDouble(JOptionPane.showInputDialog("Quantas unidades foram vendidas no mês?"));
        
        if ( (precoa < 30) && (vmensal < 500) ) {
            precon = (precoa * 1.1);
            JOptionPane.showMessageDialog(null, "Preço reajustado: R$ " + precon);
        }   else if ( ((precoa < 80) && (precoa >= 30)) && ((vmensal < 1000) && (vmensal >= 500)) ) {
                precon = (precoa * 1.15);
                JOptionPane.showMessageDialog(null, "Preço reajustado: R$ " + precon);
        }   else if ( (precoa >= 80) && (vmensal >= 1000) ) {
                precon = (precoa * 0.95);
                JOptionPane.showMessageDialog(null, "Preço reajustado: R$ " + precon);
        }   else {
                JOptionPane.showMessageDialog(null, "O preço não será reajustado. Preço: R$ " + precoa);
        }
            
         
        
    }
}
