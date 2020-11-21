package fr.arras.poo;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class View {
	
	JFrame frame;
	JTextField field;
	JButton button;
	JLabel label;
	
	public JFrame getFrame() {
		return frame;
	}
	public JTextField getField() {
		return field;
	}
	public JButton getButton() {
		return button;
	}
	
	public JLabel getLabel() {
		return label;
	}
	public void init()
	{
		frame = new JFrame("Exemple POO");
		field = new JTextField();
		field.setColumns(10);
		button = new JButton("OK");
		label = new JLabel("pas encore utilisé");
		
		frame.setLayout(new FlowLayout());
		frame.getContentPane().add(field);
		frame.getContentPane().add(button);
		frame.getContentPane().add(label);
		
		frame.setVisible(true);
		frame.pack();
	}

}
