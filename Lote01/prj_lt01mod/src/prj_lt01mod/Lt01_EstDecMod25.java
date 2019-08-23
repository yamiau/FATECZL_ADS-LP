package prj_lt01mod;

/********************************************
Objetivo:       Receba a hora de início e de final de um jogo (HH,MM), calcular o tempo do jogo em horas e minutos, sabendo que o tempo máximo é menor que 24 horas e pode começar num dia e terminar noutro. 
Programador:    Murillo Meira
Data:           07/03/2019
*********************************************/

import javax.swing.JOptionPane;

public class Lt01_EstDecMod25 {
    public static int HI;
    public static int HF;
    public static int MI;
    public static int MF;
    
    public static void main(String args[])
    {
        HI  = Integer.parseInt(JOptionPane.showInputDialog("Horas iniciais"));
        MI  = Integer.parseInt(JOptionPane.showInputDialog("Minutos iniciais"));
        HF  = Integer.parseInt(JOptionPane.showInputDialog("Horas finais"));
        MF  = Integer.parseInt(JOptionPane.showInputDialog("Minutos finais"));
        int HT = (HF - HI);
        int MT = (MF - MI);
        
        hora_calc(HT, MT);
    }

    static void hora_calc(int HT, int MT)
    {    
        if (HT < 0) { 
            HT = (HF + 24 - HI);
        } else {
            HT = (HF - HI);
        }
        
        if (MT < 0) {
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
