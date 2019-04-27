package prj_matrizes;

/********************************************
Objetivo:       Criar uma matriz [8][8] onde o programa irá carregar segundo: 
Programador:    Murillo Meira
Data:           25/03/2019
*********************************************/

import javax.swing.JOptionPane;

public class Mat10 {
    public static void main(String args[]){
        
        int[][] mat = new int[8][8];
        int soma = 0;
        double expo = 0;
        
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[0].length; j++){
                expo++;
                mat[i][j] = (int) Math.pow(2, (expo - 1));
                soma += mat[i][j];
            }
        }
        
        JOptionPane.showMessageDialog(null, "Somatória de todas as casas: " + soma);
    } 
}
