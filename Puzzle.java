import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
public class Puzzle extends JFrame{
	JButton Next,b1,b2,b3,b4,b5,b6,b7,b8,b9;
	JTextField jf;
	
	public Puzzle(){
		super("PUZZLE_GAME");
		b1=new JButton("5");
		b1.setBackground(Color.GREEN);
		b1.setBounds(10,10,90,90);
		add(b1);
		b1.addActionListener(new A1());
		
		b2=new JButton("3");
		b2.setBounds(110,10,90,90);
		b2.setBackground(Color.GREEN);
		add(b2);
		b2.addActionListener(new A2());
		
		b3=new JButton("7");
		b3.setBounds(210,10,90,90);
		b3.setBackground(Color.GREEN);
		add(b3);
		b3.addActionListener(new A3());
		
		b4=new JButton(" ");
		b4.setBounds(10,110,90,90);
		b4.setBackground(Color.GREEN);
		add(b4);
		b4.addActionListener(new A4());
		
		b5=new JButton("4");
		b5.setBounds(110,110,90,90);
		b5.setBackground(Color.GREEN);
		add(b5);
		b5.addActionListener(new A5());
		
		b6=new JButton("8");
		b6.setBounds(210,110,90,90);
		b6.setBackground(Color.GREEN);
		add(b6);
		b6.addActionListener(new A6());
		
		b7=new JButton("6");
		b7.setBounds(10,210,90,90);
		b7.setBackground(Color.GREEN);
		add(b7);
		b7.addActionListener(new A7());
		
		b8=new JButton("2");
		b8.setBounds(110,210,90,90);
		b8.setBackground(Color.GREEN);
		add(b8);
		b8.addActionListener(new A8());
		
		b9=new JButton("1");
		b9.setBounds(210,210,90,90);
		b9.setBackground(Color.GREEN);
		add(b9);
		b9.addActionListener(new A9());
		
		Next = new JButton("NEXT_GAME");
		Next.setBounds(75,330,150,30);
		Next.setBackground(Color.CYAN);
		add(Next);
		Next.addActionListener(new A());
		
		jf = new JTextField();
		jf.setBounds(75, 370,150,30);
		jf.setBackground(Color.CYAN);
		add(jf);
		jf.setEditable(false);
		
		
		setBounds(10,10,450,550);
	 
		setLayout(null);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class A implements ActionListener{
		public void actionPerformed(ActionEvent e){
         if(e.getSource()==Next){
			 String s = b5.getText();
			 b5.setText(b1.getText());
			 b1.setText(s);
			 String s1= b6.getText();
			 b6.setText(b4.getText());
			 b4.setText(s1);
			 String s2 = b8.getText();
			 b8.setText(b5.getText());
			 b5.setText(s2);	 
			 String s3 = b5.getText();
			 b5.setText(b9.getText());
			 b9.setText(s3);
			 String s4= b7.getText();
			 b7.setText(b2.getText());
			 b2.setText(s4);
			 String s5 = b3.getText();
			 b3.setText(b7.getText());
			 b7.setText(s5);
			 
			b1.setEnabled(true);
		    b2.setEnabled(true);
		    b3.setEnabled(true);
		    b4.setEnabled(true);
		    b5.setEnabled(true);
		    b6.setEnabled(true);
		    b7.setEnabled(true);
		    b8.setEnabled(true);
		    b9.setEnabled(true);
			
		    jf.setText(" ");
			jf.setEditable(false);
			 
		 }
		}
	}
	
	public void setEnable(){
	b1.setEnabled(false);
	b2.setEnabled(false);
	b3.setEnabled(false);
	b4.setEnabled(false);
	b5.setEnabled(false);
	b6.setEnabled(false);
	b7.setEnabled(false);
	b8.setEnabled(false);
	b9.setEnabled(false);
}
	
	
	class A1 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b1){
				String s = b1.getText();
				if(b2.getText()==" "){
					b2.setText(s);
					b1.setText(" ");
				}
				else if(b4.getText()==" "){
					b4.setText(s);
					b1.setText(" ");
				}
			}
		}
	}
	
	class A2 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b2){
				String s = b2.getText();
				if(b1.getText()==" "){
					b1.setText(s);
					b2.setText(" ");
				}
				else if(b3.getText()==" "){
					b3.setText(s);
					b2.setText(" ");
				}
				else if(b5.getText()==" "){
					b5.setText(s);
					b2.setText(" ");
				}
			}
		}
	}
	
	class A3 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b3){
				String s = b3.getText();
				if(b2.getText()==" "){
					b2.setText(s);
					b3.setText(" ");
				}
				else if(b6.getText()==" "){
					b6.setText(s);
					b3.setText(" ");
				}
			}
		}
	}
	
	class A4 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b4){
				String s = b4.getText();
				if(b1.getText()==" "){
					b1.setText(s);
					b4.setText(" ");
				}
				else if(b5.getText()==" "){
					b5.setText(s);
					b4.setText(" ");
				}
				else if(b7.getText()==" "){
					b7.setText(s);
					b4.setText(" ");
				}
			}
		}
	}
	
	class A5 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b5){
				String s = b5.getText();
				if(b2.getText()==" "){
					b2.setText(s);
					b5.setText(" ");
				}
				else if(b4.getText()==" "){
					b4.setText(s);
					b5.setText(" ");
				}
				else if(b6.getText()==" "){
					b6.setText(s);
					b5.setText(" ");
				}else if(b8.getText()==" "){
					b8.setText(s);
					b5.setText(" ");
				}
			}
		}
	}
	
	
	class A6 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b6){
				String s = b6.getText();
				if(b3.getText()==" "){
					b3.setText(s);
					b6.setText(" ");
				}
				else if(b5.getText()==" "){
					b5.setText(s);
					b6.setText(" ");
				}
				else if(b9.getText()==" "){
					b9.setText(s);
					b6.setText(" ");
				}
			}
		}
	}
	
	
	class A7 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b7){
				String s = b7.getText();
				if(b8.getText()==" "){
					b8.setText(s);
					b7.setText(" ");
				}
				else if(b4.getText()==" "){
					b4.setText(s);
					b7.setText(" ");
				}
			}
		}
	}
	
	
	class A8 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b8){
				String s = b8.getText();
				if(b5.getText()==" "){
					b5.setText(s);
					b8.setText(" ");
				}
				else if(b7.getText()==" "){
					b7.setText(s);
					b8.setText(" ");
				}
				else if(b9.getText()==" "){
					b9.setText(s);
					b8.setText(" ");
				}
			}
		}
	}
	
	
	
	class A9 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b9){
			   String s = b9.getText();
			    if(b6.getText()==" "){
					b6.setText(s);
					b9.setText(" ");
				}
				else if(b8.getText()==" "){
					b8.setText(s);
					b9.setText(" ");
				}
				if(check()){
				jf.setText("YOU WON GAME ");
				setEnable();
			   }		
			   				
			}
		}
	}
	
	public boolean check(){
		if(b1.getText()=="1" && b2.getText()=="2" && b3.getText()=="3" && b4.getText()=="4" && b5.getText()=="5" && b6.getText()=="6" && b7.getText()=="7" && b8.getText()=="8"){
				return true;	
				}
				else{
					return false;
				}
	}

public static void main(String args[]){
	new Puzzle();
}
}