package prj_lt01mod;

/********************************************
Objetivo:       décimo-sétimo programa do lote
Programador:    Murillo Meira
Data:           14/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstSeqMod17 {
    public static void main(String args[])
    {
        double lit, tempo, vm, dist;
        
        tempo   = Double.parseDouble(JOptionPane.showInputDialog("Duração da viagem (horas)"));
        vm      = Double.parseDouble(JOptionPane.showInputDialog("Velocidade média (km/h)"));
        
        liters(vm, tempo);
    }
    
    static void liters(double vm, double tempo)
    {
        double dist    = (vm / tempo);
        double lit     = (dist / 12);
        
        JOptionPane.showMessageDialog(null, "Litros gastos na viagem: " + lit);
    }
}
