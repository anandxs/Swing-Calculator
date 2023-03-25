import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	JFrame jf;
	JLabel displayLabel;
	JButton clearBtn, delBtn, divBtn, prodBtn, diffBtn, sumBtn, equalBtn, dotBtn;
	JButton zeroBtn, oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn;
	float first, second;
	String operatorChosen;
	
	public Calculator() {
		jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(330, 520);
		jf.setResizable(false);
		jf.setLocation(300, 150);
		
		displayLabel = new JLabel();
		displayLabel.setBounds(20, 40, 275, 50);
		displayLabel.setBackground(Color.gray);
		displayLabel.setForeground(Color.white);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		jf.add(displayLabel);
		
		// row 1
		clearBtn = new JButton("CLR");
		clearBtn.setBounds(20, 110, 125, 50);
		clearBtn.addActionListener(this);
		jf.add(clearBtn);
		
		delBtn = new JButton("Del");
		delBtn.setBounds(170, 110, 50, 50);
		delBtn.addActionListener(this);
		jf.add(delBtn);
		
		divBtn = new JButton("/");
		divBtn.setBounds(245, 110, 50, 50);
		divBtn.addActionListener(this);
		jf.add(divBtn);
		
		// row 2
		sevenBtn = new JButton("7");
		sevenBtn.setBounds(20, 185, 50, 50);
		sevenBtn.addActionListener(this);
		jf.add(sevenBtn);
		
		eightBtn = new JButton("8");
		eightBtn.setBounds(95, 185, 50, 50);
		eightBtn.addActionListener(this);
		jf.add(eightBtn);
		
		nineBtn = new JButton("9");
		nineBtn.setBounds(170, 185, 50, 50);
		nineBtn.addActionListener(this);
		jf.add(nineBtn);
		
		prodBtn = new JButton("*");
		prodBtn.setBounds(245, 185, 50, 50);
		prodBtn.addActionListener(this);
		jf.add(prodBtn);
		
		// row 3
		fourBtn = new JButton("4");
		fourBtn.setBounds(20, 260, 50, 50);
		fourBtn.addActionListener(this);
		jf.add(fourBtn);
		
		fiveBtn = new JButton("5");
		fiveBtn.setBounds(95, 260, 50, 50);
		fiveBtn.addActionListener(this);
		jf.add(fiveBtn);
		
		sixBtn = new JButton("6");
		sixBtn.setBounds(170, 260, 50, 50);
		sixBtn.addActionListener(this);
		jf.add(sixBtn);
		
		diffBtn = new JButton("-");
		diffBtn.setBounds(245, 260, 50, 50);
		diffBtn.addActionListener(this);
		jf.add(diffBtn);
		
		// row 4
		oneBtn = new JButton("1");
		oneBtn.setBounds(20, 335, 50, 50);
		oneBtn.addActionListener(this);
		jf.add(oneBtn);
		
		twoBtn = new JButton("2");
		twoBtn.setBounds(95, 335, 50, 50);
		twoBtn.addActionListener(this);
		jf.add(twoBtn);
		
		threeBtn = new JButton("3");
		threeBtn.setBounds(170, 335, 50, 50);
		threeBtn.addActionListener(this);
		jf.add(threeBtn);
		
		sumBtn = new JButton("+");
		sumBtn.setBounds(245, 335, 50, 50);
		sumBtn.addActionListener(this);
		jf.add(sumBtn);
		
		// row 5
		dotBtn = new JButton(".");
		dotBtn.setBounds(20, 410, 50, 50);
		dotBtn.addActionListener(this);
		jf.add(dotBtn);
		
		zeroBtn = new JButton("0");
		zeroBtn.setBounds(95, 410, 50, 50);
		zeroBtn.addActionListener(this);
		jf.add(zeroBtn);
		
		equalBtn = new JButton("=");
		equalBtn.setBounds(170, 410, 125, 50);
		equalBtn.addActionListener(this);
		jf.add(equalBtn);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]) {
		new Calculator();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == oneBtn) {
			
			displayLabel.setText(displayLabel.getText() + "1");
			
		} else if (e.getSource() == twoBtn) {
			
			displayLabel.setText(displayLabel.getText() + "2");
			
		} else if (e.getSource() == threeBtn) {
			
			displayLabel.setText(displayLabel.getText() + "3");
			
		} else if (e.getSource() == fourBtn) {
			
			displayLabel.setText(displayLabel.getText() + "4");
			
		} else if (e.getSource() == fiveBtn) {
			
			displayLabel.setText(displayLabel.getText() + "5");
			
		} else if (e.getSource() == sixBtn) {
			
			displayLabel.setText(displayLabel.getText() + "6");
			
		} else if (e.getSource() == sevenBtn) {
			
			displayLabel.setText(displayLabel.getText() + "7");
			
		} else if (e.getSource() == eightBtn) {
			
			displayLabel.setText(displayLabel.getText() + "8");
			
		} else if (e.getSource() == nineBtn) {
			
			displayLabel.setText(displayLabel.getText() + "9");
			
		} else if (e.getSource() == zeroBtn) {
			
			displayLabel.setText(displayLabel.getText() + "0");
			
		} else if (e.getSource() == clearBtn) {
			
			displayLabel.setText("");
			first = second = 0.0f;
			   
		} else if (e.getSource() == delBtn) {
			
			String current = displayLabel.getText();
			
			if (current.length() > 0) {
				
				String latest = current.substring(0, current.length() - 1);
				displayLabel.setText(latest);
				
			} else {
				
				System.out.println("displayLabel is empty");
				
			}
		} else if (e.getSource() == dotBtn) {
			
			String current = displayLabel.getText();
			
			if (current == "") {
				
				displayLabel.setText("0.");
				
			} else if (current.contains(".")) {
				
				System.out.println("Invalid action. Already has a dot!");
				
			} else {
				
				displayLabel.setText(current + ".");
				
			}
		} else if (e.getSource() == equalBtn) {
			
			String currentText = displayLabel.getText();
			
			if (currentText != "" ) {
				
				second = Float.parseFloat(currentText);
				
				switch (operatorChosen) {
				case "sum": 
					displayLabel.setText(first + second + "");						
					break;
				case "diff":
					displayLabel.setText(first - second + "");
					break;
				case "prod":
					displayLabel.setText(first * second + "");
					break;
				case "div":
					if (second == 0.0f) {
						displayLabel.setText("cannot divide by zero");
					} else {
						displayLabel.setText(first / second + "");					}
				}
				
			}
		} else if (e.getSource() == sumBtn) {
			
			String currentText = displayLabel.getText();
			
			if (first == 0.0f && currentText != "") {
				
				first = Float.parseFloat(currentText);
				displayLabel.setText("");
				operatorChosen = "sum";
				
			}
		} else if (e.getSource() == diffBtn) {
			
			String currentText = displayLabel.getText();
			
			if (first == 0.0f && currentText != "") {
				
				first = Float.parseFloat(currentText);
				displayLabel.setText("");
				operatorChosen = "diff";
				
			}
		} else if (e.getSource() == prodBtn) {
			
			String currentText = displayLabel.getText();
						
			if (first == 0.0f && currentText != "") {
				
				first = Float.parseFloat(currentText);
				displayLabel.setText("");
				operatorChosen = "prod";
				
			}
		} else if (e.getSource() == divBtn) {
			
			String currentText = displayLabel.getText();
			
			if (first == 0.0f && currentText != "") {
				
				first = Float.parseFloat(currentText);
				displayLabel.setText("");
				operatorChosen = "div";
				
			}
		}
	}
}
