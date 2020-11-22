package fr.arras.poo;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;

public class JLabelObserver extends JLabel implements Observer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8147971007601661706L;

		
	public JLabelObserver(String l){
		super(l);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		
		Modele m = (Modele) o;
		setText(m.getValeur());

	}

}
