package prj_lt01seq;

/********************************************
Objetivo:       Receba um número. Calcule e mostre os resultados da tabuada desse número. 
Programador:    Murillo Meira
Data:           14/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstLoop34 {
    public static void main(String args[])
    {
        int n, i;
                
        n   = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro e receba sua tabuada"));
                
        for (i = 1; i < 11; i++) {
            System.out.println(n + "x" + i + " = " + (n * i));
        }
    }
}
