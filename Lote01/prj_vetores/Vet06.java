package prj_vetores;

/********************************************
Objetivo:   Criar e coletar em um vetor [20] com números aleatórios. Classificar este vetor em ordem
            crescente e mostre os dados.
Programador:    Murillo Meira
Data:           22/03/2019
*********************************************/

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Vet06 {
    public static void main(String args[]){
        
        int[] vec = new int[20];
        
        vec = carregar(vec);
        classificar(vec);
        System.out.println(Arrays.toString(vec));
    }
    
    static int[] carregar(int[] vec){
        for (int i = 0; i < vec.length; i++){
            vec[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira no vetor o valor #" + (i+1)));
        }
        
        return vec;
    }
    
    static void classificar(int[] vec){
        int x = 0;
        
        for (int i = 0; i < (vec.length-1); i++){
            for (int j = (i + 1); j < vec.length; j++){
                if (vec[i] > vec[j]){
                    x = vec[i];
                    vec[i]= vec[j];
                    vec[j] = x;
                }
            }
        }
    }
}
