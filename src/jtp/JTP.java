package jtp;

public class JTP
{
    public static void main(String[] args)
    {
        Window okno = new Window();
        Dice kostka = new Dice();
        String tmp = kostka.result();
        System.out.println(tmp + "\n");
        
        for ( Animal d : Animal.values() )
            //czemu nie działa?
            if (tmp.equals(d.getClass().getName()))
                System.out.println(d + " " + d.getCount());
            else
                System.out.println(d);
        
        
        
        
    }
    
}
