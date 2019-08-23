package prj_rec;

/********************************************
Objetivo:       Serie 5 = (N)! + (N-1)! + (N-2)! + ... + (1)!
Programador:    Murillo Meira
Data:           24/03/2019
*********************************************/

import javax.swing.JOptionPane;

public class Rec_Serie5 {
    public static void main(String args[]){
        
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Insira um inteiro positivo N e receba a somatória dos fatoriais entre 1 e N"));
        
        JOptionPane.showMessageDialog(null, fserie5sum(num));
    }
    
    static int fserie5sum(int n){ 
        
        if (n > 1){
            return fserie5fat(n) + fserie5sum(n-1); 
        } else {
            return n;
        }
    }
    
    static int fserie5fat(int n){
          
        if (n > 1){
            return n * fserie5fat(n-1);
        } else {
            return n;
        }
    } 

}



