package prj_lt01seq;

/********************************************
Objetivo:       Receba o ano de nascimento e o ano atual. 
*               Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
Programador:    Murillo Meira
Data:           07/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstSeq12 {
    public static void main(String args[])
    {
        int a;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Idade atual"));
        JOptionPane.showMessageDialog(null, "Idade daqui a 17 anos: " + (a + 17) );
    }
}
