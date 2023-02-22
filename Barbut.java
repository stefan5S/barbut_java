package barbut.in.sti.aproapel.vechi;


import java.util.Scanner;
public class BarbutInStiAproapelVechi 
{


    public static void main(String[] args) 
    {
        int aruncare;
        //am creat un obiect, jucatorul
        fata jucator=new fata();
        fata calculator=new fata();
        
        //alegerea acestuia din cadrul meniului
        meniu alegere=new meniu();
        
        Scanner sc=new Scanner(System.in);
        
        //fiecare jucator pleaca cu suma de 50$
        jucator.bani=50;
        calculator.bani=50;
        
        //ar mai fi de adaugat si un meniu
        
        alegere.tabla(alegere.decizie);
      
        
        
        //lupta propriu zisa
        while(alegere.decizie==1)
        {
            while(jucator.bani!=0&&calculator.bani!=0)
            {
            System.out.println("Randul tau!");
            aruncare=sc.nextInt();
                  
            
            //se arunca cu zarul
            jucator.punct=jucator.generare();
            calculator.punct=calculator.generare();
            
            
            
            /*se compara rezultatele aruncarii, daca jucatorul da mai mult decat calculatorul va castiva 
            punctele acestuia +ale sale*/
            if(jucator.punct<calculator.punct)
            {System.out.print("Ai pierdut niste bani!");
            jucator.bani=jucator.bani-jucator.punct-calculator.punct;
            calculator.bani=calculator.bani+jucator.punct+calculator.punct;
            }                    
            else
            if(jucator.punct>calculator.punct)
            {   System.out.println("Ai castigat!");
            jucator.bani=jucator.bani+jucator.punct+calculator.punct;
            calculator.bani=calculator.bani-jucator.punct-calculator.punct;            
            }
            else
                System.out.println("O lupta stransa!Egalitate!");
            
            
            
            System.out.println("Bani jucator:"+jucator.bani+"\n"+"Bani calculator:"+calculator.bani);
            
            
            System.out.println("\n");
            
            }
            
            alegere.tabla(alegere.decizie);
            
        }
        
        
        
        
        
    }
    
}
