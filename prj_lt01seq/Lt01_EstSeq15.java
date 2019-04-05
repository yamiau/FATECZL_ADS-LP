package prj_lt01seq;

/********************************************
Objetivo:       Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa. 
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
