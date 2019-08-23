package prj_vetores;

/********************************************
Objetivo:   A partir do exercício 6 (vetor classificado) solicitar um valor qualquer e verificar a sua
            existência no vetor (utilizar pesquisa binária).
Programador:    Murillo Meira
Data:           24/03/2019
*********************************************/

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Vet07 {
    public static void main(String args[]){
        
        int[] vec = new int[10];
        int op = 0;
        
        while (op != 9){
            op = Integer.parseInt(JOptionPane.showInputDialog("1 - Carregar vetor\n2 - Classificar vetor\n3 - Pesquisa binária\n9 - Finalizar"));
        
            switch(op){
                case 1:
                    vec = carregar(vec);
                    break;
                
                case 2:
                    classificar(vec);                    
                    break;
             
                case 3:
                    binary_search(vec);
                    break;
                    
                case 9:
                    JOptionPane.showMessageDialog(null, "Fim.");
                    System.exit(0);
                    break;                    
            }   
        }
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
    
    static void binary_search(int[] vec){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Número a ser pesquisado no vetor"));
        int first = 0, last = (vec.length-1), match = 0;
        int mid = (vec.length/2);
        
        while ( (match < 1) & (n <= mid) ){
            mid = ((first + last)/2);
            if ( n == vec[mid]){
                match++;
            } else if (n > vec[mid]){
                first = (mid + 1);
            } else if (n < vec[mid]){
                last = (mid - 1);
            }
        }
        
        if (match < 1){
            JOptionPane.showMessageDialog(null, "O número " + n + " não existe no vetor.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + n + " existe no vetor.");
        }
    }
}
