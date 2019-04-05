package prj_lt01seq;

/********************************************
Objetivo:       Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. 
*               Receber o tempo de percurso e a velocidade média. 
Programador:    Murillo Meira
Data:           07/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstSeq17 {
    public static void main(String args[])
    {
        double lit, tempo, vm, dist;
        
        tempo   = Double.parseDouble(JOptionPane.showInputDialog("Duração da viagem (horas)"));
        vm      = Double.parseDouble(JOptionPane.showInputDialog("Velocidade média (km/h)"));
        dist    = (vm / tempo);
        lit     = (dist / 12);
        
        JOptionPane.showMessageDialog(null, "Litros gastos na viagem: " + lit);
    }
}
