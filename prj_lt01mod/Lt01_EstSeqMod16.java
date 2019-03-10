package prj_lt01mod;

/********************************************
Objetivo:       décimo-sexto programa do lote
Programador:    Murillo Meira
Data:           14/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstSeqMod16 {
    public static void main(String args[])
    {
        double horas, valor, desc, deps, salbru, salliq;
        
        horas = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de horas trabalhadas"));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Valor por hora"));
        desc = ( (Double.parseDouble(JOptionPane.showInputDialog("Percentual de desconto"))) / 100 );
        deps = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de dependentes do funcionário"));
        
        sal_calc(horas, valor, desc, deps);
    }
    
    static void sal_calc(double horas, double valor, double desc, double deps)
    {
        double salBru = (horas * valor);
        double salLiq = ( (salBru - (salBru * desc)) + deps * 100 );
        
        JOptionPane.showMessageDialog(null,"Salário a receber: R$" + salLiq);
    }
}

