package prj_lt01mod;
/********************************************
Objetivo:       Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). 
*               Calcule e mostre a velocidade média em km/h. 
Programador:    Murillo Meira
Data:           07/03/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstDecMod27 {
    public static void main(String args[])
    {
        double vol, ext, dur, vm;
        
        vol     = Double.parseDouble(JOptionPane.showInputDialog("Número de voltas"));
        ext     = Double.parseDouble(JOptionPane.showInputDialog("Extensão do circuito (m)"));
        dur     = Double.parseDouble(JOptionPane.showInputDialog("Duração da corrida (min)"));

        vm_kmh(vol, ext, dur);
    }
    
    static void vm_kmh(double vol, double ext, double dur)
    {
        ext     = (ext / 1000);
        dur     = (dur / 60);
        double vm      = ( ((vol * ext) / dur));
        JOptionPane.showMessageDialog(null, "Velocidade Média = " + vm + " km/h");
    }
}
