package prj_lt01mod;

/********************************************
Objetivo:       Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99. 
Programador:    Murillo Meira
Data:           17/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstLoop42 {
    public static void main(String args[])
    {
        int i, j;
        
        i = 1;
        j = i;
        
        for (i = 1; i < 51; i++) {
            System.out.println( i + "/" + j + "+");
            j += 2;
        }
    }
    }
