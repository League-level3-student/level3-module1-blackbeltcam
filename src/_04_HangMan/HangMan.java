package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
	JFrame frame = new JFrame("Hangman");
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JLabel label2 = new JLabel();
	String wordtoguess;
	char[] guessedword;
	boolean charMatch = false;
	String temp = " ";
	String words;
	int wordsint;
	int lives = 10;

	public HangMan() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String words = JOptionPane.showInputDialog("Welcome to HANGMAN! \n How many words would you like to guess?");
		wordsint=Integer.parseInt(words);
		frame.setVisible(true);
		frame.setSize(250, 100);
		frame.addKeyListener(this);
		frame.add(panel);
		panel.add(label);
		panel.add(label2);
		
		initialize();
	}
		

	public static void main(String[] args) {
		new HangMan();

	}
	
	public void initialize () {
		wordtoguess = Utilities.readRandomLineFromFile("dictionary.txt");
		guessedword=new char[wordtoguess.length()];
		lives=10;
		//System.out.println(wordtoguess);
		for (int i = 0; i < wordtoguess.length(); i++) {
			guessedword[i] = '_';

		}
		for (int iw = 0; iw < guessedword.length; iw++) {
			temp += guessedword[iw];
		}
		label.setText(temp);
		label2.setText("Lives Remaining: " + lives);
		temp = "";
	}
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		charMatch=false;
		for (int z = 0; z < wordtoguess.length(); z++) {
			if (wordtoguess.charAt(z) == e.getKeyChar()) {
				guessedword[z] = e.getKeyChar();
				label.setText(new String(guessedword));
				charMatch = true;
			}

		}
		if (!charMatch) {
			lives--;
			label2.setText("Lives Remaining: " + lives);
			if (lives == 0) {
				JOptionPane.showMessageDialog(null, "you lost");
				System.exit(0);
			}
		}
//		System.out.println(new String(guessedword));
		if (wordtoguess.equals(new String (guessedword))) {
			
			wordsint--;
			//System.out.println(wordsint);
			if (wordsint==0) {
				JOptionPane.showMessageDialog(null, "Good Job!");
				System.exit(0);
			}
			initialize();
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
