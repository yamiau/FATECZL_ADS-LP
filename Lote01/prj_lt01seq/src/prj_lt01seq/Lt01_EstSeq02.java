package prj_lt01seq;

/********************************************
Objetivo:       Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%. 
Programador:    Murillo Meira
Data:           07/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstSeq02 {
    public static void main(String args[])
    {
        double sal, novo;
        
        sal = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do salário atual "));
        novo = (sal * 1.15);
        
        JOptionPane.showMessageDialog(null, "O salário reajustado de 15% é " + novo);
    }
} 
