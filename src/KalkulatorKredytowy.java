/*
* Nazwa: KalkulatorKredytowy.java
* Autor: Vladyslav Dragan
*
* Opis: Program pozwala na wyznaczenie kosztu kredytu oraz wielkoœci odsetek, przy za³o¿onym poziomie oprocentowania nominalnego,
* okresie, na jaki kredyt zosta³ zaci¹gniêty.
*
* Kompilacja: javac KalkulatorKredytowy.java
* Uruchomienie: java KalkulatorKredytowy
*
*/ 
import java.awt.*;
import javax.swing.*;
public class KalkulatorKredytowy {
	static Okno okno = new Okno();
	public static void main(String[] args) {
		JPanel panel = new JPanel();
		panel1 panel1 = new panel1();
		panel2 panel2 = new panel2();
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));	
		panel.add(panel1);
		panel.add(panel2);
		panel.setLayout(new BoxLayout(panel,BoxLayout.X_AXIS));
		okno.add(panel);
		okno.setVisible(true);
	}
}
