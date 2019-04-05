package prj_lt01seq;

/********************************************
Objetivo:       Receba os valores do comprimento, largura e altura de um paralelepípedo. 
*               Calcule e mostre seu volume. 
Programador:    Murillo Meira
Data:           07/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstSeq07 {
    public static void main(String args[])
    {
        int c, a, l, v;
        
        c = Integer.parseInt(JOptionPane.showInputDialog("Comprimento do paralelepído"));
        a = Integer.parseInt(JOptionPane.showInputDialog("Altura do paralelepído"));
        l = Integer.parseInt(JOptionPane.showInputDialog("Largura do paralelepído"));
        v = (c* a * l);
        
        JOptionPane.showMessageDialog(null, "Volume: " + v);
    } 
}