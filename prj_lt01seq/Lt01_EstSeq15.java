package prj_lt01seq;

/********************************************
Objetivo:       décimo-quinto programa do lote
Programador:    Murillo Meira
Data:           07/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstSeq15 {
    public static void main(String args[])
    { 
    int b, c;
    double a;
    
    b = Integer.parseInt(JOptionPane.showInputDialog("Cateto 1"));
    c = Integer.parseInt(JOptionPane.showInputDialog("Cateto 2"));
    a = ( (b * b) + (c * c) );
    a = (Math.sqrt(a));
    
    JOptionPane.showMessageDialog(null, "Hipotenusa = " + a); 
            
    } 
}
