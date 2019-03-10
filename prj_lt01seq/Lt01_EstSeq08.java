package prj_lt01seq;

/********************************************
Objetivo:       oitavo programa do lote
Programador:    Murillo Meira
Data:           07/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstSeq08 {
    public static void main(String args[])
    {
    double p, px;
    
    p = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do depósito em poupança a ser realizado"));
    px = (p * 1.013);
    
    JOptionPane.showMessageDialog(null, "Em um mês o valor será: " + px);
    }
}