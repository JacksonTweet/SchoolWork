

import java.awt.*;
import java.applet.*;

class shape extends Applet
{

    public void paint(Graphics g)
    {

    }
    
    public static void body(Graphics g)
    {
        g.drawArc(100,100,100,100,90,90); //sd[lfjposdj
        g.drawLine(100,300);
        g.drawArc(300,100,100,100,90,-90); //'hgu
        
        g.drawArc(100,500,100,100,-90,-90); //right bottem
        
        g.drawArc(300,500,100,100,-90,90); //left 
        
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
