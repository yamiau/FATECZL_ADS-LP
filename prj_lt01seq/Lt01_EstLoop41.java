package prj_lt01seq;

/********************************************
Objetivo:       Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7. 
Programador:    Murillo Meira
Data:           17/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstLoop41 {
    public static void main(String args[])
    {
        int d1, d2;
        
        for (d1 = 1; d1 < 7; d1++) {
            for (d2 = 1; d2 < 7; d2++) {
                if (d1+d2 == 7) {
                    System.out.println(d1 + " + " + d2 + " = 7");
                }
            }
        }
    }
    }
