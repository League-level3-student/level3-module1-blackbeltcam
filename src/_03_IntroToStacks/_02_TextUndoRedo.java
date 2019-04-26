package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	char currentchar;
	String typedstr = "";
	Character burrito;
	JFrame frame = new JFrame("TextUndoRedo");
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	Stack<String> backspace = new Stack<String>();
	Stack<String> undo = new Stack<String>();
	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */

	public static void main(String[] args) {
		_02_TextUndoRedo d = new _02_TextUndoRedo();
	}

	_02_TextUndoRedo() {

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(500, 500);
		panel.setVisible(true);
		frame.add(panel);
		panel.add(label);
		frame.addKeyListener(this);

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		Character great = e.getKeyChar();
		String greater = great.toString();
		if (e.getKeyCode() == 8) {
			// typedstr.charAt(typedstr.length()-1);
			undo.push(greater);

		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int yui = e.getKeyCode();
		System.out.println(yui);
		char kcode = e.getKeyChar();
		String s = Character.toString(kcode);
		System.out.println();

		if (e.getKeyCode() == 8) {
			backspace.push("" + typedstr.charAt(typedstr.length() - 1));
			typedstr = typedstr.substring(0, typedstr.length() - 1);
		} else if (e.getKeyCode() == 92) {
			String hjkl = backspace.pop();
			System.out.println(hjkl);
			typedstr += hjkl;
		} else {
			typedstr += "" + kcode;
		}

		label.setText(typedstr);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
