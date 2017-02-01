

import java.awt.*;
import java.applet.*;

class shape extends Applet
{

    public void paint(Graphics g)
    {

    }
    
    public static void corner(Graphics g)
    {
        g.drawArc(100,100,100,100,90,90); //sd[lfjposdj
        
        g.drawArc(300,100,100,100,90,-90); //'hgu
        
        g.drawArc(700,100,100,100,-90,-90); //right bottem
        
        g.drawArc(700,700,100,100,-90,90); //left 
        
    }
    
    public static void volume1(Graphics g)
    {
        g.drawString("iphone", 25, 25);
    }
    
    public static void volume2(Graphics g)
    {
        g.drawString("iphone", 25, 25);
    }
    
    public static void muteringer(Graphics g)
    {
        g.drawString("iphone", 25, 25);
    }
}
