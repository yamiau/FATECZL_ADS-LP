package prj_vetores;

/********************************************
Objetivo:   Criar e coletar em um vetor [30] real e calcular e exibir:
                a. A média do grupo;
                b. A quantidade de notas acima da média do grupo;
                c. As posições dos valores abaixo da média do grupo
Programador:    Murillo Meira
Data:           22/03/2019
*********************************************/

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Vet04 {
    public static void main(String args[]){
        double vec[] = new double[10];
        double md = 0;
        int op = 0, opcount = 0;
        
        while (op != 9) {
            op = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carregar vetor \n 2 - Receber média do grupo \n 3 - Receber a quantidade de notas abaixo e acima da média \n 4 - Receber posição das notas abaixo e acima da média \n 9 - Finalizar"));
            
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
                    
                    md = media(vec);
                    JOptionPane.showMessageDialog(null, "Média do grupo: " + md);
                    break;
            
                case 3:
                    if (opcount < 1){
                        opcount++;
                        JOptionPane.showMessageDialog(null, "O vetor não foi carregado ainda!");
                        vec = carregar(vec);
                    }
                    
                    int[] notas = new int[2];
                    notas = comp_media(vec, md);
                    JOptionPane.showMessageDialog(null, "Há " + notas[0] + " notas acima da média e " + notas[1] + " notas abaixo da média.");
                    break;
            
                case 4:
                    if (opcount < 1){
                        opcount++;
                        JOptionPane.showMessageDialog(null, "O vetor não foi carregado ainda!");
                        vec = carregar(vec);
                    }
                    
                    posi_media(vec, md);
                    
                case 9:
                    JOptionPane.showMessageDialog(null, "Fim.");
                    System.exit(0);
                    break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida!");
            }
        }
    }    
    
    static double[] carregar(double[] vec){
        for(int i = 0; i < vec.length; i++) {
            vec[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor #" + (i+1) ));
        }
        
        JOptionPane.showMessageDialog(null, "O vetor foi carregado com sucesso!");
        return vec;
    }
    
    static double media(double[] vec){     
        double soma = 0, div = 0;
        
        for (int i = 0; i < vec.length; i++) {
            soma += vec[i];
            div++;
        }
        
        return (soma/div);
    }
    
    static int[] comp_media(double[] vec, double md){
        int[] notas = new int[2];
        
        for (int i = 0; i < vec.length; i++){
            if (vec[i] >= md){
                notas[0]++;
            } else {
                notas[1]++;
            }
        }
        
        return notas;
    }
    
    static void posi_media(double[] vec, double md){
        int ac = 0;
        int ab = 0;        
        int[] acima = new int[ac];
        int[] abaixo = new int [ab];
        
        for (int i = 0; i < vec.length; i++){
            if (vec[i] >= md){
                ac++;
                acima[i] = i;
            } else {
                ab++;
                abaixo[i] = i;
            }
        }
        
        System.out.println(Arrays.toString(acima));
        System.out.println(Arrays.toString(abaixo));
    }
}
