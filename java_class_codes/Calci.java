import javax.swing.*;
import java.awt.FlowLayout;

class Calci extends JFrame {
	JLabel num1Label, num2Label, resultLabel;
	JTextField num1TField, num2TField, resultTField;
	JButton addButton;
	
	public Calci() {
		num1Label = new JLabel("Num1");
		num1TField = new JTextField("20");
		num2Label = new JLabel("Num2");
		num2TField = new JTextField("20");
		addButton = new JButton("Addition");
		resultLabel = new JLabel("Result");
		resultTField = new JTextField("40");
		
		setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
		add(num1Label);  add(num1TField);
		add(num2Label);  add(num2TField);
		add(addButton); 
		add(resultLabel);  add(resultTField);
		
		setSize(400, 400);
		setVisible(true);
	}
	public static void main(String args[]) {
		System.out.println("HI...");
		Calci mycalci = new Calci();
	}
}
