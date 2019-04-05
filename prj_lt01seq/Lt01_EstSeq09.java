package prj_lt01seq;

/********************************************
Objetivo:       Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados. 
Programador:    Murillo Meira
Data:           07/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstSeq09 {
    public static void main(String args [])
    {
        int x, y, z;
                
        x = Integer.parseInt(JOptionPane.showInputDialog("Insira x"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Insira y"));
        z = ( (x * x) + (y * y) );
        
        JOptionPane.showMessageDialog(null, "Soma dos quadrados: " + z);       
    }
}
