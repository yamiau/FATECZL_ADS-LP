package prj_lt01mod;

/********************************************
Objetivo:       Receba 4 notas bimestrais de um aluno. 
*               Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média
Programador:    Murillo Meira
Data:           07/03/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstDecMod21 {
    public static void main(String args[])
    {
        double n1, n2, n3, n4, md;
        
        n1  = Double.parseDouble(JOptionPane.showInputDialog("Nota bimestral 1"));
        n2  = Double.parseDouble(JOptionPane.showInputDialog("Nota bimestral 2"));
        n3  = Double.parseDouble(JOptionPane.showInputDialog("Nota bimestral 3"));
        n4  = Double.parseDouble(JOptionPane.showInputDialog("Nota bimestral 4"));
        md  = ( ( n1 + n2 + n3 + n4) / 4 );
        
        result(md);
    }

    static void result(double md)
    {        
        if (md >= 6.0) { 
        JOptionPane.showMessageDialog(null, "Aluno aprovado! Com média " + md);
        }   else if ( (md >= 3.0) & (md < 6.0) ) {
            JOptionPane.showMessageDialog(null, "Aluno em exame! Com média " + md);
            }   else if (md < 3.0) {
                JOptionPane.showMessageDialog(null, "Aluno retido! Com média " + md);
            }
    }
}
