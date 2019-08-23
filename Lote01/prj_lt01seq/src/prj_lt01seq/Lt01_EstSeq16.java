package prj_lt01seq;

/********************************************
Objetivo:       Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. 
*               Calcule o salário que serão as horas trabalhadas x o valor por hora. 
*               Calcule o salário líquido (= Salário Bruto – desconto). 
*               A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber. 
Programador:    Murillo Meira
Data:           07/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstSeq16 {
    public static void main(String args[])
    {
        double horas, valor, desc, deps, salbru, salliq;
        
        horas = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de horas trabalhadas"));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Valor por hora"));
        desc = ( (Double.parseDouble(JOptionPane.showInputDialog("Percentual de desconto"))) / 100 );
        deps = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de dependentes do funcionário"));
        salbru = (horas * valor);
        salliq = ( (salbru - (salbru * desc)) + deps * 100 );
        
        JOptionPane.showMessageDialog(null,"Salário a receber: " + salliq);
    }
}
