package prj_lt01seq;

/********************************************
Objetivo:       Receba 100 números inteiros reais. 
*               Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos. 
Programador:    Murillo Meira
Data:           14/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstLoop38 {
    public static void main(String args[])
    {
        int input, min = 0, max = 0;
        
        for (int i = 0; i < 100; i++ ){
            input   = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor (#" + (i+1) + ")"));
            
            if (i == 0) {
                min = input;
                max = input;
                
            } else {
                if (input < min){
                    min = input;
                } else if (input > max){
                    max = input; 
                }
            }
        } 
        
        JOptionPane.showMessageDialog(null, "Menor valor: " + min + ". Maior valor: " + max);
        
        }
    }
