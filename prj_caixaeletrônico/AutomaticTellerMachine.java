/********************************************
Objetivo:       Criar um programa para uma máquina de caixa eletrônico
Programador:    Murillo Meira
Data:           04/04/2019
*********************************************/
import javax.swing.JOptionPane;

public class AutomaticTellerMachine {
    public static void main(String args[]){
        
        int op = 0, withdrawals = 0;
        int[][] cash = new int[2][6];
        int[][] stats = new int[4][4];
        
        cash[0][0] = 2;
        cash[0][1] = 5;
        cash[0][2] = 10;
        cash[0][3] = 20;
        cash[0][4] = 50;
        cash[0][5] = 100;
        
        
        while ((op != 9) & (withdrawals< 100) ){
            
            try{
                op = Integer.parseInt(JOptionPane.showInputDialog("Select your operation\n1 - Load bills\n2 - Withdraw\n3 - Statistics\n9 - Exit"));
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Please insert only Integer numerical characters.");
                main(null);
            }
            
            switch(op){
                case 1:
                    load_bills(cash);
                    break;
                
                case 2:
                    withdraw(cash, stats);
                    break;
                    
                case 3:
                    stats(stats);
                    break;
                    
                case 9:
                    JOptionPane.showMessageDialog(null, "Operation end.");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid operation!");                    
            }
        }   
    }
    
    static void load_bills(int[][] cash){
        
        for (int i = 0; i < cash[0].length; i++){
            
            try{
                cash[1][i] = Integer.parseInt(JOptionPane.showInputDialog("Load the amount of R$" + cash[0][i] + ",00 bills"));
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Please insert only Integer numerical characters.");
                load_bills(cash);
            }
        }
        
        JOptionPane.showMessageDialog(null, "Bills loaded successfully!");
    }
    
    static void withdraw(int[][] cash, int[][] stats){
        
        //receive bank info
        int bank = 0;
        if (bank == 0){
            bank = Integer.parseInt(JOptionPane.showInputDialog("Enter bank code\n1 - Eagle\n2 - Tiger\n3 - Dragon\n4 - Whale\n9 - Return"));
            
            if (bank == 9){
                main(null);
            }
            
            bank--;
        }
        
        //calculate the amount of cash in register
        int cap = 0;
        for (int i = 0; i < cash[0].length; i++){
            cap += (cash[0][i] * cash[1][i]);
        }
        
        //withdrawal stage
        int value = 0;
        try{
            value =  Integer.parseInt(JOptionPane.showInputDialog("Amount to withdraw"));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please insert only Integer numerical characters.");
            main(null);
        }
        
        if (value < 4){
            if (value == 0){
                JOptionPane.showMessageDialog(null, "Thank you for the fidelity.");
                main(null);
            }
            JOptionPane.showMessageDialog(null, "The minimal amount to withdraw is R$ 4,00.");
            withdraw(cash, stats);
        } else if (value > cap){
            JOptionPane.showMessageDialog(null, "The current withdrawal limit is R$ " + cap + ".");
            withdraw(cash, stats);
        }
              
        gather_stats(stats, bank, value);
        bill_selection(cash, stats, value);
    }
    
    static void gather_stats(int[][] stats, int bank, int value){
        
        stats[0][bank] += value;
        if (stats[3][bank] < 1){
            stats[1][bank] = value;
            stats[1][bank] = value;
        } else if (value < stats[1][bank]){
            stats[1][bank] = value;
        } else if (value > stats[2][bank]){
            stats[2][bank] = value;
        }
        stats[3][bank] ++;
    }
    
    static void bill_selection(int[][] cash, int[][] stats, int value){
                
        while ((value % 10) != 0){
            if ( ((value % 2) == 0) || ((value % 10) == 1) || ((value % 10) == 7)){
                value -= cash[0][0];
                cash[1][0] --;
                System.out.println(cash[0][0]);
                
            } else if ( ((value % 10) == 3) || ((value % 10) == 9) || ((value % 10) == 5) ){
                value -= cash[0][1];
                cash[1][1] --;
                System.out.println(cash[0][1]);
            }     
        }
        
        for (int i = cash[0].length -1; i > 0; i--){
            while ( (cash[1][i] > 0) & (value/cash[0][i] >= 1) ){
                value -= cash[0][i];
                cash[1][i]--;
                System.out.println(cash[0][i]);
            }
        }
    }
    
    static void stats(int[][] stats){
        
        String[] banklist = {"Eagle", "Tiger", "Dragon", "Whale"};
        
        int bank = 0;
        while (bank == 0){
            
            try{
                bank = Integer.parseInt(JOptionPane.showInputDialog("Enter bank code\n1 - Eagle\n2 - Tiger\n3 - Dragon\n4 - Whale\n9 - Return"));
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Please insert only Integer numerical characters.");
                stats(stats);
            }
            
            if (bank == 9){
                main(null);
            }
            
            bank--;
        }
        
        
        int display = 0;
        while (display != 9){
            
            try{
                display = Integer.parseInt(JOptionPane.showInputDialog("Select data to display\n1 - Total amount withdrawn\n2 - Smallest amount withdrawn\n3 - Greatest amount withdrawn\n4 - Average of amounts withdrawn\n9 - Return"));
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Please insert only Integer numerical characters.");
            }
            
            switch (display){
                
                case 1:
                    JOptionPane.showMessageDialog(null, "R$ " + stats[bank][display] + ",00 in total have been withdrawn by" + banklist[bank] + " users.");
                    break;
                
                case 2: 
                    JOptionPane.showMessageDialog(null, "R$ " + stats[bank][display] + ",00 was the smallest amount withdrawn by" + banklist[bank] + " users.");
                    break;
                    
                case 3: 
                    JOptionPane.showMessageDialog(null, "R$ " + stats[bank][display] + ",00 was the greatest amount withdrawn by" + banklist[bank] + " users.");
                    break;
                    
                case 4: 
                    JOptionPane.showMessageDialog(null, "R$ " + (stats[bank][2]/stats[bank][3]) + ",00 have been withdrawn by" + banklist[bank] + " users.");
                    break;
                
                case 9:
                    stats(stats);
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Invalid operation!");
            }
        }
    }
}