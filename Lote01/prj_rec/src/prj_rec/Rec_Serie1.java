package prj_rec;

/********************************************
Objetivo:       Serie 1 = (1+2+3+...+100)
Programador:    Murillo Meira
Data:           24/03/2019
*********************************************/

import javax.swing.JOptionPane;

public class Rec_Serie1 {
    public static void main(String args[]){
        
        int init = 1;

        JOptionPane.showMessageDialog(null, fserie1(init));
    }
    
    static int fserie1(int n){
        
        int serie = 0;
        
        if (n <= 100){
            serie = n + fserie1(n+1);
        }
        return serie;
    }
}
