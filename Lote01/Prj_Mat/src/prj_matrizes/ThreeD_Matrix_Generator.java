package prj_matrizes;

/********************************************
Objective:      Develop a 3D Matrix generator
Programmer:     Murillo Meira
Date:           26/03/2019
*********************************************/
import java.security.SecureRandom;
import javax.swing.JOptionPane;

public class ThreeD_Matrix_Generator {
    static int c = 0;
    
    public static void main(String args[]){
        
        JOptionPane.showMessageDialog(null, "Welcome to the Cube Matrix Generator!");
        
       int[][][] mat = new int[dimension_size()][dimension_size()][dimension_size()];
        
       load(mat);
    }
    
    static int dimension_size(){
 
        return Integer.parseInt(JOptionPane.showInputDialog("Size of dimension #" + (++c)));
    } 
    
    static void load(int[][][] mat){
        SecureRandom random = new SecureRandom();
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                for(int k = 0; k < mat[0][0].length; k++){
                    mat[i][j][k] = random.nextInt(100);
                    System.out.print(mat[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
    static void print(int[][][]mat){
    }
}
