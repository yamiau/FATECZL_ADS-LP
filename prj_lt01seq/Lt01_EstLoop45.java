package prj_lt01seq;

/********************************************
Objetivo:       quadragésimo-quinto programa do lote
Programador:    Murillo Meira
Data:           19/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstLoop45 {
    public static void main(String args[])
    {
        double x, y, z;
        
        x = 1;
        y = 0;
        z = 1;
        
        for (x = 1; x < 16; x++) {
            y += ( z * ( x /(x*x) ) );
            z *= -1;
            if (z > 0) { 
                System.out.println(y + "+" + z);    
            }   else {
                    System.out.println(y + " " + z);   
                }
            
        }
    }
}
