package boxingfight;

import boxer.Boxer;
import javax.swing.JOptionPane;

public class BoxingFight {
    private Boxer boxer1;
    private Boxer boxer2;

    public BoxingFight(Boxer boxer1, Boxer boxer2) {
        this.boxer1 = boxer1;
        this.boxer2 = boxer2;
    }

    public Boxer getBoxer1() {
        return boxer1;
    }

    public Boxer getBoxer2() {
        return boxer2;
    }
    
    public String possibleWinner(int numOfFightsB1, int numOfWinsB1, int numOfKOsB1,int numOfFightsB2, int numOfWinsB2, int numOfKOsB2)
    {
        String outcome = " ";
        if(numOfFightsB1 == numOfFightsB2)
        {
            if(numOfWinsB1 == numOfWinsB2)
            {
                if(numOfKOsB1 == numOfKOsB2)
                {
                    outcome = "Tie";
                }
                else if(numOfKOsB1 >= numOfKOsB2)
                {
                    outcome = "The possible winner is " + boxer1.getBoxerName();
                }
                else
                {
                    outcome = "The possible winner is " + boxer2.getBoxerName();
                }
            }
            else if(numOfWinsB1 >= numOfWinsB2)
            {
                outcome = "The possible winner is " + boxer1.getBoxerName();
            }
            else
            {
                outcome = "The possible winner is " + boxer2.getBoxerName();
            }
        }
        else if(numOfFightsB1 >= numOfFightsB2)
        {
            if((numOfWinsB1/100) == (numOfWinsB2/100))
            {
                if(numOfKOsB1 == numOfKOsB2)
                {
                    outcome = "Tie";
                }
                else if(numOfKOsB1 >= numOfKOsB2)
                {
                    outcome = "The possible winner is " + boxer1.getBoxerName();
                }
                else
                {
                    outcome = "The possible winner is " + boxer2.getBoxerName();
                }
            }
            else if((numOfWinsB1/100) >= (numOfWinsB2/100))
            {
                outcome = "The possible winner is " + boxer2.getBoxerName();
            }
            else
            {
                outcome = "The possible winner is " + boxer2.getBoxerName();
            }
        }
        else
        {
            if((numOfWinsB1/100) <= (numOfWinsB2/100))
            {
                if(numOfKOsB1 == numOfKOsB2)
                {
                    outcome = "Tie";
                }
                else if(numOfKOsB1 >= numOfKOsB2)
                {
                    outcome = "The possible winner is " + boxer1.getBoxerName();
                }
                else
                {
                    outcome = "The possible winner is " + boxer2.getBoxerName();
                }
            }
            else if((numOfWinsB1/100) >= (numOfWinsB2/100))
            {
                outcome = "The possible winner is " + boxer2.getBoxerName();
            }
            else
            {
                outcome = "The possible winner is " + boxer2.getBoxerName();
            }
        }
        
        return outcome;
    }
}
