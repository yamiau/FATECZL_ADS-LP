package prj_vetores;

/********************************************
Objetivo:   Criar e coletar em um vetor [20] inteiro. Calcule e exiba, segundo:
                10
                ∑ (A [1] – A [21–1] )
Programador:    Murillo Meira
Data:           22/03/2019
*********************************************/

import javax.swing.JOptionPane;

public class Vet05 {
    public static void main(String args[]){
        
        int[] vec = new int[20];

        vec = carregar(vec);  
        JOptionPane.showMessageDialog(null, "Resultado da somatória dos valores no vetor: " + somatoria(vec));
    }
    
    static int[] carregar(int[] vec){
        for (int i = 0; i < vec.length; i++){
            vec[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira no vetor o valor #" + (i+1)));
        }
        
        return vec;
    }
    
    static int somatoria(int[] vec){
        int somat = 0;
        
        for (int i = 0; i < (vec.length/2); i++){
            somat += vec[i] - vec[vec.length - (i+1)];
        }        
        
        return somat;
    }
}

