import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
	
	String result;
	
	JLabel introduction = new JLabel("Solve Math Problems");
	Font myFont = new Font("Arial", Font.BOLD, 16);
	JTextField jtNum1 = new JTextField(10);
	JTextField jtNum2 = new JTextField(10);
	JTextField jtResponse = new JTextField(10);
	
	JButton multiply = new JButton(" X ");
	JButton divide = new JButton(" / ");    	
	
	JLabel answer = new JLabel("");
	final int WIDTH = 400;
	final int HEIGHT = 135;
	
	public Calculator(){
		super("My First Calculator");
		setLayout(new FlowLayout());
		setSize(WIDTH, HEIGHT);
		
		introduction.setFont(myFont);
		answer.setFont(myFont);
		
		add(introduction);
		add(jtNum1);
		add(jtNum2);
		
		add(multiply);
		add(divide);    		
		multiply.addActionListener(this);
		divide.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		int int1 = Integer.parseInt(jtNum1.getText());
        int int2 = Integer.parseInt(jtNum2.getText());
		
	
		if (e.getSource() == multiply) {
			   jtResponse.setText(String.valueOf(int1*int2));
		    } else if (e.getSource() == divide) {
		    	  jtResponse.setText(String.valueOf(int1/int2));	  
		    	 
		  
		    	System.out.println(jtResponse);  
		  
		}		
	}	
}

public class CalculatorAction {
	
	public static void main(String[] args) {
		
	   Calculator frame = new Calculator();
	   frame.setVisible(true);
	   }
	
	}