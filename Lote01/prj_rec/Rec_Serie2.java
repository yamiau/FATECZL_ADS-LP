package prj_rec;

/********************************************
Objetivo:       Serie 2 = (N) + (N-1) + (N-2) + ... + (1) )
Programador:    Murillo Meira
Data:           24/03/2019
*********************************************/

import javax.swing.JOptionPane;

public class Rec_Serie2 {
    public static void main(String args[]){
        
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Insira um inteiro positivo N"));

        JOptionPane.showMessageDialog(null, fserie2(num));
    }
    
    static int fserie2(int n){
        
        int serie = n;
        
        return n > 1? serie + fserie2(n-1) : n;
    }
}
