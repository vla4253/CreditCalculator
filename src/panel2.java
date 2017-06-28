import java.awt.*;
import javax.swing.*;
public class panel2 extends JPanel
{
	JPanel miniPanel1;
	JPanel miniPanel2;
	JPanel miniPanel3;
	JPanel miniPanel4;
	JPanel miniPanel5;
	JPanel miniPanel6;
	JPanel miniPanel7;
	JPanel miniPanel8;
	static JTextField kwotaKredytu;
	static JTextField oprocentowanieNominalne;
	static JCheckBox lata;
	static JCheckBox miesiace;
	static JTextField okresKredytowania;
	static JCheckBox miesieczna;
	static JCheckBox kwartalna;
	static JCheckBox rowne;
	static JCheckBox malejace;
	JButton oblicz;
	static JTextField kosztKredytu;
	static JTextField odsetki;
	panel2() {
		miniPanel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		miniPanel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		miniPanel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		miniPanel4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		miniPanel5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		miniPanel6 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		miniPanel7 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		miniPanel8 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		miniPanel1();
		miniPanel2();
		miniPanel3();
		miniPanel4();
		miniPanel5();
		miniPanel6();
		miniPanel7();
		miniPanel8();
		ObslugaZdarzenia obslugaOblicz = new ObslugaZdarzenia(1);
		ObslugaZdarzenia obslugaLata = new ObslugaZdarzenia(2);
		ObslugaZdarzenia obslugaMiesiace = new ObslugaZdarzenia(3);
		ObslugaZdarzenia obslugaMiesieczna = new ObslugaZdarzenia(4);
		ObslugaZdarzenia obslugaKwartalna = new ObslugaZdarzenia(5);
		ObslugaZdarzenia obslugaRowne = new ObslugaZdarzenia(6);
		ObslugaZdarzenia obslugaMalejace = new ObslugaZdarzenia(7);
		oblicz.addActionListener(obslugaOblicz);
		lata.addActionListener(obslugaLata);
		miesiace.addActionListener(obslugaMiesiace);
		miesieczna.addActionListener(obslugaMiesieczna);
		kwartalna.addActionListener(obslugaKwartalna);
		rowne.addActionListener(obslugaRowne);
		malejace.addActionListener(obslugaMalejace);
		add(Box.createRigidArea(new Dimension(0,4)));
		add(miniPanel5);
		add(Box.createRigidArea(new Dimension(0,11)));
		add(miniPanel1);
		add(Box.createRigidArea(new Dimension(0,11)));
		add(miniPanel2);
		add(Box.createRigidArea(new Dimension(0,9)));
		add(miniPanel3);
		add(Box.createRigidArea(new Dimension(0,6)));
		add(miniPanel4);
		add(Box.createRigidArea(new Dimension(0,5)));
		add(miniPanel6);
		add(Box.createRigidArea(new Dimension(0,5)));
		add(miniPanel7);
		add(Box.createRigidArea(new Dimension(0,10)));
		add(miniPanel8);	
	}
	void miniPanel1() {
		oprocentowanieNominalne = new JTextField(5);
		miniPanel1.add(oprocentowanieNominalne);
		miniPanel1.add(new JLabel("%"));
		miniPanel1.setAlignmentX(Component.LEFT_ALIGNMENT);
	}
	void miniPanel2() {
		lata = new JCheckBox();
		miesiace = new JCheckBox();
		okresKredytowania = new JTextField(3);
		miniPanel2.add(lata);
		miniPanel2.add(new JLabel("lata "));
		miniPanel2.add(miesiace);
		miniPanel2.add(new JLabel("miesi¹ce "));
		miniPanel2.add(okresKredytowania);
		miniPanel2.setAlignmentX(Component.LEFT_ALIGNMENT);
	}
	void miniPanel3() {
		miesieczna = new JCheckBox();
		kwartalna = new JCheckBox();
		miniPanel3.add(miesieczna);
		miniPanel3.add(new JLabel("miesiêczna "));
		miniPanel3.add(kwartalna);
		miniPanel3.add(new JLabel("kwartalna"));
		miniPanel3.setAlignmentX(Component.LEFT_ALIGNMENT);
		
	}
	void miniPanel4() {
		rowne = new JCheckBox();
		malejace = new JCheckBox();
		miniPanel4.add(rowne);
		miniPanel4.add(new JLabel("równe "));
		miniPanel4.add(malejace);
		miniPanel4.add(new JLabel("malej¹ce"));
		miniPanel4.setAlignmentX(Component.LEFT_ALIGNMENT);
	}
	void miniPanel5() {
		kwotaKredytu = new JTextField(10);
		miniPanel5.add(kwotaKredytu);
		miniPanel5.setAlignmentX(Component.LEFT_ALIGNMENT);
	}
	void miniPanel6() {
		oblicz = new JButton("Oblicz");
		miniPanel6.add(oblicz);
		miniPanel6.setAlignmentX(Component.LEFT_ALIGNMENT);
	}
	void miniPanel7() {
		kosztKredytu = new JTextField(10);
		
		miniPanel7.add(kosztKredytu);
		miniPanel7.setAlignmentX(Component.LEFT_ALIGNMENT);
	}
	
	void miniPanel8() {
		odsetki = new JTextField(10);
		miniPanel8.add(odsetki);
		miniPanel8.setAlignmentX(Component.LEFT_ALIGNMENT);
	}
}
