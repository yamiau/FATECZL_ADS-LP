package prj_lt01seq;

/********************************************
Objetivo:       Calcule e mostre o quadrado dos números entre 10 e 150.
Programador:    Murillo Meira
Data:           10/03/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstLoop31 {
    public static void main(String args[])
    {
        int n, x;
        int quads[] = new int[140];
        
        x = 0;
        
        for (n = 10; n < 150; n++) {
            quads[x] = (n * n);
            x++;
        }
        
        for (x = 0; x < 140; x++) {
            System.out.println(quads[x]);
        }
    }
}
