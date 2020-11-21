package fr.arras.poo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Controller implements ActionListener {
	
	Modele m;
	JTextField field;
	JLabel label;
	
	public Controller(Modele m, JTextField field, JLabel label){
		this.m = m;
		this.field=field;
		this.label=label;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
         m.setValeur(field.getText());
         label.setText(field.getText());
         
	}

}
