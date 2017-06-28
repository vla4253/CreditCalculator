import java.awt.*;
import java.lang.*;
import java.awt.event.*;
import javax.swing.*;
class ObslugaZdarzenia implements ActionListener {
	int numerZdarzenia;
	double kwotaKredytu;
	double oprocentowanieNominalne;
	double okresKredytowania;
	boolean lata;
	boolean miesiace;
	boolean miesieczna;
	boolean kwartalna;
	boolean rowne;
	boolean malejace;
	double kosztKredytu;
	double miesieczneOprocentowanie;
	double odsetki;
	ObslugaZdarzenia(int numerZdarzenia) {
		this.numerZdarzenia = numerZdarzenia;
	}
	public void actionPerformed(ActionEvent e) {
		switch(numerZdarzenia) {
			case 1:
				if (panel2.kwotaKredytu.getText().equals("") ) {
					break;
				}
				if (panel2.oprocentowanieNominalne.getText().equals("") ) {
					break;
				}
				if (panel2.lata.isSelected() == false && panel2.miesiace.isSelected() == false ) {
					break;
				}
				if (panel2.miesieczna.isSelected() == false && panel2.kwartalna.isSelected() == false ) {
					break;
				}
				if (panel2.rowne.isSelected() == false && panel2.malejace.isSelected() == false ) {
					break;
				}
				kwotaKredytu = Integer.parseInt(panel2.kwotaKredytu.getText());
				oprocentowanieNominalne = Double.parseDouble(panel2.oprocentowanieNominalne.getText());
				lata = panel2.lata.isSelected();
				miesiace = panel2.miesiace.isSelected();
				okresKredytowania = Integer.parseInt(panel2.okresKredytowania.getText());
				miesieczna = panel2.miesieczna.isSelected();
				kwartalna = panel2.kwartalna.isSelected();
				rowne = panel2.rowne.isSelected();
				malejace = panel2.malejace.isSelected();
				if (rowne == true) {
					if (lata == true) {
						okresKredytowania = okresKredytowania*12;
					}
					if (panel2.miesieczna.isSelected() == true) {
					miesieczneOprocentowanie = oprocentowanieNominalne/100/12;
					}
					if (panel2.kwartalna.isSelected() == true) {
						miesieczneOprocentowanie = oprocentowanieNominalne/100/4;
						okresKredytowania /= 3;
					}
					double a = (1+miesieczneOprocentowanie);
					double b = (double)okresKredytowania;
					double c = Math.pow(a,b);
					double d = (double)kwotaKredytu;
					double raty;
					raty = d*miesieczneOprocentowanie*(c / (c - 1));
					kosztKredytu = raty*okresKredytowania;
					kosztKredytu *= 100;
					kosztKredytu = Math.round(kosztKredytu);
					kosztKredytu /= 100;
					panel2.kosztKredytu.setText("" + kosztKredytu);
					odsetki = kosztKredytu-kwotaKredytu;

				    odsetki *= 100;
					odsetki = Math.round(odsetki);
					odsetki /= 100;
					panel2.odsetki.setText("" + odsetki);
				}
				if (malejace == true) {
					int iloscOkresow=2400;
					if (lata == true) {
						okresKredytowania = okresKredytowania*12;
					}
					if (panel2.miesieczna.isSelected() == true) {
					miesieczneOprocentowanie = oprocentowanieNominalne/100/12;
					}
					if (panel2.kwartalna.isSelected() == true) {
						miesieczneOprocentowanie = oprocentowanieNominalne/100/4;
						okresKredytowania /= 3;
						iloscOkresow = 800;
					}
					int z = (int) okresKredytowania;
					double[] raty = new double[z];
					for (int a=1; a<=okresKredytowania; a++) {
						raty[a-1] = (kwotaKredytu/okresKredytowania) * (1 + (okresKredytowania - a + 1) * miesieczneOprocentowanie);	
					}
					double suma=0;
					for (double zmienna : raty) {
						suma=suma+zmienna;
					}
					kosztKredytu = suma;
					kosztKredytu *= 100;
					kosztKredytu = Math.round(kosztKredytu);
					kosztKredytu /= 100;
					panel2.kosztKredytu.setText("" + kosztKredytu);
					odsetki = (kwotaKredytu*oprocentowanieNominalne*(okresKredytowania+1)/iloscOkresow);
					odsetki *= 100;
					odsetki = Math.round(odsetki);
					odsetki /= 100;
					panel2.odsetki.setText("" + odsetki);
				}
				break;
			case 2:
				panel2.miesiace.setSelected(false);
				break;
			case 3:
				panel2.lata.setSelected(false);
				break;
			case 4:
				panel2.kwartalna.setSelected(false);
				break;
			case 5:
				panel2.miesieczna.setSelected(false);
				break;
			case 6:
				panel2.malejace.setSelected(false);
				break;
			case 7: 
				panel2.rowne.setSelected(false);
				break;
		}
	}
}
