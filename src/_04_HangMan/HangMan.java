package _04_HangMan;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HangMan {
	JFrame frame = new JFrame("Hangman");
	JPanel panel = new JPanel();
	JTextField field = new JTextField();

	public static void main(String[] args) {
		String words = JOptionPane.showInputDialog("Wolcome to HANGMAN! \n How many words would you like to guess?");
	}

}
