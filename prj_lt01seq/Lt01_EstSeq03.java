package prj_lt01seq;

/********************************************
Objetivo:       terceiro programa do lote
Programador:    Murillo Meira
Data:           07/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstSeq03 {
    public static void main(String args[])
    {
       double b, h, A;
       
       b = Double.parseDouble(JOptionPane.showInputDialog("Base do triângulo"));
       h = Double.parseDouble(JOptionPane.showInputDialog("Altura do triângulo"));
       A = ((b * h) / 2);
       
       JOptionPane.showMessageDialog(null, "Área do triângulo: " + A);
    }
} 