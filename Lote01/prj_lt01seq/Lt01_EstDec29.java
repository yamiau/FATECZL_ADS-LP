package prj_lt01seq;

/********************************************
Objetivo:       Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. 
*               Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. 
*               Demais tipos não serão considerados. 
Programador:    Murillo Meira
Data:           14/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstDec29 {
    public static void main(String args[])
    {
        double tipo, valor, valorcor;
        
        tipo    = Double.parseDouble(JOptionPane.showInputDialog("Digite: 1-Poupança ou 2-Renda Fixa"));
            if ( (tipo < 1) || (tipo > 2) ) {
            main(args);
            }
        
        valor   = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do investimento"));
        
        if (tipo == 1) {
            valorcor = (valor * 1.03);
        } else {
            valorcor = (valor * 1.05);
        }
          
        JOptionPane.showMessageDialog(null, "Valor após um mês: R$ " + valorcor);
    }
}
