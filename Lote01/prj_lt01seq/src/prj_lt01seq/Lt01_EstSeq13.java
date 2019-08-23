package prj_lt01seq;

/********************************************
Objetivo:       Receba a quantidade de alimento em quilos. 
*               Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
Programador:    Murillo Meira
Data:           07/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstSeq13 {
    public static void main(String args[])
    { 
        int q;
        
        q = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de alimento em kg"));
        
        JOptionPane.showMessageDialog(null, q + " kg de alimentos durará " + (q / 0.05) + " dias" );
    }
}
