package prj_lt01seq;

/********************************************
Objetivo:       quadragésimo-terceiro programa do lote
Programador:    Murillo Meira
Data:           17/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstLoop43 {
    public static void main(String args[])
    {
        double A, M;
        int anos = 0;
        
        JOptionPane.showMessageDialog(null, "Ana mede 1.1m e cresce 3cm por ano. Maria mede 1.5m e cresce 2cm por ano.");
        
        A = 1.1;
        M = 1.5;
        
        while (M > A) {
            anos++;
            A += 0.03;
            M += 0.02;
        }
        
        JOptionPane.showMessageDialog(null, "Ana será mais alta que Maria após " + anos + " anos.");
        
    }
    }
