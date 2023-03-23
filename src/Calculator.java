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
	
	public Calculator() {
		jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(400, 650);
		jf.setResizable(false);
		jf.setLocation(300, 150);
		
		displayLabel = new JLabel("ENTER NUMBER");
		displayLabel.setBounds(20, 40, 350, 50);
		displayLabel.setBackground(Color.gray);
		displayLabel.setForeground(Color.white);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		jf.add(displayLabel);
		
		clearBtn = new JButton("CLR");
		clearBtn.setBounds(20, 110, 140, 50);
		jf.add(clearBtn);
		
		delBtn = new JButton("Del");
		delBtn.setBounds(220, 110, 60, 50);
		jf.add(delBtn);
		
		divBtn = new JButton("/");
		divBtn.setBounds(300, 110, 50, 50);
		jf.add(divBtn);
		
		prodBtn = new JButton("*");
		prodBtn.setBounds(300, 210, 50, 50);
		jf.add(prodBtn);
		
		diffBtn = new JButton("-");
		diffBtn.setBounds(300, 310, 50, 50);
		jf.add(diffBtn);
		
		sumBtn = new JButton("+");
		sumBtn.setBounds(300, 410, 50, 50);
		jf.add(sumBtn);
		
		sevenBtn = new JButton("7");
		sevenBtn.setBounds(20, 210, 50, 50);
		sevenBtn.addActionListener(this);
		jf.add(sevenBtn);
		
		eightBtn = new JButton("8");
		eightBtn.setBounds(120, 210, 50, 50);
		eightBtn.addActionListener(this);
		jf.add(eightBtn);
		
		nineBtn = new JButton("9");
		nineBtn.setBounds(220, 210, 50, 50);
		nineBtn.addActionListener(this);
		jf.add(nineBtn);
		
		fourBtn = new JButton("4");
		fourBtn.setBounds(20, 310, 50, 50);
		fourBtn.addActionListener(this);
		jf.add(fourBtn);
		
		fiveBtn = new JButton("5");
		fiveBtn.setBounds(120, 310, 50, 50);
		fiveBtn.addActionListener(this);
		jf.add(fiveBtn);
		
		sixBtn = new JButton("6");
		sixBtn.setBounds(220, 310, 50, 50);
		sixBtn.addActionListener(this);
		jf.add(sixBtn);
		
		oneBtn = new JButton("1");
		oneBtn.setBounds(20, 410, 50, 50);
		oneBtn.addActionListener(this);
		jf.add(oneBtn);
		
		twoBtn = new JButton("2");
		twoBtn.setBounds(120, 410, 50, 50);
		twoBtn.addActionListener(this);
		jf.add(twoBtn);
		
		threeBtn = new JButton("3");
		threeBtn.setBounds(220, 410, 50, 50);
		threeBtn.addActionListener(this);
		jf.add(threeBtn);
		
		dotBtn = new JButton(".");
		dotBtn.setBounds(20, 510, 50, 50);
		jf.add(dotBtn);
		
		zeroBtn = new JButton("0");
		zeroBtn.setBounds(120, 510, 50, 50);
		zeroBtn.addActionListener(this);
		jf.add(zeroBtn);
		
		equalBtn = new JButton("=");
		equalBtn.setBounds(220, 510, 150, 50);
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
			displayLabel.setText("1");
		} else if (e.getSource() == twoBtn) {
			displayLabel.setText("2");
		} else if (e.getSource() == threeBtn) {
			displayLabel.setText("3");
		} else if (e.getSource() == fourBtn) {
			displayLabel.setText("4");
		} else if (e.getSource() == fiveBtn) {
			displayLabel.setText("5");
		} else if (e.getSource() == sixBtn) {
			displayLabel.setText("6");
		} else if (e.getSource() == sevenBtn) {
			displayLabel.setText("7");
		} else if (e.getSource() == eightBtn) {
			displayLabel.setText("8");
		} else if (e.getSource() == nineBtn) {
			displayLabel.setText("9");
		} else if (e.getSource() == zeroBtn) {
			displayLabel.setText("0");
		}
	}
}
