package fr.arras.poo;

public class MonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		View vue = new View();
		vue.init();
		
		Modele modele = new Modele();
		Controller c = new Controller(modele,vue.getField(),vue.getLabel());
		vue.getButton().addActionListener(c);

	}

}
