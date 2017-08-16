//Create an applet to display a string on client area


/*<html>
<applet code="Example.class" height=500 width=800>
</applet>
</html>*/
import java.net.*;
import java.awt.*;
import java.applet.*;
public class Example extends Applet
{
	public void init()
	{
		setBackground(Color.red);
		//setForeground(Color.black);
		
	}
	public void paint(Graphics g)
	{
		
		Font f=new Font("Serif",Font.BOLD,30);
		g.setColor(Color.pink);
		g.setFont(f);
		g.drawString("Hello World",12,23);
	}
}