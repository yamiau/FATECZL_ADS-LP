package prj_vetores;

/********************************************
Objetivo:       Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. 
                Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados.
Programador:    Murillo Meira
Data:           21/03/2019
*********************************************/

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Vet03 {
    public static void main(String args[]){
        
        int op = 0;
        int vec1[] = new int[3];
        int vec2[] = new int[3];        
        int vec3[] = new int[vec1.length + vec2.length];
        while (op != 9) {
            
            op = Integer.parseInt(JOptionPane.showInputDialog(null, " 1 - Carregar vetor \n 2 - Concatenar vetores \n 9 - Finalizar"));
            
            switch(op){
                case 1:
                    JOptionPane.showMessageDialog(null, "Carregando primeiro vetor...");
                    vec1 = carregar(vec1);
                    JOptionPane.showMessageDialog(null, "Carregando segundo vetor...");
                    vec2 = carregar(vec2);
                    break;
                    
                case 2: 
                    vec3 = concatenar(vec1, vec2);
                    JOptionPane.showMessageDialog(null, "Vetor concatenado! Visualização pelo terminal.");
                    System.out.println(Arrays.toString(vec3));
            }
        }
    }

    
    static int[] carregar(int vec[]){
        for(int i = 0; i < vec.length; i++) {
            vec[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor #" + (i+1) ));
        }
        
        JOptionPane.showMessageDialog(null, "O vetor foi carregado com sucesso!");
        return vec;
    }
    
    static int[] concatenar(int[] vec1, int[] vec2){     
        int[] vec3 = new int[vec1.length + vec2.length];
        
        for (int i = 0; i < (vec3.length); i++) {
            vec3[i] = vec1[i];
            vec3[vec1.length + i] = vec2[i];
        }
        
        return vec3;
    }
}
