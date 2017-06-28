import javax.swing.*;
import java.awt.*;
public class panel1 extends JPanel {
	JLabel kwotaKredytu = new JLabel("Kwota kredytu");
	JLabel oprocentowanieNominalne = new JLabel("                Oprocentowanie nominalne");
	JLabel okresKredytowania = new JLabel("Okres kredytowania");
	JLabel kapitalizacja = new JLabel("Kapitalizacja");
	JLabel raty = new JLabel("Raty");
	JLabel kosztKredytu = new JLabel("Koszt kredytu");
	JLabel odsetki = new JLabel("Odsetki");
	panel1() {
		add(kwotaKredytu);
		kwotaKredytu.setAlignmentX(Component.RIGHT_ALIGNMENT);
		add(Box.createRigidArea(new Dimension(30,25)));
		add(oprocentowanieNominalne);
		oprocentowanieNominalne.setAlignmentX(Component.RIGHT_ALIGNMENT);
		add(Box.createRigidArea(new Dimension(30,23)));
		add(okresKredytowania);
		okresKredytowania.setAlignmentX(Component.RIGHT_ALIGNMENT);
		add(Box.createRigidArea(new Dimension(30,23)));
		add(kapitalizacja);
		kapitalizacja.setAlignmentX(Component.RIGHT_ALIGNMENT);
		add(Box.createRigidArea(new Dimension(0,23)));
		add(raty);
		raty.setAlignmentX(Component.RIGHT_ALIGNMENT);
		add(Box.createRigidArea(new Dimension(30,60)));
		add(kosztKredytu);
		kosztKredytu.setAlignmentX(Component.RIGHT_ALIGNMENT);
		add(Box.createRigidArea(new Dimension(30,25)));
		add(odsetki);
		odsetki.setAlignmentX(Component.RIGHT_ALIGNMENT);
	}
}