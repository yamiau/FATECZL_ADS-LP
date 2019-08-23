package prj_lt01seq;

/********************************************
Objetivo:       Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m. 
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