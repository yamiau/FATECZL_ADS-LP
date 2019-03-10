package prj_lt01seq;

/********************************************
Objetivo:       vigésimo-sétimo programa do lote
Programador:    Murillo Meira
Data:           14/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstDec27 {
    public static void main(String args[])
    {
        double vol, ext, dur, vm;
        
        vol     = Double.parseDouble(JOptionPane.showInputDialog("Número de voltas"));
        ext     = Double.parseDouble(JOptionPane.showInputDialog("Extensão do circuito (m)"));
        ext     = (ext / 1000);
        dur     = Double.parseDouble(JOptionPane.showInputDialog("Duração da corrida (min)"));
        dur     = (dur / 60);
        vm      = ( ((vol * ext) / dur));
        
        JOptionPane.showMessageDialog(null, "Velocidade Média = " + vm + " km/h");
    }
}
