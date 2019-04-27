package prj_lt01seq;

/********************************************
Objetivo:       Receba a hora de início e de final de um jogo (HH,MM), calcular o tempo do jogo em horas e minutos, sabendo que o tempo máximo é menor que 24 horas e pode começar num dia e terminar noutro. 
Programador:    Murillo Meira
Data:           07/02/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstDec25 {
    public static void main(String args[])
    {
        int HI, MI, HF, MF, HT, MT;
        
        HI  = Integer.parseInt(JOptionPane.showInputDialog("Horas iniciais"));
        MI  = Integer.parseInt(JOptionPane.showInputDialog("Minutos iniciais"));
        HF  = Integer.parseInt(JOptionPane.showInputDialog("Horas finais"));
        MF  = Integer.parseInt(JOptionPane.showInputDialog("Minutos finais"));
        
        if (HF < HI) { 
            HT = (HF + 24 - HI);
        } else {
            HT = (HF - HI);
        }
        
        if (MF < MI) {
            MT = (MF + 60 - MI);
            if (HF == HI) {
                HT = 23;
            } else {
                HT = (HT - 1);
            } 
        } else { 
            MT = (MF - MI);
        }
        
        JOptionPane.showMessageDialog(null, "Duração do jogo: " + HT + "h:" + MT + "m");
    }
}
