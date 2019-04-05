package prj_lt01seq;

/********************************************
Objetivo:       Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles. 
Programador:    Murillo Meira
Data:           19/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstLoop40 {
    public static void main(String args[])
    {
        int n1, n2, z, fator = 0, i = 0;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número"));
        z = n1;
        
        if (n1 > n2) {
            n1 = n2;
            n2 = z;
        }
        
        for (i = n1; i <= n2; i++) {
            for (z = 1; z <= (i); z++) {
                if ((i % z) == 0) {
                    fator++;
                }
            }
            
            if (fator == 2) {
                System.out.println(i);
                
            }
            z = 0;
            fator = 0; 
        }
    }
    }
