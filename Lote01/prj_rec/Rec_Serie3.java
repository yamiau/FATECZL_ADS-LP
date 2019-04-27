package prj_rec;

/********************************************
Objetivo:       Serie 3 = (1/1) + (1/2) + (1/3) + ....+ (1/N) 
Programador:    Murillo Meira
Data:           24/03/2019
*********************************************/

import javax.swing.JOptionPane;

public class Rec_Serie3 {
    public static void main(String args[]){
        
        double num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Insira um inteiro positivo N"));

        JOptionPane.showMessageDialog(null, fserie3(num));
    }
    
    static double fserie3(double n){
        
        double serie = 1/n;
        
        if (n >= 1){
            serie += fserie3(n-1); 
            return serie;
        } else {
            return n;
        }
        
    }
}
