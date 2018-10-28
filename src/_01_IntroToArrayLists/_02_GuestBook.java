package _01_IntroToArrayLists;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	public static void main(String[] args) {
		new _02_GuestBook().createUI();
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;
	ArrayList<String> names;
	public void createUI() {
		names = new ArrayList<String>();
		frame = new JFrame();
		panel = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("Add Name");
		button1.addActionListener(this);
		button2 = new JButton("View Names");
		button2.addActionListener(this);
		panel.add(button1);
		button1.setPreferredSize(new Dimension(200, 100));
		panel.add(button2);
		button2.setPreferredSize(new Dimension(200, 100));
		frame.add(panel);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton)e.getSource();
		if (buttonClicked == button1) {
			String newName = JOptionPane.showInputDialog("Who are you adding to the list?");
			names.add(newName);
		}
		if (buttonClicked == button2) {
			JOptionPane.showMessageDialog(null, displayNames(names));
		}
	}
	public String displayNames(ArrayList<String> allNames) {
		StringBuilder storage = new StringBuilder();
		for (int i = 0; i < allNames.size(); i++) {
			storage.append("Guest #" + String.valueOf(i+1) + ": " + allNames.get(i) + "\n");
		}
		return storage.toString();
	}
}
