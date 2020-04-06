package PROJECT;
import java.awt.BorderLayout; 
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
	public abstract class fram1 implements ActionListener {
	public static void main(String[] args) {
		JTextField t1,t2;
	    JFrame f=new JFrame("book store");
	    JLabel l1;
	    l1=new JLabel("*****ONLINE BOOK STORE*****");  
	      l1.setBounds(450,100, 250,80);  
	      f.add(l1);
	            JLabel c=new JLabel("USERNAME:"); 
	            t1=new JTextField(" ");
			    t1.setBounds(500,340,150,30);  
			    f.add(t1);
			    JLabel b1=new JLabel("PASSWORD:"); 
			    t2=new JTextField(" ");
			    t2.setBounds(500,250,150,30);
			    f.add(t2);
	            c.setBounds(410,245,200,50);
			    f.add(c);                   
			    b1.setBounds(410,330,200,50);
			    f.add(b1);
			    JButton r1=new JButton("login"); 
			    r1.setBounds(400,400, 100,30);
			    f.add(r1);
			    JButton r2=new JButton("create account"); 
			    r2.setBounds(550,400, 130,30);
			    f.add(r2);
			    f.setSize(400,400);  
			    f.setLayout(null);  
			    f.setVisible(true);   
			    f.add(r1);
			    JLabel background=new JLabel(new ImageIcon("C:\\Users\\sri\\Downloads\\cub.gif"));
			    f.add(background);
			    background.setBounds(200,180,100,100);
			    background.setSize(705,460);
			    r1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
			    JOptionPane.showMessageDialog(r1,"loginSuccessfully");			    
					}});	
			    
			    
			    
			    
			    
			    
			    //login button connection
			    r1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					
							JFrame f=new JFrame("book store");
						      JLabel c1=new JLabel("author:Byrne Rhonda");
						      JLabel c2=new JLabel("prize:200/-"); 
						      JLabel d1=new JLabel("author:Bhinder Shravya");
						      JLabel d2=new JLabel("prize:400/-");
						      JLabel d11=new JLabel("author:Anthony Doerr");
						      JLabel d21=new JLabel("prize:370/-");
						      JLabel e1=new JLabel("author:J.K. Rowling");
						      JLabel e11=new JLabel("prize:600/-");
						      JLabel A=new JLabel("BOOK");
						      JLabel B=new JLabel("AUTHOUR");
						      JLabel B1=new JLabel("PRIZE");
						      A.setBounds(470,520,150,80);
							    f.add(A);
							    B.setBounds(660,520,150,80);
							    f.add(B);
							    B1.setBounds(800,520,150,80);
							    f.add(B1);
						      c1.setBounds(100,430,150,80);
							    f.add(c1);                   
							    c2.setBounds(100,450,150,80);
							    f.add(c2);
							    d1.setBounds(390,430,150,80);
							    f.add(d1);
							    d2.setBounds(390,450,150,80);
							    f.add(d2);
							    d11.setBounds(690,430,150,80);
							    f.add(d11);
							    d21.setBounds(690,450,150,80);
							    f.add(d21);
							    e1.setBounds(1020,430,150,80);
							    f.add(e1);
							    e11.setBounds(1020,450,150,80);
							    f.add(e11);
							    
						        f.setSize(400,400);  
							    f.setLayout(null);  
							    f.setVisible(true);   
							    JLabel background=new JLabel(new ImageIcon("C:\\Users\\sri\\Downloads\\9book.jpeg"));
							    f.add(background);
							    background.setBounds(05,30,80,80);
							    background.setSize(400,400);
							    JLabel background1=new JLabel(new ImageIcon("C:\\Users\\sri\\Downloads\\8book.jpeg"));
							    f.add(background1);
							    background1.setBounds(290,30,80,80);
							    background1.setSize(400,400);
							    JLabel background11=new JLabel(new ImageIcon("C:\\Users\\sri\\Downloads\\b1.jpg"));
							    f.add(background11);
							    background11.setBounds(590,30,80,80);
							    background11.setSize(400,400);
							    JLabel background111=new JLabel(new ImageIcon("C:\\Users\\sri\\Downloads\\7book.jpg"));
							    f.add(background111);
							    background111.setBounds(960,30,80,80);
							    background111.setSize(400,400);
						        Choice c=new Choice();  
					            c.setBounds(400,600,190,30);    
					            c.add("THE MAGIC");  
					            c.add("SOMETHING I NEVER TOLD YOU");  
					            c.add("ALL THE NIGHT WE CANNOY SEE");
					            c.add(" HARRY POTTER"); 
					            f.add(c);  
					            f.setSize(400,400);  
					            f.setLayout(null);  
					            f.setVisible(true);  
					            f.setSize(900,900);  
					            f.setLayout(null);  
					            f.setVisible(true); 
					            Choice c11=new Choice();  
					            c11.setBounds(620,600,140,30);  
					            c11.add("Byrne Rhonda");  
					            c11.add("Bhinder Shravya");  
					            c11.add("Anthony Doerr"); 
					            c11.add("J.K. Rowling"); 
					            f.add(c11);  
					            f.setLayout(null);  
					            f.setVisible(true);  
					            f.setSize(400,400);
					            Choice c21=new Choice();  
					            c21.setBounds(780,600,140,30);  
					            c21.add("200/-");  
					            c21.add("400/-");  
					            c21.add("370/-"); 
					            c21.add("600/-");
					            f.add(c21);  
					            f.setLayout(null);  
					            f.setVisible(true);  
					            f.setSize(600,600);
					            JButton b=new JButton("Submit");    
					            b.setBounds(650,700,100,30);
					            f.add(b);
                        f.setLayout(new BorderLayout());
                        b.addActionListener(new ActionListener() {
                        	public void actionPerformed(ActionEvent e) {
                        		JOptionPane.showMessageDialog(b,"please enter your details");
                        
                        	}
                        });
                        
                        
                        //login frame connection
                        b.addActionListener(new ActionListener() {
                        	public void actionPerformed(ActionEvent e) {
                        		JTextField t111=null;
                        		JTextField t222=null;
                        		JTextField t71=null;
                        		JTextField t444=null;
                        		JTextField t555=null;
                        		JTextField t666=null;
                        		JTextField t777=null;
                        		JTextField t888=null;
                        		JTextField t999=null;
                        		JTextField t10=null;
                        		JTextField t11=null;
                        		JTextField t12=null;
                        		JTextField t13=null;
                        		JFrame f=new JFrame("onlilne book store");
                        		JLabel b=new JLabel("First Name:");
                        		t111=new JTextField(" ");
                        		t111.setBounds(350,100,150,30);
                        		f.add(t111);
                        		JLabel b1=new JLabel ("Last Name:");
                        		t222=new JTextField(" ");
                        		t222.setBounds(350,150,150,30);
                        		f.add(t222);
                        		b.setBounds(200,100,150,30);
                        		f.add(b);
                        		b1.setBounds(200,150,150,30);
                        		f.add(b1);
                        		JLabel b2=new JLabel("E-Mail:");
                        		t71=new JTextField(" ");
                        		t71.setBounds(350,200,150,30);
                        		f.add(t71);
                        		JLabel b3=new JLabel("password:");
                        		t444=new JTextField(" ");
                        		t444.setBounds(350,250,150,30);
                        		f.add(t444);
                        		JLabel b4=new JLabel("phone number:");
                        		t555=new JTextField(" ");
                        		t555.setBounds(350,300,150,30);
                        		f.add(t555);
                        		b2.setBounds(200,200,150,30);
                        		f.add(b2);
                        		b3.setBounds(200,250,150,30);
                        		f.add(b3);
                        		b4.setBounds(200,300,150,30);
                        		f.add(b4);
                        		JLabel z=new JLabel("village Name:");
                        		t666=new JTextField(" ");
                        		t666.setBounds(350,350,150,30);
                        		f.add(t666);
                        		JLabel z1=new JLabel ("street:");
                        		t777=new JTextField(" ");
                        		t777.setBounds(350,400,150,30);
                        		f.add(t777);
                        		z.setBounds(200,350,150,30);
                        		f.add(z);
                        		z1.setBounds(200,400,150,30);
                        		f.add(z1);
                        		JLabel z2=new JLabel("Door number:");
                        		t888=new JTextField(" ");
                        		t888.setBounds(350,450,150,30);
                        		f.add(t888);
                        		JLabel z3=new JLabel("Mandal:");
                        		t999=new JTextField(" ");
                        		t999.setBounds(350,500,150,30);
                        		f.add(t999);
                        		JLabel z4=new JLabel("district:");
                        		t10=new JTextField(" ");
                        		t10.setBounds(350,550,150,30);
                        		f.add(t10);
                        		JLabel b5=new JLabel("pin code");
                        		t11=new JTextField(" ");
                        		t11.setBounds(350,600,150,30);
                        		f.add(t11);
                        		JLabel b6=new JLabel("state");
                        		t12=new JTextField(" ");
                        		t12.setBounds(350,650,150,30);
                        		f.add(t12);
                        		JLabel b7=new JLabel("Aadhar no:");
                        		t13=new JTextField(" ");
                        		t13.setBounds(350,700,150,30);
                        		f.add(t13);
                        		z2.setBounds(200,450,150,30);
                        		f.add(z2);
                        		z3.setBounds(200,500,150,30);
                        		f.add(z3);
                        		z4.setBounds(200,550,150,30);
                        		f.add(z4);
                        		b5.setBounds(200,600,150,30);
                        		f.add(b5);
                        		b6.setBounds(200,650,150,30);
                        		f.add(b6);
                        		b7.setBounds(200,700,150,30);
                        		f.add(b7);
                        		JButton r1=new JButton("order");
                        		r1.setBounds(250,750,150,30);
                        		f.add(r1);
                        		r1.addActionListener(new ActionListener() {
                        			public void actionPerformed(ActionEvent e) {
                        				JOptionPane.showMessageDialog(b,"YOUR ORDER IS CONFORMED THANKYOU FOR ORDERING ARE U ENJOYING THIS");			    
                        			}});
			
                        		JLabel background=new JLabel(new ImageIcon("C:\\Users\\sri\\Downloads\\giphy.gif"));
                        		f.add(background);
                        		background.setBounds(450,70,400,400);
                        		background.setSize(705,460);		
                        		f.setSize(400,400);
                        		f.setLayout(null);
                        		f.setVisible(true);	
                        		
        								

                        		//create account frame 
                        		r2.addActionListener(new ActionListener() {
                        			public void actionPerformed(ActionEvent e) {
                        				JTextField t1,t2,t3,t4,t5,t6;
                        				JFrame f=new JFrame ("BOOK STORE");
                        				JLabel b=new JLabel("First Name:");
                        				t1=new JTextField(" ");
                        				t1.setBounds(350,100,150,30);
                        				f.setSize(600,600);
                        				f.setLayout(null);
                        				f.setVisible(true);
                        				f.add(t1);
                        				JLabel b1=new JLabel ("Last Name:");
                        				t2=new JTextField(" ");
                        				t2.setBounds(350,150,150,30);
                        				f.add(t2);
                        				b.setBounds(200,100,150,30);
                        				f.add(b);
                        				b1.setBounds(200,150,150,30);
                        				f.add(b1);
                        				JLabel b2=new JLabel("E-Mail:");
                        				t3=new JTextField(" ");
                        				t3.setBounds(350,200,150,30);
                        				f.add(t3);
                        				JLabel b3=new JLabel("password:");
                        				t4=new JTextField(" ");
                        				t4.setBounds(350,250,150,30);
                        				f.add(t4);
                        				JLabel b4=new JLabel("phone number:");
                        				t5=new JTextField(" ");
                        				t5.setBounds(350,300,150,30);
                        				f.add(t5);
                        				b2.setBounds(200,200,150,30);
                        				f.add(b2);
                        				b3.setBounds(200,250,150,30);
                        				f.add(b3);
                        				b4.setBounds(200,300,150,30);
                        				f.add(b4);
                        				JLabel b8=new JLabel("Aadhar no:");
                        				b8.setBounds(200,350,150,30);
                        				f.add(b8);
                        				t6=new JTextField(" ");
                        				t6.setBounds(350,350,150,30);
                        				f.add(t6);
                        				Checkbox checkbox1 = new Checkbox("Male");  
                        				checkbox1.setBounds(510, 450,70,40);  
                        				Checkbox checkbox2 = new Checkbox("Female");  
                        				checkbox2.setBounds(630,450, 70,40);  
                        				f.add(checkbox1);  
                        				f.add(checkbox2);  
                        				JRadioButton r11=new JRadioButton(" ABOVE 18 YEARS"); 
                        				r11.setBounds(600,350,180,40);    
                        				ButtonGroup bg=new ButtonGroup();    
                        				bg.add(r11);   
                        				f.add(r11);
                        				JLabel j1=new JLabel("DATE OF BIRTH:");
                        				j1.setBounds(600,20,120,180);
                        				f.add(j1);
                        				JLabel j13=new JLabel("DATE:");j13.setBounds(600,140,70,30);
                        				j13.setFont(new Font("Courier New",Font.ITALIC,20));
                        				String date1[]= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
                        				final JComboBox dm=new JComboBox(date1);
                        				dm.setBounds(700,140,70,30);
                        				dm.setFont(new Font("Courier New",Font.ITALIC,20));
                        				f.add(j13);
                        				f.add(dm);
                        				JLabel j14=new JLabel("MONTH:");j14.setBounds(600,200,90,30);
                        				j14.setFont(new Font("Courier New",Font.ITALIC,20));
                        				String num[]= {"jan","feb","mar","april","may","june","july","aug","sept","oct","nov","dec"};
                        				final JComboBox cm=new JComboBox(num);
                        				cm.setBounds(700,200,90,30);
                        				cm.setFont(new Font("Courier New",Font.ITALIC,20));	
                        				f.add(j14);
                        				f.add(cm);	
                        				JLabel j141=new JLabel("year:");j141.setBounds(600,270,90,30);
					    	j141.setFont(new Font("Courier New",Font.ITALIC,20));
					    		String num1[]= {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010"};
					    		final JComboBox cm1=new JComboBox(num1);
					    		cm1.setBounds(700,270,90,30);
					    		cm1.setFont(new Font("Courier New",Font.ITALIC,20));	
					    	f.add(j141);
					    		f.add(cm1);
				    		JButton r1=new JButton("create");
							r1.setBounds(250,400,150,30);
							f.add(r1);
							r1.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
						    JOptionPane.showMessageDialog(b,"YOUR ACCOUNT CREATED SUCCESSFULLY");		
						    try {
				    			FileWriter obj = new FileWriter("C:\\Users\\sri\\Desktop\\JAVA.txt");
				    			  String a=t1.getText();
				    			  String b1=t2.getText();
				    			  String c11=t3.getText();
				    			  String d=t4.getText();
				    			  String e1=t5.getText();
				    			  String e2=t6.getText();
			 
				    			  obj.write(" FIRST NAME:"+a+"LAST NAME:"+b1+"EMAIL:"+c11+"password:"+d+"phone number:"+e1+"Aadhar no:");
				    			  obj.close();
				    			}catch(IOException  e1) {
				    					e1.printStackTrace();
				    			}
								}});

							
						
						
						
						
						
						///create account 3rd frame
						r1.addActionListener(new ActionListener() {
					    	public void actionPerformed(ActionEvent e) {
					    		
					    					  JFrame f=new JFrame("book store");
					    				      JLabel c1=new JLabel("author:Byrne Rhonda");
					    				      JLabel c2=new JLabel("prize:200/-"); 
					    				      JLabel d1=new JLabel("author:Bhinder Shravya");
					    				      JLabel d2=new JLabel("prize:400/-");
					    				      JLabel d11=new JLabel("author:Anthony Doerr");
					    				      JLabel d21=new JLabel("prize:370/-");
					    				      JLabel e1=new JLabel("author:J.K. Rowling");
					    				      JLabel e11=new JLabel("prize:600/-");
					    				      JLabel A=new JLabel("BOOK");
					    				      JLabel B=new JLabel("AUTHOUR");
					    				      JLabel B1=new JLabel("PRIZE");
					    				      A.setBounds(470,520,150,80);
					    					    f.add(A);
					    					    B.setBounds(660,520,150,80);
					    					    f.add(B);
					    					    B1.setBounds(800,520,150,80);
					    					    f.add(B1);
					    				      c1.setBounds(100,430,150,80);
					    					    f.add(c1);                   
					    					    c2.setBounds(100,450,150,80);
					    					    f.add(c2);
					    					    d1.setBounds(390,430,150,80);
					    					    f.add(d1);
					    					    d2.setBounds(390,450,150,80);
					    					    f.add(d2);
					    					    d11.setBounds(690,430,150,80);
					    					    f.add(d11);
					    					    d21.setBounds(690,450,150,80);
					    					    f.add(d21);
					    					    e1.setBounds(1020,430,150,80);
					    					    f.add(e1);
					    					    e11.setBounds(1020,450,150,80);
					    					    f.add(e11);
					    				        f.setSize(400,400);  
					    					    f.setLayout(null);  
					    					    f.setVisible(true);   
					    					    JLabel background=new JLabel(new ImageIcon("C:\\Users\\sri\\Downloads\\9book.jpeg"));
					    					    f.add(background);
					    					    background.setBounds(05,30,80,80);
					    					    background.setSize(400,400);
					    					    JLabel background1=new JLabel(new ImageIcon("C:\\Users\\sri\\Downloads\\8book.jpeg"));
					    					    f.add(background1);
					    					    background1.setBounds(290,30,80,80);
					    					    background1.setSize(400,400);
					    					    JLabel background11=new JLabel(new ImageIcon("C:\\Users\\sri\\Downloads\\b1.jpg"));
					    					    f.add(background11);
					    					    background11.setBounds(590,30,80,80);
					    					    background11.setSize(400,400);
					    					    JLabel background111=new JLabel(new ImageIcon("C:\\Users\\sri\\Downloads\\7book.jpg"));
					    					    f.add(background111);
					    					    background111.setBounds(960,30,80,80);
					    					    background111.setSize(400,400);
					    				        Choice c=new Choice();  
					    			            c.setBounds(400,600,190,30);    
					    			            c.add("THE MAGIC");  
					    			            c.add("SOMETHING I NEVER TOLD YOU");  
					    			            c.add("ALL THE NIGHT WE CANNOY SEE");
					    			            c.add(" HARRY POTTER"); 
					    			            f.add(c);  
					    			            f.setSize(400,400);  
					    			            f.setLayout(null);  
					    			            f.setVisible(true);  
					    			            f.setSize(900,900);  
					    			            f.setLayout(null);  
					    			            f.setVisible(true); 
					    			            Choice c11=new Choice();  
					    			            c11.setBounds(620,600,140,30);  
					    			            c11.add("Byrne Rhonda");  
					    			            c11.add("Bhinder Shravya");  
					    			            c11.add("Anthony Doerr"); 
					    			            c11.add("J.K. Rowling"); 
					    			            f.add(c11);  
					    			            f.setLayout(null);  
					    			            f.setVisible(true);  
					    			            f.setSize(400,400);
					    			            Choice c21=new Choice();  
					    			            c21.setBounds(780,600,140,30);  
					    			            c21.add("200/-");  
					    			            c21.add("400/-");  
					    			            c21.add("370/-"); 
					    			            c21.add("600/-");
					    			            f.add(c21);  
					    			            f.setLayout(null);  
					    			            f.setVisible(true);  
					    			            f.setSize(600,600);
					    			            JButton b=new JButton("Submit");    
					    			            b.setBounds(650,700,100,30);
					    			            f.add(b);
									 f.setLayout(new BorderLayout());
									    b.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
									    JOptionPane.showMessageDialog(b,"please enter your details");
									    r2.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
									    JOptionPane.showMessageDialog(b,"YOUR ACCOUNT CREATED SUCCESSFULLY");		
									    try {
							    			FileWriter obj = new FileWriter("C:\\Users\\sri\\Desktop\\bookinformation.txt");
							    			  String a=t1.getText();
							    			  String b1=t2.getText();
							    			  String c11=t3.getText();
							    			  String d=t4.getText();
							    			  String e1=t5.getText();
							    			  String e2=t6.getText();
						 
							    			  obj.write(" FIRST NAME:"+a+"LAST NAME:"+b1+"EMAIL:"+c11+"password:"+d+"phone number:"+e1+"Aadhar no");
							    			  obj.close();
							    			}catch(IOException  e1) {
							    					e1.printStackTrace();
							    			}
											}});
																	    
						   
					    
					    //create account 4th frame
					    b.addActionListener(new ActionListener() {
					    	public void actionPerformed(ActionEvent e) {
					    		JTextField t1=null;
								JTextField t2=null;
								JTextField t3=null;
								JTextField t4=null;
								JTextField t5=null;
								JTextField t6=null;
								JTextField t7=null;
								JFrame f=new JFrame("ONLINE BOOK STORE");
								JLabel b=new JLabel("First Name:");
								t1=new JTextField(" ");
								t1.setBounds(350,100,150,30);
								f.add(t1);
								JLabel b1=new JLabel ("Last Name:");
								t2=new JTextField(" ");
								t2.setBounds(350,150,150,30);
								f.add(t2);
								b.setBounds(200,100,150,30);
								f.add(b);
								b1.setBounds(200,150,150,30);
								f.add(b1);
								JLabel b2=new JLabel("E-Mail:");
								t3=new JTextField(" ");
								t3.setBounds(350,200,150,30);
								f.add(t3);
								JLabel b3=new JLabel("password:");
								t4=new JTextField(" ");
								t4.setBounds(350,250,150,30);
								f.add(t4);
								JLabel b4=new JLabel("phone number:");
								t5=new JTextField(" ");
								t5.setBounds(350,300,150,30);
								f.add(t5);
								b2.setBounds(200,200,150,30);
								f.add(b2);
								b3.setBounds(200,250,150,30);
								f.add(b3);
								b4.setBounds(200,300,150,30);
								f.add(b4);
								JLabel z=new JLabel("village Name:");
								t1=new JTextField(" ");
								t1.setBounds(350,350,150,30);
								f.add(t1);
								JLabel z1=new JLabel ("street:");
								t2=new JTextField(" ");
								t2.setBounds(350,400,150,30);
								f.add(t2);
								z.setBounds(200,350,150,30);
								f.add(z);
								z1.setBounds(200,400,150,30);
								f.add(z1);
								JLabel z2=new JLabel("Door number:");
								t3=new JTextField(" ");
								t3.setBounds(350,450,150,30);
								f.add(t3);
								JLabel z3=new JLabel("Mandal:");
								t4=new JTextField(" ");
								t4.setBounds(350,500,150,30);
								f.add(t4);
								JLabel z4=new JLabel("district:");
								t5=new JTextField(" ");
								t5.setBounds(350,550,150,30);
								f.add(t5);
								JLabel b5=new JLabel("pin code");
								t6=new JTextField(" ");
								t6.setBounds(350,600,150,30);
								f.add(t6);
								JLabel b6=new JLabel("state");
								t7=new JTextField(" ");
								t7.setBounds(350,650,150,30);
								f.add(t7);
								JLabel b8=new JLabel("Aadhar no:");
                				b8.setBounds(200,700,150,30);
                				f.add(b8);
                				t6=new JTextField(" ");
                				t6.setBounds(350,700,150,30);
                				f.add(t6);
								z2.setBounds(200,450,150,30);
								f.add(z2);
								z3.setBounds(200,500,150,30);
								f.add(z3);
								z4.setBounds(200,550,150,30);
								f.add(z4);
								b5.setBounds(200,600,150,30);
								f.add(b5);
								b6.setBounds(200,650,150,30);
								JButton r1=new JButton("order");
								r1.setBounds(250,700,150,30);
								f.add(r1);
								f.setSize(400,400);
								f.setLayout(null);
								f.setVisible(true);	
								r1.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
							    JOptionPane.showMessageDialog(b,"YOUR ORDER IS CONFORMED THANKYOU FOR ORDERING ARE U ENJOYING THIS");			    
									}});
					    	}
					    });
											}
									    
					    	});
									   
					    	}
						});
                        			}
                        		});
                        	}
                        });
			    }
			    });
	}
	}
	
	
                        
                        		
	
			    
                        
	
			    
