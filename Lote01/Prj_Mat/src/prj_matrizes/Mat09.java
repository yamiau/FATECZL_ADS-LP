package prj_matrizes;

/********************************************
Objetivo:       Criar e carregar uma matriz [4][4] com valores aleatórios, sendo que a diagonal principal terá seus dados carregados no programa segundo: 
Programador:    Murillo Meira
Data:           25/03/2019
*********************************************/

import javax.swing.JOptionPane;

public class Mat09 {
    public static void main(String args[]){
        
        int[][] mat = new int[4][4];
        
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[0].length; j++){
                if (i == j){
                    mat[i][j] = i * j;
                } else {
                    mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Insira um número na matriz"));
                }
            }
        }
        
    } 
}
