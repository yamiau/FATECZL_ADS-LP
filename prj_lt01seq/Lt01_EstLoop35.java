package prj_lt01seq;

/********************************************
Objetivo:       trigésimo-quinto programa do lote
Programador:    Murillo Meira
Data:           14/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstLoop35 {
    public static void main(String args[])
    {
        int n, m, soma = 0;
                
        n   = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro"));
        m   = Integer.parseInt(JOptionPane.showInputDialog("Insira outro número inteiro"));
        
        if (n > m) {
            int z = m;
            m = n;
            n = z;
        }
        
        for (int i = n; i <= m; i++) {
            if ((i % 2) != 0){
                soma = soma + i;
            } 
        }
        
        JOptionPane.showMessageDialog(null, "Somatória dos ímpares entre " + n + " e " + m + " : " + soma);
    }
}
