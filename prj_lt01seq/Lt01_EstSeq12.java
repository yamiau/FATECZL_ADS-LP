package prj_lt01seq;

/********************************************
Objetivo:       décimo-segundo programa do lote
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
