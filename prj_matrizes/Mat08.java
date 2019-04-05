package prj_matrizes;

/********************************************
Objetivo:       Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos em 4 semanas. Calcular e exibir: 
                a. A quantidade de cada produto vendido no mês; 
                b. A quantidade de produtos vendidos por semana; 
                c. O total de produtos vendidos no mês.

Programador:    Murillo Meira
Data:           24/03/2019
*********************************************/

import javax.swing.JOptionPane;

public class Mat08 {
    public static void main(String args[]){
        
        int[][] mat = new int[4][3];
        int op = 0;
        
        while (op != 9){
            
            op = Integer.parseInt(JOptionPane.showInputDialog("1 - Carregar matriz\n2 - Quantidade de produtos vendidos por mês\n3 - Quantidade de vendas por semana\n4 - Vendas totais no mês"));
            
            switch(op){
                case 1:
                    mat = carregar(mat);
                    break;
                
                case 2:
                    int prod = Integer.parseInt(JOptionPane.showInputDialog("Produto a ser visualizado:"));
                    prod_mes(mat, prod);
                    break;
                    
                case 3:
                    int sem = Integer.parseInt(JOptionPane.showInputDialog("Semana a ser visualizada:"));
                    prod_sem(mat, sem);
                    break;
                    
                case 4:
                    JOptionPane.showMessageDialog(null, "Total de produtos vendidos no mês:\n" + vendas_mes(mat));
                    break;
            }
        }
    }
    
    static int[][] carregar(int[][] mat){
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++){
                mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Linha " + (i+1) + " Coluna " + (j+1) + " :"));
            }
        }
        
        JOptionPane.showMessageDialog(null, "Matriz carregada com sucesso!");
        return mat;
    }
    
    static void prod_mes(int[][] mat, int prod){
        
        JOptionPane.showMessageDialog(null, "Semana 1: " + mat[0][prod] + "\nSemana 2: " + mat[1][prod] + "\nSemana 3: " + mat[2][prod] + "\nSemana 4:" + mat[3][prod]);
    }
    
    static void prod_sem(int[][] mat, int sem){
        
        JOptionPane.showMessageDialog(null, "Prod 1: " + mat[sem][0] + "\nProd 2: " + mat[sem][1] + "\nProd3: " + mat[sem][2]);
    }
    
    static int vendas_mes(int[][] mat){
        int total = 0;
        
        for (int i = 0; i < mat.length; i ++){
            for (int j = 0; j < mat[0].length; j++){
                total += mat[i][j];
            }
        }
        
        return total;
    }
}
