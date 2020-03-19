import java.awt.*;
import java.awt.event.*;
class demo extends Frame implements ActionListener{
TextField ta;
Panel p1,p2,p3,p4;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
demo(){
	p1=new Panel();
	p2=new Panel();
	p3=new Panel();
	p4=new Panel();
	ta=new TextField(15);
	setLayout(new BorderLayout());
	add(ta,BorderLayout.NORTH);
	
	p1.setLayout(new GridLayout(3,3));
	p2.setLayout(new GridLayout(3,1));
	p3.setLayout(new GridLayout(3,1));
	p4.setLayout(new GridLayout(1,4));

	for(int i=1;i<10;i++){
		b1=new Button(""+i);
		p1.add(b1);
		b1.addActionListener(this);
	}
	add(p1,BorderLayout.CENTER);
	
	b2=new Button("OFF");
	p2.add(b2);
	b2.addActionListener(this);
	b4=new Button("sqrt");
	p2.add(b4);
	b4.addActionListener(this); 
	b5=new Button("CE");
	p2.add(b5);
	b5.addActionListener(this); 	
	add(p2,BorderLayout.WEST);
	
	b6=new Button("+");
	p3.add(b6);
	b6.addActionListener(this);
	b7=new Button("-");
	p3.add(b7);
	b4.addActionListener(this); 
	b7=new Button("*");
	p3.add(b7);
	b7.addActionListener(this); 	
	add(p3,BorderLayout.EAST);
	
	b8=new Button("00");
	p4.add(b8);
	b8.addActionListener(this);
	b9=new Button("0");
	p4.add(b9);
	b9.addActionListener(this); 
	b10=new Button(".");
	p4.add(b10);
	b10.addActionListener(this); 
	b11=new Button("=");
	p4.add(b11);
	b11.addActionListener(this); 	
	add(p4,BorderLayout.SOUTH);
/*
	
		
	
		
		
	b4=new Button("sqrt");
	add(b4);
	b4.addActionListener(this); 
	for(int i=4;i<7;i++){
		b1=new Button(""+i);
		b1.addActionListener(this);
		add(b1);
	}	
	b5=new Button("-");
	add(b5);
	b5.addActionListener(this); 
	
	b6=new Button("CE");
	add(b6);
	b6.addActionListener(this); 
	for(int i=1;i<3;i++){
		b1=new Button(""+i);
		b1.addActionListener(this);
		add(b1);
	}	
	b7=new Button("*");
	add(b7);
	b7.addActionListener(this); 
	
	b8=new Button("00");
	add(b8);
	b8.addActionListener(this); 
	b9=new Button(".");
	b9.addActionListener(this);
	add(b9);	
	b10=new Button("=");
	add(b10);
	b10.addActionListener(this); 
	b11=new Button("/");
	add(b11);
	b11.addActionListener(this);
*/

}
public void actionPerformed(ActionEvent ae){
}
public static void main (String arg[]) throws Exception{
demo d=new demo();
d.setSize(500,500);
d.setVisible(true);
}
}