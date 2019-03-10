package prj_lt01mod;

/********************************************
Objetivo:       trigésimo-primeiro programa do lote
Programador:    Murillo Meira
Data:           14/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstLoopMod31 {
    public static void main(String args[])
    {
        int n;
        
        for (n = 10; n < 151; n++) {
            System.out.println(quads(n));
        }
    }

    static int quads(int n)
    {
        return (n * n);
    }
}
