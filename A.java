package ghumo;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;


import  javax.swing.*;

public class A {
	 private static final int NULL = 0;


	//second function
	 /*
	  * 
	  * 
	  */
	
	 public static void second() {
		JFrame frame2  = new JFrame("PLACES");
		frame2.setBounds(400, 140, 600, 400);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		frame2.getContentPane().setBackground(Color.pink);

		
		
		JLabel lblNewLabel = new JLabel("EXPLORE  AMAZING  PLACES");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(80, 11, 324, 34);
		frame2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("With - GhumoYarro");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(303, 44, 191, 40);
		frame2.add(lblNewLabel_1);
		
		String[] items = {"bihar","aurangabad","delhi","gujarat","bihar","aurangabad","delhi","gujarat","bihar","aurangabad","delhi","gujarat"};

		
		JList<String> list = new JList<>(items);
		JPanel panel = new JPanel();
		panel.add(new JScrollPane(list));
		panel.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.setBounds(130, 100, 100, 171);
		frame2.add(panel);
		
		frame2.revalidate();
		
//		list.addMouseListener(new MouseAdapter() {
//			
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				
//			}
//		});
	
		
		JButton btnNewButton = new JButton("<- Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				frame2.dispose();
				first();
			}
		});
		btnNewButton.setBounds(63, 300, 110, 30);
		frame2.add(btnNewButton);

		
		frame2.setVisible(true);

		
	}
	 
	 //first function
	 /*
	  * 
	  * 
	  */
	 
	public static void first() {
		JFrame frame = new JFrame("GhumoYarro");
		frame.setBounds(400, 140, 600, 400);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.PINK);
		
		JLabel lblNewLabel = new JLabel("GhumoYarro");
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(145, 21, 281, 44);
		frame.getContentPane().add(lblNewLabel);
		
		JButton planBtn = new JButton("MAKE   A  TRIP");
		planBtn.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		planBtn.setBounds(130, 235, 305, 44);
		frame.getContentPane().add(planBtn);
		planBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				third();
			}
		});
		
		JButton historyBtn = new JButton("HISTORY");
		historyBtn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		historyBtn.setBounds(350, 120, 140, 45);
		frame.getContentPane().add(historyBtn);
		historyBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				history();
			}
			
		});
		
		JButton placeBtn = new JButton("PLACES");
		placeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				 second();
			}
		});
		placeBtn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		placeBtn.setBounds(90, 120, 140, 45);
		frame.getContentPane().add(placeBtn);
		
		frame.setVisible(true);
	}
	

	 //THIRD function
	 /*
	  * 
	  * 
	  */
	
	public static void third() {
		JFrame frame3  = new JFrame("Planning");
		frame3.setBounds(400, 140, 600, 400);
		frame3.setResizable(false);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.getContentPane().setLayout(null);		
		frame3.getContentPane().setBackground(Color.pink);
		
		JLabel lblNewLabel_1 = new JLabel("MAKE  A  PLAN");
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(106, 20, 342, 25);
		frame3.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DESTINATION   STATE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(81, 84, 178, 25);
		frame3.getContentPane().add(lblNewLabel_2);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(285, 84, 205, 25);
		comboBox.addItem("SELECT STATE");
		comboBox.addItem("BIHAR");
		comboBox.addItem("RAJASTHAN");
		comboBox.addItem("PUNJAB");
		comboBox.addItem("DELHI");
		comboBox.addItem("U.P");
		frame3.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("DESTINATION  CITY");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(81, 150, 178, 25);
		frame3.getContentPane().add(lblNewLabel_3);
		
		JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.setBounds(285, 150, 205, 25);
		comboBox_2.addItem(null);
		frame3.getContentPane().add(comboBox_2);
		
		comboBox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(comboBox.getSelectedItem().equals("SELECT STATE")) {
					comboBox_2.removeAllItems();
				}
				else if(comboBox.getSelectedItem().equals("BIHAR")) {
					    comboBox_2.removeAllItems();
						comboBox_2.addItem("SELECT CITY");
						comboBox_2.addItem("Bodhgaya");
						comboBox_2.addItem("gaya");
						comboBox_2.addItem("patna");
						comboBox_2.addItem("dobhi");
						comboBox_2.addItem("hajaribagh");
						comboBox_2.addItem("lapataganj");
						comboBox_2.addItem("nandpur");
					}
				else if(comboBox.getSelectedItem().equals("RAJASTHAN")) {
				    comboBox_2.removeAllItems();
					comboBox_2.addItem("SELECT CITY");
					comboBox_2.addItem("jaipur");
				}
				else if(comboBox.getSelectedItem().equals("PUNJAB")) {
				    comboBox_2.removeAllItems();
					comboBox_2.addItem("SELECT CITY");
					comboBox_2.addItem("ludhiana");
				}
				else if(comboBox.getSelectedItem().equals("U.P")) {
				    comboBox_2.removeAllItems();
					comboBox_2.addItem("SELECT CITY");
					comboBox_2.addItem("agra");
					comboBox_2.addItem("ayodhya");
					comboBox_2.addItem("varansi");
				}
				else {
					comboBox_2.removeAllItems();
					comboBox_2.addItem("SELECT CITY");
					comboBox_2.addItem("noida");
					comboBox_2.addItem("purani delhi");
				}
				
			}
			
		});
      
		
		JButton btnNewButton = new JButton("SEARCH  DESTINATION");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((comboBox_2.getSelectedItem() == null) || (comboBox_2.getSelectedItem().equals("SELECT CITY"))) {
					JOptionPane.showMessageDialog(null, "please select city");
				}
				else {
					  frame3.dispose();
                      fourth(comboBox.getSelectedItem().toString(),comboBox_2.getSelectedItem().toString(),4500);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(202, 225, 190, 38);
		frame3.getContentPane().add(btnNewButton);

		JButton btnNewButton_2 = new JButton("<- Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				frame3.dispose();
				first();
			}
		});
		btnNewButton_2.setBounds(63, 300, 110, 30);
		frame3.add(btnNewButton_2);
		
		
		frame3.setVisible(true);
	}
	
	/*  Fourth Frame
	 * 
	 * 
	 * 
	 */
	public static void fourth(String s , String c,int fare) {
		JFrame frame = new JFrame("Plans");
		frame.setBounds(400, 140, 600, 400);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.PINK);
		frame.setVisible(true);
		
		JLabel l1 = new JLabel("FACILTIES");
		l1.setBounds(225,25,120,40);
		l1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		frame.add(l1);
		
		JLabel l2 = new JLabel("ROOM - ");
		l2.setBounds(100,80,120,30);
		l2.setForeground(Color.BLACK);
		l2.setFont(new Font("Tahoma", Font.ITALIC | Font.BOLD , 15));
		frame.add(l2);
		
		JRadioButton r1 = new JRadioButton("A.C");
		r1.setBounds(100,110,70,30);
		r1.setBackground(Color.pink);
		r1.setFont(new Font("Tahoma", Font.BOLD , 13));
		frame.add(r1);
		
		JRadioButton r2 = new JRadioButton("NON - A.C");
		r2.setBounds(190,110,120,30);
		r2.setSelected(true);
		r2.setBackground(Color.pink);
		r2.setFont(new Font("Tahoma", Font.BOLD , 13));
		frame.add(r2);
		
		r1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(r1.isSelected()) {
					r2.setSelected(false);
				}
				else {
					r2.setSelected(true);
				}
			}
			
		});
		r2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(r2.isSelected()) {
					r1.setSelected(false);
				}
				else {
					r2.setSelected(true);
				}
			}
			
		});
		
		

		JLabel l3 = new JLabel("FACILTY YOU WANT -");
		l3.setBounds(100,140,300,30);
		l3.setForeground(Color.BLACK);
		l3.setFont(new Font("Tahoma", Font.ITALIC | Font.BOLD , 15));
		frame.add(l3);
		
		JCheckBox b1 = new JCheckBox("FOOD");
		b1.setBounds(100,175,60,30);
		b1.setBackground(Color.pink);
		b1.setFont(new Font("Tahoma", Font.BOLD , 13));
		frame.add(b1);
		
		JCheckBox b2 = new JCheckBox("GUIDE");
		b2.setBounds(100,195,90,30);
		b2.setBackground(Color.pink);
		b2.setFont(new Font("Tahoma", Font.BOLD , 13));
		frame.add(b2);
		
		JCheckBox b3 = new JCheckBox("PHOTOGRAPHER");
		b3.setBounds(100,220,140,30);
		b3.setBackground(Color.pink);
		b3.setFont(new Font("Tahoma", Font.BOLD , 13));
		frame.add(b3);
		
		JButton btn = new JButton("ENTER");
		btn.setBounds(230,250,120,40);
		btn.setFont(new Font("Tahoma", Font.BOLD , 13));
        frame.add(btn);
        
        btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int amount = 0;
				if(r1.isSelected()) {
					amount += 1500;
				}
				else {
					amount+=500;
				}
				
				if(b1.isSelected()) {
					amount += 1000;
				}

				if(b2.isSelected()) {
					amount += 1000;
				}

				if(b3.isSelected()) {
					amount += 500;
				}
				int b = JOptionPane.showConfirmDialog(null, (amount+fare)+" per Person", "Do You Want to Continue", 0);		
				if(b == 0) {
					frame.dispose();
					fifth(amount+fare);
				}
			}
        	
        });
		
		
		
		
		JButton btnNewButton_2 = new JButton("<- Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				frame.dispose();
				third();
			}
		});
		btnNewButton_2.setBounds(63, 300, 110, 30);
		frame.add(btnNewButton_2);
		
	}

	
	/* Fifth Frame
	 * 
	 * 
	 * 
	 */
	public static void fifth(int amount) {
		JFrame frame  = new JFrame("FORM");
		frame.setBounds(400, 140, 600, 400);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);		
		frame.getContentPane().setBackground(Color.pink);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Tour Form");
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(145, 21, 281, 44);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel l1 = new JLabel(" Name ");
		l1.setBounds(100,65,120,30);
		l1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 15));
		frame.add(l1);
		
		JTextField t1 = new JTextField("");
		t1.setBounds(170,65,190,27);
		t1.setFont(new Font("Sylfaen", Font.BOLD , 15));
		frame.add(t1);
		
		JRadioButton r1 = new JRadioButton("MALE");
		r1.setBounds(100,95,70,30);
		r1.setBackground(Color.pink);
		frame.add(r1);
		

		JRadioButton r2 = new JRadioButton("FEMALE");
		r2.setBounds(220,95,70,30);
		r2.setBackground(Color.pink);
		frame.add(r2);
		

		JRadioButton r3 = new JRadioButton("OTHER");
		r3.setBounds(340,95,70,30);
		r3.setBackground(Color.pink);
		frame.add(r3);
		
		r1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(r2.isSelected() || r3.isSelected()) {
					r2.setSelected(false);
					r3.setSelected(false);
				}
			}
		});
		
		r2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(r1.isSelected() || r3.isSelected()) {
					r1.setSelected(false);
					r3.setSelected(false);
				}
			}
		});
		
		r3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(r1.isSelected() || r2.isSelected()) {
					r2.setSelected(false);
					r1.setSelected(false);
				}
			}
		});
		
		JLabel l2 = new JLabel("Guardian Name ");
		l2.setBounds(40,135,120,30);
		l2.setFont(new Font("Sylfaen", Font.BOLD , 15));
		frame.add(l2);
		
		JTextField t2 = new JTextField("");
		t2.setBounds(170,135,190,27);
		t2.setFont(new Font("Sylfaen", Font.BOLD , 15));
		frame.add(t2);
		
		JLabel l3 = new JLabel("Mobile No.");
		l3.setBounds(60,175,120,30);
		l3.setFont(new Font("Sylfaen", Font.BOLD , 15));
		frame.add(l3);
		
		JTextField t3 = new JTextField("");
		t3.setBounds(170,175,190,27);
		t3.setFont(new Font("Sylfaen", Font.BOLD , 15));
		frame.add(t3);
		

		JLabel l4 = new JLabel("Address");
		l4.setBounds(80,215,120,30);
		l4.setFont(new Font("Sylfaen", Font.BOLD , 15));
		frame.add(l4);
		
		JTextField t4 = new JTextField("");
		t4.setBounds(170,215,190,27);
		t4.setFont(new Font("Sylfaen", Font.BOLD , 15));
		frame.add(t4);
		
		JButton btn = new JButton("Payment");
		btn.setBounds(210,255,120,30);
		frame.add(btn);
		btn.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		
	    btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(t1.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter Your Name");
				}
				else if(t2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter Your Guardian Name");
				}
				else if(!r1.isSelected()&& !r2.isSelected()  &&  !r3.isSelected()) {
					JOptionPane.showMessageDialog(null, "Please Choose your gender");
				}
				else if(t3.getText().length() != 10) {
					JOptionPane.showMessageDialog(null, "Please Enter Your 10 digit Mobile No.");
				}
				else if(t4.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter Your Address");
				}
				else {
					  frame.dispose();
			           sixth(amount,t1.getText().toString(),t2.getText().toString(),t4.getText().toString(),t3.getText().toString());
				}
           
}
	    	
	    });	
		
	    JButton btnNewButton_2 = new JButton("<- Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				frame.dispose();
				fourth("","",0);
			}
		});
		btnNewButton_2.setBounds(63, 300, 110, 30);
		frame.add(btnNewButton_2);
		
		
	}
	
	/*  Sixth Frame
	 * 
	 * 
	 * 
	 */
	public static int sixth(int amount,String name,String Gname,String address,String mobile) {

	
		JFrame frame = new JFrame("Payment");
		frame.setBounds(400, 140, 600, 400);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);		
		frame.getContentPane().setBackground(Color.pink);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Payment");
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(145, 21, 281, 44);
		frame.getContentPane().add(lblNewLabel);
		
		
		JLabel l1 = new JLabel("Choose Payment Method -");
		l1.setFont(new Font("Sylfaen", Font.BOLD , 18));
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setBounds(20, 55, 281, 30);
		frame.getContentPane().add(l1);
		
		JRadioButton r1 = new JRadioButton("   Paytm / PhonePay / G-Pay");
		r1.setBounds(55,85,290,30);
		r1.setFont(new Font("Sylfaen", Font.PLAIN , 16));
		r1.setBackground(Color.pink);
		frame.add(r1);
		
		JRadioButton r2 = new JRadioButton("   Debit Card / Credit Card");
		r2.setBounds(55,115,290,30);
		r2.setFont(new Font("Sylfaen", Font.PLAIN , 16));
		r2.setBackground(Color.pink);
		frame.add(r2);
		
		JRadioButton r3 = new JRadioButton("   Bhim Upi ");
		r3.setBounds(55,145,290,30);
		r3.setFont(new Font("Sylfaen", Font.PLAIN , 16));
		r3.setBackground(Color.pink);
		frame.add(r3);
		
		JRadioButton r4 = new JRadioButton("  Offline / Cash ");
		r4.setBounds(55,175,290,30);
		r4.setFont(new Font("Sylfaen", Font.PLAIN , 16));
		r4.setBackground(Color.pink);
		frame.add(r4);
		
		JButton btn = new JButton("PAY");
		btn.setBounds(220,245,110,30);
		frame.add(btn);
		btn.setFont(new Font("Sylfaen",Font.BOLD,18));
		
		btn.addActionListener(new ActionListener() {

			@Override
			 public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(r4.isSelected()) {

						dbms( amount, name, Gname, address, mobile);
						frame.dispose();
						seventh( amount, name, Gname, address, mobile);
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Please  Select Payment Method");
					
				}
				
			}
			
		});
		
		JLabel l3 = new JLabel("Amount  -  Rs "+amount);
		l3.setBounds(380,245,140,30);
		frame.add(l3);
		l3.setFont(new Font("Sylfaen",Font.BOLD,16));
		
		r1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Only Cash Mode Availabel");
				r1.setSelected(false);
				r2.setSelected(false);
				r3.setSelected(false);
			}
			
		});
		
		r2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Only Cash Mode Availabel");
				r1.setSelected(false);
				r2.setSelected(false);
				r3.setSelected(false);
			}
			
		});
		
		r3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Only Cash Mode Availabel");
				r1.setSelected(false);
				r2.setSelected(false);
				r3.setSelected(false);
			}
			
		});
		
		
		JButton btnNewButton_2 = new JButton("<- Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				frame.dispose();
				fifth(amount);
			}
		});
		btnNewButton_2.setBounds(63, 300, 110, 30);
		frame.add(btnNewButton_2);
		
		return 0;
		
	}
	/*  Seventh Frame
	 * 
	 * 
	 * 
	 */
	public static void seventh(int amount,String name,String Gname,String address,String mobile) {
		JFrame frame  = new JFrame("Tour Booked");
		frame.setBounds(400, 140, 600, 400);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);		
		frame.getContentPane().setBackground(Color.pink);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Tour Booked");
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(145, 21, 281, 44);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel l1 = new JLabel(" Name : ");
		l1.setBounds(100,65,120,30);
		l1.setFont(new Font("Sylfaen", Font.PLAIN | Font.ITALIC, 17));
		frame.add(l1);
		
		JLabel t1 = new JLabel(name);
		t1.setBounds(170,65,190,27);
		t1.setFont(new Font("Sylfaen", Font.PLAIN , 17));
		frame.add(t1);
		
		JLabel l2 = new JLabel("Guardian Name : ");
		l2.setBounds(50,95,120,30);
		l2.setFont(new Font("Sylfaen", Font.PLAIN , 15));
		frame.add(l2);
		
		JLabel t2 = new JLabel(Gname);
		t2.setBounds(170,95,190,27);
		t2.setFont(new Font("Sylfaen", Font.PLAIN , 15));
		frame.add(t2);
		
		JLabel l3 = new JLabel("Mobile No. : ");
		l3.setBounds(80,125,120,30);
		l3.setFont(new Font("Sylfaen", Font.PLAIN , 15));
		frame.add(l3);
		
		JLabel t3 = new JLabel(mobile);
		t3.setBounds(170,125,190,27);
		t3.setFont(new Font("Sylfaen", Font.PLAIN , 15));
		frame.add(t3);
		

		JLabel l4 = new JLabel("Address  : ");
		l4.setBounds(90,155,120,30);
		l4.setFont(new Font("Sylfaen", Font.PLAIN , 15));
		frame.add(l4);
		
		JLabel t4 = new JLabel(address);
		t4.setBounds(170,155,190,27);
		t4.setFont(new Font("Sylfaen", Font.PLAIN , 15));
		frame.add(t4);
		

		JLabel l5 = new JLabel("Total Fare  : ");
		l5.setBounds(80,185,120,30);
		l5.setFont(new Font("Sylfaen", Font.PLAIN , 15));
		frame.add(l5);
		
		JLabel t5 = new JLabel(String.valueOf(amount));
		t5.setBounds(170,185,190,27);
		t5.setFont(new Font("Sylfaen", Font.PLAIN , 15));
		frame.add(t5);
		

		JLabel l6 = new JLabel("Status : ");
		l6.setBounds(110,215,120,30);
		l6.setFont(new Font("Sylfaen", Font.PLAIN , 15));
		frame.add(l6);
		
		JLabel t6 = new JLabel("Booked");
		t6.setBounds(170,215,190,27);
		t6.setFont(new Font("Sylfaen", Font.PLAIN , 15));
		frame.add(t6);
		
		JButton btn = new JButton("Go To Home Page");
		btn.setBounds(210,255,180,30);
		frame.add(btn);
		btn.setFont(new Font("Sylfaen", Font.BOLD , 16));
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				first();
			}
			
		});
		
		
	}
	
	/* Dmbs
	 * 
	 * 
	 * 
	 */
	public static void dbms(int amount,String name,String Gname,String address,String mobile) {

		    String url = "jdbc:mysql://localhost/tour";
	        String user = "root";
	        String password = "";
	        
	        try {
	        	 Class.forName("com.mysql.cj.jdbc.Driver");
	             Connection con = DriverManager.getConnection(url,user,password);
	             
	             PreparedStatement pstmt = con.prepareStatement("INSERT INTO `ghumoyarro` (`Sno`, `name`, `GName`, `address`, `mobile`, `amount`) VALUES (?,?,?,?,?,?)");
	             pstmt.setInt(1, NULL);
	             pstmt.setString(2, name);
	             pstmt.setString(3, Gname);
	             pstmt.setString(4, address);
	             pstmt.setString(5, mobile);
	             pstmt.setInt(6, amount);
	             
	             pstmt.executeUpdate();
	             
	             pstmt.close();
	             con.close();
	             
	        }catch(Exception e) {
	        	 System.out.println("some problem occur");
	        	 e.printStackTrace();

	        }
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			first();
		}
		catch(Exception e) {
			System.out.println("Some Problem Occur ");
			e.printStackTrace();
		}

	}

	private static void history() {


		// TODO Auto-generated method stub
		JFrame frame  = new JFrame("Tour Booked");
		frame.setBounds(400, 140, 600, 400);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);		
		frame.getContentPane().setBackground(Color.pink);
		frame.setVisible(true);
		
		JButton btnNewButton_2 = new JButton("<- Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				frame.dispose();
				first();
			}
		});
		btnNewButton_2.setBounds(23, 12, 90, 25);
		frame.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("HISTORY");
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(145, 15, 281, 44);
		frame.getContentPane().add(lblNewLabel);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(0, 45, 600, 74);
		frame.getContentPane().add(separator_1);
		
		JLabel l1 = new JLabel("Name");
		l1.setBounds(30,50,80,30);
		frame.add(l1);
		l1.setFont(new Font("Sylfaen", Font.BOLD , 17));

		JLabel l2 = new JLabel("Mobile No.");
		l2.setBounds(180,50,100,30);
		frame.add(l2);
		l2.setFont(new Font("Sylfaen", Font.BOLD , 17));
		
		JLabel l3 = new JLabel("Fare");
		l3.setBounds(360,50,80,30);
		frame.add(l3);
		l3.setFont(new Font("Sylfaen", Font.BOLD , 17));
		
		JLabel l4 = new JLabel("Status");
		l4.setBounds(480,50,80,30);
		frame.add(l4);
		l4.setFont(new Font("Sylfaen", Font.BOLD , 17));
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(0, 75, 600, 74);
		frame.getContentPane().add(separator_2);
		
		JList<String> list1 = new JList<String>();
		list1.setBounds(20,80,150,270);
		list1.setBackground(Color.pink);
		frame.add(list1);
		
		DefaultListModel<String> m1 = new DefaultListModel<String>();
		list1.setModel(m1);
		
		JList<String> list2 = new JList<String>();
		list2.setBounds(170,80,185,270);
		list2.setBackground(Color.pink);
		frame.add(list2);
		
		DefaultListModel<String> m2 = new DefaultListModel<String>();
		list2.setModel(m2);
		
		JList<Integer> list3 = new JList<Integer>();
		list3.setBounds(355,80,126,270);
		list3.setBackground(Color.pink);
		frame.add(list3);
		
		ListModel<Integer> m3 = new DefaultListModel<Integer>();
		list3.setModel(m3);
		
		JList<String> list4 = new JList<String>();
		list4.setBounds(480,80,85,270);
		list4.setBackground(Color.pink);
		frame.add(list4);
		
		DefaultListModel<String> m4 = new DefaultListModel<String>();
		list4.setModel(m4);
		
		  String url = "jdbc:mysql://localhost/tour";
	        String user = "root";
	        String password = "";
	        
	        
	        try {
	        	 Class.forName("com.mysql.cj.jdbc.Driver");
	             Connection con = DriverManager.getConnection(url,user,password);
	             Statement stmt = con.createStatement();
	             String sql = "SELECT Sno,name,GName,address,mobile,amount FROM ghumoyarro";
	             ResultSet rs = stmt.executeQuery(sql);
	             while (rs.next()){
	            	m1.addElement(rs.getString("name"));
	            	m2.addElement(rs.getString("mobile"));
	            	((DefaultListModel<Integer>) m3).addElement(rs.getInt("amount"));
	            	m4.addElement("BOOKED");
	            	
	             }
	             
	             rs.close();
	             stmt.close();
	             con.close();
	             
	        }catch(Exception e) {
	        	 System.out.println("some problem occur");
	        	 e.printStackTrace();

	        }
		
	}

}
