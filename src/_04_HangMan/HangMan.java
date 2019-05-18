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
	String wordtoguess = Utilities.readRandomLineFromFile("dictionary.txt");
	char[] guessedword = new char[wordtoguess.length()];
	boolean charMatch = false;
	String temp=" ";
	int lives=10;
	public HangMan(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String words = JOptionPane.showInputDialog("Welcome to HANGMAN! \n How many words would you like to guess?");
		Integer.parseInt(words);
		frame.setVisible(true);
		frame.setSize(250, 100);
		frame.addKeyListener(this);
		frame.add(panel);
		panel.add(label);
		panel.add(label2);
		
		for(int i=0; i<wordtoguess.length(); i++) {
			guessedword[i]='_';
			
		}
		for(int iw=0; iw<guessedword.length;iw++) {
			temp+=guessedword[iw];
		}
		label.setText(temp);
		label2.setText("Lives Remaining: "+lives);
		temp="";
	}
	
	public static void main(String[] args) {
		new HangMan();
		
	}
	
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		for(int z=0; z<wordtoguess.length();z++) {
			if (wordtoguess.charAt(z)==e.getKeyChar()) {
				guessedword[z]=e.getKeyChar();
				label.setText(new String(guessedword));
				charMatch=true;
			}
			else if (!charMatch) {
				lives--;
				if (lives==0) {
					System.exit(0);
				}
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
