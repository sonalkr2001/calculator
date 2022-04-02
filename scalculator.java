import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class scalculator implements ActionListener

{ 
	JFrame jf;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,beq,bdel,bdec,bclr;
	JTextField j1;
	static  Double a=0.0,b=0.0,res=0.0;
	static int op=0;
	scalculator()
	{
	  jf=new JFrame("Calculator");
	  jf.setVisible(true);
	  jf.setLayout(null);
	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  jf.setBounds(40,40,300,350);
	  jf.setResizable(false);
	  Font fo=new Font("Arial",Font.BOLD,20);
	  j1=new JTextField();
	  j1.setFont(fo);
	  j1.setHorizontalAlignment(JTextField.RIGHT);
	  j1.setBackground(Color.YELLOW);
	  j1.setForeground(Color.RED);
	  j1.setBounds(40,40,200,50);
	  b1=new JButton("1");
	  b2=new JButton("2");
	  b3=new JButton("3");
	  b4=new JButton("4");
	  b5=new JButton("5");
	  b6=new JButton("6");
	  b7=new JButton("7");
	  b8=new JButton("8");
	  b9=new JButton("9");
	  b0=new JButton("0");
	  badd=new JButton("+");
	  badd.setFont(fo);
	  bsub=new JButton("-");
	  bsub.setFont(fo);
	  bmul=new JButton("*");
	  bmul.setFont(fo);
	  bdiv=new JButton("/");
	  bdiv.setFont(fo);
	  beq=new JButton("=");
	  beq.setFont(fo);
	  bdec=new JButton(".");
	  bdec.setFont(fo);
	  bdel=new JButton("Delete");
	  bdel.setFont(fo);
	  bclr=new JButton("Clear");
	  bclr.setFont(fo);
	  b7.setBounds(40,100,50,40);
	  b8.setBounds(90,100,50,40);
	  b9.setBounds(140,100,50,40);
	  bdiv.setBounds(190,100,50,40);
	  b4.setBounds(40,140,50,40);
	  b5.setBounds(90,140,50,40);
	  b6.setBounds(140,140,50,40);
	  bmul.setBounds(190,140,50,40);
	  b1.setBounds(40,180,50,40);
	  b2.setBounds(90,180,50,40);
	  b3.setBounds(140,180,50,40);
	  bsub.setBounds(190,180,50,40);
	  bdec.setBounds(40,220,50,40);
	  b0.setBounds(90,220,50,40);
	  beq.setBounds(140,220,50,40);
	  badd.setBounds(190,220,50,40);
	  bdel.setBounds(40,260,100,40);
	  bclr.setBounds(140,260,100,40);
	 
	  jf.add(j1);
	  jf.add(b1);
	  jf.add(b2);
	  jf.add(b3);
	  jf.add(b4);
	  jf.add(b5);
	  jf.add(b6);
      jf.add(b7);
	  jf.add(b8);
	  jf.add(b9);
	  jf.add(b0);
      jf.add(badd);
	  jf.add(bsub);
	  jf.add(bmul);
	  jf.add(bdiv);
	  jf.add(beq);
      jf.add(bdec);
	  jf.add(bdel);
	  jf.add(bclr);
	  b1.addActionListener(this);
	  b2.addActionListener(this);
	  b3.addActionListener(this); 
	  b4.addActionListener(this);
      b5.addActionListener(this);	  
	  b6.addActionListener(this);
      b7.addActionListener(this);
	  b8.addActionListener(this);
	  b9.addActionListener(this);
	  b0.addActionListener(this);
	  badd.addActionListener(this);
	  bsub.addActionListener(this);
	  bmul.addActionListener(this);
	  bdiv.addActionListener(this);
	  bdec.addActionListener(this);
	  bdel.addActionListener(this);
	  beq.addActionListener(this);
	  bclr.addActionListener(this);
	 }
	 public void actionPerformed(ActionEvent e)
	 {
		
		if(e.getSource()==bclr)
		{
				j1.setText("");
		}
		if(e.getSource()==bdel)
		{
				String s=j1.getText();
				j1.setText("");
				for(int i=0;i<s.length()-1;i++)
					j1.setText(j1.getText()+s.charAt(i));
		}
		if(e.getSource()==b1)
		{
				j1.setText(j1.getText().concat("1"));
		}
		if(e.getSource()==b2)
		{
				j1.setText(j1.getText().concat("2"));
		}
		if(e.getSource()==b3)
		{
				j1.setText(j1.getText().concat("3"));
		}
		if(e.getSource()==b4)
		{
				j1.setText(j1.getText().concat("4"));
		}
		if(e.getSource()==b5)
		{
				j1.setText(j1.getText().concat("5"));
		}
		if(e.getSource()==b6)
		{
				j1.setText(j1.getText().concat("6"));
		}
		if(e.getSource()==b7)
		{
				j1.setText(j1.getText().concat("7"));
		}
		if(e.getSource()==b8)
		{
				j1.setText(j1.getText().concat("8"));
		}
		if(e.getSource()==b9)
		{
				j1.setText(j1.getText().concat("9"));
		}
		if(e.getSource()==b0)
		{
				j1.setText(j1.getText().concat("0"));
		}
		if(e.getSource()==bdec)
		{
				j1.setText(j1.getText().concat("."));
		}
		if(e.getSource()==badd)
		{
			a=Double.valueOf(j1.getText());
			op=1;
			j1.setText(" ");
		}
		if(e.getSource()==bsub)
		{
			a=Double.valueOf(j1.getText());
			op=2;
			j1.setText(" ");
		}
		if(e.getSource()==bmul)
		{
			a=Double.valueOf(j1.getText());
			op=3;
			j1.setText(" ");
		}
		if(e.getSource()==bdiv)
		{
			a=Double.valueOf(j1.getText());
			op=4;
			j1.setText(" ");
		}
		if(e.getSource()==beq)
		{
			b=Double.valueOf(j1.getText());
			switch(op)
			{
				case 1:
				res=a+b;
			    break;
				case 2:
				res=a-b;
				break;
				case 3:
				res=a*b;
				break;
				case 4:
				res=a/b;
				break;
			}
			j1.setText(""+res);
				
		}
	 }
	 
	 public static void main(String ar[])
	 {
	   new scalculator();
	  }
	 }
	 
  