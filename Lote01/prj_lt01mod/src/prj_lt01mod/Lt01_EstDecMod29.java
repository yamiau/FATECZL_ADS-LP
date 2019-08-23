package prj_lt01mod;

/********************************************
Objetivo:       Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. 
*               Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. 
*               Demais tipos não serão considerados. 
Programador:    Murillo Meira
Data:           07/03/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstDecMod29 {
    public static void main(String args[])
    {
        double tipo, valor;
        
        tipo    = Double.parseDouble(JOptionPane.showInputDialog("Digite: 1-Poupança ou 2-Renda Fixa"));
            if ( (tipo < 1) || (tipo > 2) ) {
            main(args);
            }
            
        valor   = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do investimento"));
        
        corrigir_valor(tipo, valor);
    }

    static void corrigir_valor(double tipo, double valor)
    {
        double valorcor = 0;
        
        if (tipo == 1) {
            valorcor = (valor * 1.03);
        } else {
            valorcor = (valor * 1.05);
        }
          
        JOptionPane.showMessageDialog(null, "Valor após um mês: R$ " + valorcor);
    }
}
