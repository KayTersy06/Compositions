package boxingfight;

import boxer.Boxer;
import javax.swing.JOptionPane;

public class CompositionExercise {

    public static void main(String[] args) {
        String bName1 = JOptionPane.showInputDialog(null, "Please enter name of the first boxer");
        String bName2 = JOptionPane.showInputDialog(null, "Please enter name of the second boxer");
        
        Boxer boxer1 = new Boxer(bName1);
        Boxer boxer2 = new Boxer(bName2);
        
        BoxingFight fight = new BoxingFight(boxer1, boxer2);
        
        String input = " ";
        input = JOptionPane.showInputDialog(null, "Plese enter number the of fight by " + boxer1.getBoxerName());
        int nOFB1 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog(null, "Please enter the number of matches won for " + boxer1.getBoxerName());
        int nOWB1 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog(null, "Please enter the number of KOs for " + boxer1.getBoxerName());
        int nOKOB1 = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog(null, "Please enter number the of fights by " + boxer2.getBoxerName());
        int nOFB2 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog(null, "Please enter the number of matches won for " + boxer1.getBoxerName());
        int nOWB2 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog(null, "Please enter the number of KOs for " + boxer1.getBoxerName());
        int nOKOB2 = Integer.parseInt(input);
        
        
        
        String winner = fight.possibleWinner(nOFB1, nOWB1, nOKOB1, nOFB2, nOWB2, nOKOB2);
        
        JOptionPane.showMessageDialog(null, winner);
    }
    
}
