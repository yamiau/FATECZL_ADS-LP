package prj_rec;

/********************************************
Objetivo:       Serie 4 = (N/1) +(N-1 / 2 ) + (N-2 / 3) + .... + (1/N)
Programador:    Murillo Meira
Data:           24/03/2019
*********************************************/

import javax.swing.JOptionPane;

public class Rec_Serie4 {
    public static void main(String args[]){
        
        double num, div;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Insira um inteiro positivo N"));
        div = 1;
        
        JOptionPane.showMessageDialog(null, fserie4(num, div));
    }
    
    static double fserie4(double n, double div){
        
        double serie = n/div;
        
        if (n >= 1){
            return serie + fserie4(n-1, div+1); 
        } else {
            return n;
        }
    }   
}
