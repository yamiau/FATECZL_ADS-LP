package prj_vetores;

/********************************************
Objetivo:       Criar e coletar um vetor [50] inteiro. Calcular e exibir:
                    a. A média dos valores entre 10 e 200;
                    b. A soma dos números ímpares.
Programador:    Murillo Meira
Data:           21/03/2019
*********************************************/

import javax.swing.JOptionPane;
//import java.util.Arrays;
public class Vet01 {
    public static void main(String args[]){
        int vec[] = new int[50];
        //System.out.println(Arrays.toString(vec));
        int op = 0, opcount = 0;
        
        while (op != 9) {
            op = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carregar vetor \n 2 - Receber a média dos valores entre 10 e 200 \n 3 - Receber a soma dos números ímpares \n 9 - Finalizar"));
            
            switch(op){
                case 1: 
                    opcount++;
                    vec = carregar(vec);
                    break;
            
                case 2: 
                    if (opcount < 1){
                        opcount++;
                        JOptionPane.showMessageDialog(null, "O vetor não foi carregado ainda!");
                        vec = carregar(vec);
                    }
                    
                    JOptionPane.showMessageDialog(null, "A média dos valores de 10 a 200 no vetor é: " + media_10_200(vec));
                    break;
            
                case 3:
                    if (opcount < 1){
                        opcount++;
                        JOptionPane.showMessageDialog(null, "O vetor não foi carregado ainda!");
                        vec = carregar(vec);
                    }
                    
                    JOptionPane.showMessageDialog(null, "A soma dos valores ímpares no vetor é: " + soma_impar(vec));
                    break;
            
                case 9:
                    JOptionPane.showMessageDialog(null, "Fim.");
                    System.exit(0);
                    break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida!");
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
    
    static double media_10_200(int vec[]){
        double media = 0;
        int div = 0;
        
        for (int i = 0; i < vec.length; i++) {
            if ( (vec[i] >= 10) & (vec[i] <= 200) ){
                media += vec[i];
                div++;
            }
        }
        
        return (media/div);
    }
    
    static int soma_impar(int vec[]){
        int soma = 0;
        
        for (int i = 0; i < vec.length; i++){
            if ( (vec[i] % 2) != 0 ){
                soma += vec[i];
            }
        }
        
        return soma;
    }
}
