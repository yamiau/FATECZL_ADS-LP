package prj_lt01mod;

/********************************************
Objetivo:       trigésimo-quinto programa do lote
Programador:    Murillo Meira
Data:           10/03/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstLoopMod35 {
    public static void main(String args[])
    {
        int n, o;
                
        n   = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro"));
        o   = Integer.parseInt(JOptionPane.showInputDialog("Insira outro número inteiro"));
           
        if (n > o) {
            int z = o;
            o = n;
            n = z;
        }
    
        somatoria_impares(n, o);
    }
    
    static void somatoria_impares(int n, int o)
    {
        int soma = 0;
        
        for (int i = n; i <= o; i++) {
            if ((i % 2) != 0){
                soma = soma + i;
            } 
        }
        
        JOptionPane.showMessageDialog(null, "Somatória dos ímpares entre " + n + " e " + o + " : " + soma);
    }
}
