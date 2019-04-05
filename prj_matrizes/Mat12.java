package prj_matrizes;

/********************************************
Objetivo:       Carregar códigos das peças em um tabuleiro de xadrez, onde:
Programador:    Murillo Meira
Data:           26/03/2019
*********************************************/

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Mat12 {
    public static void main(String args[]){
        
        int[][] tab = new int[8][8];
        int[] contagem = new int[7];
        
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                tab[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Preencha a casa L" + (i+1) + "C" + (j+1) + " do tabuleiro:\n" + " 0-Vazia\n 1-Peão\n 2-Torre\n 3-Bispo\n 4-Cavalo\n 5-Rainha\n 6-Rei"));
                if ( (tab[i][j] <1 ) || (tab[i][j] > 6) ){
                    tab[i][j] = 0;
                }
                contagem[tab[i][j]]++;
            }
        }
        
        System.out.println(Arrays.toString(contagem));
    }
}