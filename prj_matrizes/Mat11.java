package prj_matrizes;

/********************************************
Objetivo:       Criar uma matriz [8][8] inteiro e o programa irá carregar segundo: 
Programador:    Murillo Meira
Data:           25/03/2019
*********************************************/

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Mat11 {
    public static void main(String args[]){
        
        int[][] mat = new int[8][8];
        
        for (int k = 1; k <= 4; k++){
            for (int i = 0; i < mat.length; i++){
                for (int j = 0; j < mat[0].length; j++){
                    mat[i][j] = k;
                }
            }
        }
    } 
}
