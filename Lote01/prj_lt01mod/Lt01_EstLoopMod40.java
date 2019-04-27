package prj_lt01mod;

/********************************************
Objetivo:       Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles. 
Programador:    Murillo Meira
Data:           10/03/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstLoopMod40 {
    public static void main(String args[])
    {
        int n1, n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número"));
        
        sort(n1, n2);
        primos_entre(n1, n2);
    }
    
    static void sort(int n1, int n2)
    {        
        if (n1 > n2) {
            int z = n1;
            n1 = n2;
            n2 = z;
        }
    }

    static void primos_entre(int n1, int n2)
    {    
        int i = 0, z = 0, fator = 0;
        
        System.out.println("Números primos entre " + n1 + " e " + n2 + " :");
        
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
