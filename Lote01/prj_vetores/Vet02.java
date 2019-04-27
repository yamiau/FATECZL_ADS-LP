package prj_vetores;

/********************************************
Objetivo:       Criar e coletar um vetor [100] inteiro e exibir:
                    a. O maior e o menor valor;
                    b. A média dos valores.
Programador:    Murillo Meira
Data:           21/03/2019
*********************************************/

import javax.swing.JOptionPane;

public class Vet02 {
    public static void main(String args[]){
        int vec[] = new int[100];

        int op = 0, opcount = 0;
        
        while (op != 9) {
            op = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carregar vetor \n 2 - Receber maior e menor valor \n 3 - Receber a média dos valores \n 9 - Finalizar"));
            
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
                    
                    int[] mm = maior_menor(vec);
                    JOptionPane.showMessageDialog(null, "Maior valor: " + mm[0] + "\n Menor valor: " + mm[1]);
                    break;
            
                case 3:
                    if (opcount < 1){
                        opcount++;
                        JOptionPane.showMessageDialog(null, "O vetor não foi carregado ainda!");
                        vec = carregar(vec);
                    }
                    
                    JOptionPane.showMessageDialog(null, "A média dos valores no vetor é: " + media(vec));
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
    
    static int[] maior_menor(int vec[]){     
        int[] mm = new int[2];
        
        for (int i = 0; i < vec.length; i++) {
            if (i != 0){
                if (vec[i] < mm[0]){
                    mm[0] = vec[i];
                } else if (vec[i] > mm[1]){
                    mm[1] = vec[i];
                }
            } else {
                mm[0] = vec[i];
                mm[1] = vec[i];
            }
        }
        
        return mm;
    }
    
    static int media(int vec[]){
        int soma = 0;
        for (int i = 0; i < vec.length; i++){
            soma += vec[i];
        }
        
        return (soma/vec.length);
    }
}
