
package barbut.in.sti.aproapel.vechi;

import java.util.Scanner;
public class meniu 
{
    public int decizie;
    
    public void tabla(int x)
    {
        while(x!=1&&x!=3)
        {
        System.out.println("Start");
        System.out.println("Instructiuni");
        System.out.println("Iesire");
        
        Scanner sc=new Scanner(System.in);
        
        x=sc.nextInt();
        decizie=x;
        if(x==2)
            System.out.println("Bine ai venit!In acest joc tu si adversarul tau virtual veti da cu zarul\n"
                    + "iar cel ce va dezvalui un numar mai mare va castiga suma dintre ambele dati "
                    + "dezvaluite, timp in care celalalt o va pierde.Pierde cel ce ramane fara bani.\n"
                    + "Poti incerca si varianta C++ a jocului cu doar 7$!");
       
        System.out.println("\n"+"\n");
        }
    }

    
}
