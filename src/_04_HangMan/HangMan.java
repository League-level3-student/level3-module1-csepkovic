package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel word = new JLabel();
	Stack<String> words = new Stack<String>();
	public void createUI() {
		frame.setSize(1000, 1000);
		frame.add(panel);
		frame.addKeyListener(this);
		frame.setVisible(true);
	}
	public void playHangMan() {
		int gameLength = Integer.parseInt(JOptionPane.showInputDialog("How many words do you want to do? (up to 266)"));
		String newWord;
		for (int i = 0; i < gameLength; i++) {
			newWord = Utilities.readRandomLineFromFile("dictionary.txt");
			while (words.contains(newWord) == false) {
				newWord = Utilities.readRandomLineFromFile("dictionary.txt");
			}
			words.add(newWord);
		} String currentWord;
		String blankWord;
		for (int i = 0; i < gameLength; i++) {
			blankWord = "";
			currentWord = words.pop();
			for (int j = 0; j < currentWord.length(); j++) {
				blankWord += "_ ";
			}
		}
	} public void newWordMethod() {
		
	}
	public static void main(String[] args) {
		HangMan hangman = new HangMan();
		hangman.createUI();
		hangman.playHangMan();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
