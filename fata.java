package barbut.in.sti.aproapel.vechi;

import java.util.Random;
public class fata 
{
    public int punct;//punctul reprezinta fata dezvaluita de unul dintre combatanti
    public int bani;//banii detinuti de fiecare jucator
    

//generez un numar aleator intre 1 si 6 
    public int generare()
    {int x;
       Random aleator=new Random();
       
       x=aleator.nextInt(6);
       return x;
    }

    
}
