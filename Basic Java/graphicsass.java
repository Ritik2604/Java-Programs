/*
import java.awt.*;
class demo extends Frame{
	int y=10;
public void paint(Graphics g){
	g.drawOval(250,y,50,50);
		if(y>490)
		{
			for(y=490;y>0;y-=10){
				g.setColor(Color.black);
				g.drawOval(250,y,50,50);	
				try{Thread.sleep(200);}catch(Exception e){}
				g.setColor(Color.white);
				g.drawOval(250,y,50,50);
			}
		}
		y=y+10;
		try{
			Thread.sleep(200);
		}
		catch(Exception e){System.out.println(e);}
		repaint();		

}

public static void main(String arg[]){
demo obj=new demo();
obj.setVisible(true);
obj.setSize(500,500);
obj.setLocation(100,100);

}


}
*/



/*
import java.awt.*;
class demo extends Frame{
	int y=10;
public void paint(Graphics g){
		y=y+10;
		int red=(int)(Math.random()*255);
		int green=(int)(Math.random()*255);
		int blue=(int)(Math.random()*255);
		Color c1=new Color(red,green,blue);
		if(y>=490)
		{
			for(y=490;y>0;y-=10){
				red=(int)(Math.random()*255);
				green=(int)(Math.random()*255);
				blue=(int)(Math.random()*255);
				c1=new Color(red,green,blue);
				g.setColor(c1);
				g.fillOval(250,y,50,50);	
				try{Thread.sleep(200);}catch(Exception e){}
				g.setColor(Color.white);
				g.fillOval(250,y,50,50);
			}
		}
		g.setColor(c1);
		g.drawOval(250,y,50,50);

		try{
			Thread.sleep(200);
		}
		catch(Exception e){System.out.println(e);}
		
		repaint();		

}

public static void main(String arg[]){
demo obj=new demo();
obj.setVisible(true);
obj.setSize(500,500);
obj.setLocation(100,100);
}


}
*/



/*

import java.awt.*;
class demo extends Frame{
	int y=(int)(Math.random()*490);
	int x=(int)(Math.random()*490);
	Color c1;
	int red=0;
	int green=0;
	int blue=0;
	
public void lefts(Graphics g){
	for(x=0;x<=490;x+=10){
				y+=10;	
				red=(int)(Math.random()*255);
				green=(int)(Math.random()*255);
				blue=(int)(Math.random()*255);
				c1=new Color(red,green,blue);
				g.setColor(c1);
				g.fillOval(x,y,50,50);	
				try{Thread.sleep(200);}catch(Exception e){}
				g.setColor(Color.white);
				g.fillOval(x,y,50,50);
			}
}	

public void rights(Graphics g){
	for(x=490;x>0;x-=10){
				y-=10;
				red=(int)(Math.random()*255);
				green=(int)(Math.random()*255);
				blue=(int)(Math.random()*255);
				c1=new Color(red,green,blue);
				g.setColor(c1);
				g.fillOval(x,y,50,50);	
				try{Thread.sleep(200);}catch(Exception e){}
				g.setColor(Color.white);
				g.fillOval(x,y,50,50);
			}
}	

public void tops(Graphics g){
	for(y=0;y<=490;y+=10){
			x+=10;
			red=(int)(Math.random()*255);
			green=(int)(Math.random()*255);
			blue=(int)(Math.random()*255);
			c1=new Color(red,green,blue);
			g.setColor(c1);
			g.fillOval(x,y,50,50);	
			try{Thread.sleep(200);}catch(Exception e){}
			g.setColor(Color.white);
			g.fillOval(x,y,50,50);
		}
}	

public void bottoms(Graphics g){
	for(y=490;y>0;y-=10){
		x-=10;
		red=(int)(Math.random()*255);
		green=(int)(Math.random()*255);
		blue=(int)(Math.random()*255);
		c1=new Color(red,green,blue);
		g.setColor(c1);
		g.fillOval(x,y,50,50);	
		try{Thread.sleep(200);}catch(Exception e){}
		g.setColor(Color.white);
		g.fillOval(x,y,50,50);
			}
}	
public void paint(Graphics g){
		y=y+10;
		x=x+10;
		red=(int)(Math.random()*255);
		green=(int)(Math.random()*255);
		blue=(int)(Math.random()*255);
		c1=new Color(red,green,blue);
		
		if(x<=0)
		{
			lefts(g);
		}
		if(y<=0)
		{
			tops(g);
		}
		if(y>=490)
		{
			bottoms(g);
		}
		if(x>=490)
		{
			rights(g);
		}
		g.setColor(c1);
		g.drawOval(x,y,50,50);

		try{
			Thread.sleep(200);
		}
		catch(Exception e){System.out.println(e);}
		
		repaint();		

}

public static void main(String arg[]){
demo obj=new demo();
obj.setVisible(true);
obj.setSize(500,500);
obj.setLocation(100,100);
}


}*/

/*

import java.awt.*;
class demo extends Frame{
	int y=10;
	int flag=1;
	public void paint(Graphics g){
		
		
		if(flag%2==0)
		{
			y=y-10;
			g.fillOval(250,y,50,50);
		}
		else{
			y+=10;
			g.drawOval(250,y,50,50);
		}
		if(y>=490||y<20)
			flag++;
		try{
			Thread.sleep(100);
		}
		catch(Exception e){System.out.println(e);}
		repaint();		

}

public static void main(String arg[]){
demo obj=new demo();
obj.setVisible(true);
obj.setSize(500,500);
obj.setLocation(100,100);

}


}
*/

/*
import java.awt.*;
class demo extends Frame{
	int y=(int)(Math.random()*400);
	int x=(int)(Math.random()*400);
	public void paint(Graphics g){
	x+=10;
	y+=10;
	if(x>450||x<50||y>450||y<50){
		y=(int)(Math.random()*400);
		x=(int)(Math.random()*400);
	}		

	g.fillOval(x,y,50,50);

	try{Thread.sleep(200);}
	catch(Exception e){System.out.print(e);}
	repaint();

}

public static void main(String arg[]){
demo obj=new demo();
obj.setVisible(true);
obj.setSize(500,500);
obj.setLocation(700,400);

}
}
*/


/*
import java.awt.*;
class demo extends Frame{
	int x=80;
	int y=175;
	int flag=1;
	public void container(Graphics g){
		g.drawLine(50,150,50,250);
		g.drawLine(50,250,150,250);
		g.drawLine(150,250,150,150);
		
		g.drawLine(250,150,250,250);
		g.drawLine(250,250,350,250);
		g.drawLine(350,250,350,150);
		
	}
	public void paint(Graphics g){
		container(g);
		g.drawOval(x,y,25,25);
		if(y<75)
			flag=2;
		if(x>290)
			flag=3;
		if(y>190)
			System.exit(0);
		if(flag==1)
			y-=5;
		else if(flag==2)
			x+=5;
		else if(flag==3)
			y+=5;
	
		try{Thread.sleep(200);}
		catch(Exception e){System.out.print(e);}
		repaint();

}

public static void main(String arg[]){
demo obj=new demo();
obj.setVisible(true);
obj.setSize(500,500);
obj.setLocation(700,400);

}
}

*/


/*
import java.awt.*;

import java.awt.event.*;
class demo extends Frame implements MouseListener,MouseMotionListener{
	int x=80;
	int y=175;
	int flag=1;
	demo(){
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mouseEntered(MouseEvent me){}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){
	}
	public void mouseExited(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseMoved(MouseEvent me){}
	public void mouseDragged(MouseEvent me){
		x=me.getX();
		y=me.getY();
		repaint();
		
	}

	public void container(Graphics g){
		g.drawLine(50,150,50,250);
		g.drawLine(50,250,150,250);
		g.drawLine(150,250,150,150);
		
		g.drawLine(250,150,250,250);
		g.drawLine(250,250,350,250);
		g.drawLine(350,250,350,150);
		
	}
	public void paint(Graphics g){
		container(g);
		
		if(y<75)
		{	y=175;
			x=80;
		}	
		else if(x<60)
		{	y=175;
			x=80;
		}	
		else if(y>150&&x>150&&x<250)
		{	y=175;
			x=80;
		}	
		else if(x>290)
		{	y=175;
			x=80;
		}	
		else if(y>250	)
		{	y=175;
			x=80;
		}	
		if(x==285&&y==175){
				x=285;
				y=175;
			}
		g.drawOval(x,y,25,25);
		

}

public static void main(String arg[]){
demo obj=new demo();
obj.setVisible(true);
obj.setSize(500,500);
obj.setLocation(700,400);

}
}
*/



import java.awt.*;
class demo extends Frame{
	int x=80;
	int y=175;
	int flag=1;
	public void container(Graphics g){
		g.drawLine(50,150,50,250);
		g.drawLine(50,250,150,250);
		g.drawLine(150,250,150,150);
		
		g.drawLine(250,150,250,250);
		g.drawLine(250,250,350,250);
		g.drawLine(350,250,350,150);
		
	}
	public void paint(Graphics g){
		container(g);
		g.drawOval(x,y,25,25);
		if(y<75)
			flag=2;
		if(x>290)
			flag=3;
		if(y>190)
			System.exit(0);
		if(flag==1)
			y-=5;
		else if(flag==2)
			x+=5;
		else if(flag==3)
			y+=5;
	
		try{Thread.sleep(200);}
		catch(Exception e){System.out.print(e);}
		repaint();

}

public static void main(String arg[]){
demo obj=new demo();
obj.setVisible(true);
obj.setSize(500,500);
obj.setLocation(700,400);

}
}


