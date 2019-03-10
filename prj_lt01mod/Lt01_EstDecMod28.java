package prj_lt01mod;

/********************************************
Objetivo:       vigésimo-oitavo programa do lote
Programador:    Murillo Meira
Data:           07/03/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstDecMod28 {
    public static void main(String args[])
    {
        double precoa, vmensal, precon;
        
        precoa  = Double.parseDouble(JOptionPane.showInputDialog("Insira o preço atual do produto"));
        vmensal = Double.parseDouble(JOptionPane.showInputDialog("Quantas unidades foram vendidas no mês?"));
        
        reajuste_preco(precoa, vmensal);
    }

    static void reajuste_preco(double precoa, double vmensal)
    {
        double precon = 0;
        
        if ( (precoa < 30) && (vmensal < 500) ) {
            precon = (precoa * 1.1);
            JOptionPane.showMessageDialog(null, "Preço reajustado em 110%: R$ " + precon);
        }   else if ( ((precoa < 80) && (precoa >= 30)) && ((vmensal < 1000) && (vmensal >= 500)) ) {
                precon = (precoa * 1.15);
                JOptionPane.showMessageDialog(null, "Preço reajustado em 115%: R$ " + precon);
        }   else if ( (precoa >= 80) && (vmensal >= 1000) ) {
                precon = (precoa * 0.95);
                JOptionPane.showMessageDialog(null, "Preço reajustado em 95%: R$ " + precon);
        }   else {
                JOptionPane.showMessageDialog(null, "O preço não será reajustado. Preço: R$ " + precoa);
        }
            
         
        
    }
}
