import java.awt.*;
import java.io.*;

import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.ListSelectionEvent;

public class ATM extends JFrame implements ActionListener   {


    public JTextArea textField; // text area to show the input from the buttons
    public JTextArea textField_1; // text area to show the instructions and output
    public JPanel down; // panel for buttons
    float ballance= 10; // variable to calculate the ballance
    int deposit=0; // store the amount of deposit
    int wrong=0; // count the number of wrong pin entries
    boolean pinentered = false; // boolean for the correct pin
    String pin = "1234"; // string to store the correct pin
    boolean pinchange = false; // announce if the user uant to change the pin
    String newpin = ""; // string to store the new pin
    boolean dep=false; // announce if the user want to make a deposit
    
	// constructor having the super class elements, the method to build the graphic user interface, the visibility and so on
	public FontFrame() {
	super("Cash machine");
	buildGUI();
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	pack();
	setVisible(true);
	
	
    }

    protected void buildGUI() {
        //create instances of the components of GUI
    	textField_1 = new JTextArea(); 
    	textField = new JTextArea(10,20);
    	down = new JPanel();

	//add the components of GUI in the right positions as required to build the interface	
	add(textField, BorderLayout.NORTH);
	add(textField_1, BorderLayout.CENTER);
	add(down, BorderLayout.SOUTH);
     
	// make borders and set standard inscructions for user 
	textField_1.setLayout(new BorderLayout());
	textField_1.setBorder(new TitledBorder(new EtchedBorder(), "Input display area:"));
	textField_1.setEditable(false); // this area can not be editable
	textField.append("TYPE YOUR PIN AND PRESS ENTER");
	textField.setLayout(new BorderLayout());
	textField.setBorder(new TitledBorder(new EtchedBorder(), "Instruction area:"));
	textField.setEditable(true); // this area can be aditable
	
	down.setLayout(new GridLayout(5,4)); // grid to store the buttons in an ordered fashion
	
	// button to withdraw 5 pounds with the restrictions to have been entered the pin correctly and have enough money in ballance
	JButton withdraw_1 = new JButton("1st Withdraw");
	withdraw_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(pinentered)
			{if (ballance>=5)
			{ballance -=5; // the ballance is modified
			textField.setText("YOU WITHDREW £5, THE BALLANCE IS NOW £" + ballance);
			System.out.println("YOU WITHDREW £5, THE BALLANCE IS NOW £" + ballance);}
			else
			{textField.setText("NO FUNDS");
			System.out.println("NO FUNDS");}}
			else
				textField.setText("FIRSTLY YOU NEED TO ENTER THE CORRECT PIN");
		}
	});

	down.add(withdraw_1);// add the button on the grid
	
	// button to type 1
	JButton button = new JButton("1");
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String enter= textField_1.getText() +button.getText();
	  		 textField_1.setText(enter);
		}
	});
	down.add(button); // add the button on the grid
	
	// button to type 2
	JButton button_2 = new JButton("2");
	button_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String enter= textField_1.getText() +button_1.getText();
	  		 textField_1.setText(enter);
		}
	});
	down.add(button_2);// add the button on the grid
	
	// button to type 3
	JButton button_3 = new JButton("3");
	button_3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String enter= textField_1.getText() +button_2.getText();
	  		 textField_1.setText(enter);
		}
	});
	down.add(button_3);// add the button on the grid
	
	// button to withdraw 10 pounds with the restrictions to have been entered the pin correctly and have enough money in ballance
	JButton withdraw_2 = new JButton("2st Withdraw");
	withdraw_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(pinentered)
			{if(ballance>=10)
			{ballance -=10;
			textField.setText("YOU WITHDREW £10, THE BALLANCE IS NOW £" + ballance);
			System.out.println("YOU WITHDREW £10, THE BALLANCE IS NOW £" + ballance);}
			else
			{textField.setText("NO FUNDS");
			System.out.println("NO FUNDS");}}
			else
				textField.setText("FIRSTLY YOU NEED TO ENTER THE CORRECT PIN");
		}
	});

	down.add(withdraw_1);// add the button on the grid
	
	// button to type 4
	JButton button_4 = new JButton("4");
	button_4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String enter= textField_1.getText() +button_4.getText();
	  		 textField_1.setText(enter);
		}
	});
	down.add(button_4);// add the button on the grid
	
	//button to type 5
	JButton button_5 = new JButton("5");
	button_5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String enter= textField_1.getText() +button_5.getText();
	  		 textField_1.setText(enter);
		}
	});

	down.add(button_5);//add the button on the grid
	
	// button to type 6
	JButton button_6 = new JButton("6");
	button_6.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String enter= textField_1.getText() +button_6.getText();
	  		 textField_1.setText(enter);
		}
	});
	
	down.add(button_6);
	
	
	// button to withdraw 20 pounds with the restrictions to have been entered the pin correctly and have enough money in ballance
	JButton withdraw_3 = new JButton("3st Withdraw");
	withdraw_3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(pinentered)
			{if(ballance>=20)
			{ballance -=20;
			textField.setText("YOU WITHDREW £20, THE BALLANCE IS NOW £" + ballance);
			System.out.println("YOU WITHDREW £20, THE BALLANCE IS NOW £" + ballance);}
			else
			{textField.setText("NO FUNDS");
			System.out.println("NO FUNDS");}}
			else
			textField.setText("FIRSTLY YOU NEED TO ENTER THE CORRECT PIN");
		}
	});
	
	down.add(withdraw_3);
	// button to type 7
	JButton button_7 = new JButton("7");
	button_7.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String enter= textField_1.getText() +button_16.getText();
	  		 textField_1.setText(enter);
		}
	});

	down.add(button_7);
	// button to type 8
	JButton button_8 = new JButton("8");
	button_8.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String enter= textField_1.getText() +button_17.getText();
	  		 textField_1.setText(enter);
		}
	});
	down.add(button_8);
	//button to type 9
	JButton button_9 = new JButton("9");
	button_9.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String enter= textField_1.getText() +button_18.getText();
	  		 textField_1.setText(enter);
		}
	});
	down.add(button_9);
	// button to allow the user to make a deposit if the pin was entered correctly
	JButton btnDeposit = new JButton("Deposit");
	btnDeposit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(pinentered)
			{textField.setText("ENTER THE AMOUNT OF MONEY YOU WANT TO DEPOSIT"+ '\n'); // instructions for user
			textField.append("THEN PRESS OK");
			dep=true; // boolean to announce the deposit button was used
			}
			else
				textField.setText("FIRSTLY YOU NEED TO ENTER THE CORRECT PIN"); // instructions for user
			
			
			
		}
	});
	down.add(btnDeposit);
	// button to type 0
	JButton button_0 = new JButton("0");
	button_0.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String enter= textField_1.getText() +button_3.getText();
	  		 textField_1.setText(enter);
	  		 	
		}
	});
	down.add(button_0);
	// button to clear the typing area
	JButton btnClear = new JButton("Clear");
	btnClear.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textField_1.setText(null);
		}
	});
	down.add(btnClear);
	// button to be used after the user entered the pin or changed the pin
	JButton btnEnter = new JButton("Enter");
	btnEnter.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			if(textField_1.getText().equals(pin)) // check the pin entered
				{textField.setText("Your ballance is £"+ballance); // instructions for user
			     textField_1.setText("");
			     pinentered = true;} // the pin was entered correctly
			else
			{
				textField_1.setText("");
				wrong++; // count the wrong tries
		       if(wrong==3)
			   System.exit(0);} // if the pin was entered three times incorrect , the application exit
		   
           if(pinchange && pinentered)
           {   
        	   newpin= new String(textField_1.getText()); // set the new pin entered in the text area to show the input to the string newpin
        	   pin=new String(newpin); // string pin is changed to the new correct pin
        	   textField.setText("YOUR PIN WAS CHANGED"); // instructions for user
        	   pinchange=false; // after the pin was changed, the change pin command is no longer valid
        	   wrong=0; // reset the count for wrong enters of the pin
           }
           
			
			}
		
	});
	down.add(btnEnter);
	
	// button to go back to the first step to enter the pin
	JButton btnQuit = new JButton("Quit");
	btnQuit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textField.setText("ENTER THE PIN");
		}
	});
	down.add(btnQuit);
	// button to be used after the user wrote the amount of money to deposit, if it is less than 1000
	JButton btnNewButton_1 = new JButton("OK");
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			deposit=Integer.parseInt(textField_1.getText());
			if(deposit<1000)
			{ballance+= deposit; // change the value of deposit
			textField.setText("YOUR BALLANCE IS NOW £"+ ballance); // instructions for user
			System.out.println("YOUR BALLANCE IS NOW £"+ ballance);}
			else
			{textField.setText("YOU CAN DEPOSIT UP TO £1000, TRY AGAIN");
			System.out.println("YOU CAN DEPOSIT UP TO £1000, TRY AGAIN");// print instructions in console
			textField_1.setText("");}	
		}
	});
	down.add(btnNewButton_1);
	// button to change the pin
	JButton change = new JButton("Change PIN");
	change.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(pinentered)
			{textField.setText("ENTER THE NEW PIN"); // instructions for user
			pinchange=true;} // notify that this button was used
	  		 	 
		}
		});
		down.add(change);			
	
}

    // main method to run the application
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM frame = new ATM(); // new instance of the class ATM
					frame.setVisible(true);
				} catch (Exception e) { // exception for ATM class
					e.printStackTrace(); 
				}
			}
		});
	}

	    
}