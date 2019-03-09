package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class _02_GuestBook implements ActionListener {
	
	public _02_GuestBook(){
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setName("Guest List");
		frame.setSize(250, 250);
		frame.add(panel);
		panel.setVisible(true);
		
		panel.add(button);
		panel.add(button2);
		panel.add(textarea);
		textarea.setEditable(false);
		button.addActionListener(this);
		button2.addActionListener(this);
		
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JButton button= new JButton("Add Name");
	JButton button2= new JButton("View Names");
	JTextArea textarea = new JTextArea(1, 20);
	String allnames= "";
	int guestnumber;
	ArrayList <String> guestlist=new ArrayList();
	
	public static void main(String[] args) {
		_02_GuestBook guestbook=new _02_GuestBook();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
		String names	=JOptionPane.showInputDialog("Please enter a name");
			guestlist.add(names);
		}
		else if(e.getSource()==button2) {
			for(int i=0; i<guestlist.size(); i++) {	
				String s= guestlist.get(i);
				guestnumber= i+1;
				if (guestnumber<guestlist.size()) {
					allnames=allnames+"Guest #"+guestnumber+": "+guestlist.get(i)+"\n";
				}
				else if (guestnumber==guestlist.size()) {
					allnames=allnames+"Guest #"+guestnumber+": "+guestlist.get(i);
				}
				//jop prints one at a time instead of in one list like it should.
			//JOptionPane.showMessageDialog(null, "Guest #"+guestnumber+": " +s);
			
			}
			textarea.setText(allnames);
		}
	}
	
}
