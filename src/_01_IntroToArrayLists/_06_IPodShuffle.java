package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Song boogieNights = new Song("boogieNights.mp3");
	Song boogieWonderland = new Song("boogieWonderland.mp3");
	Song gotMeLovinYou = new Song("gotMeLovinYou.mp3");
	Song whoHasTheTime = new Song("whoHasTheTime.mp3");
	Song whatYouWontDo = new Song("whatYouWontDoForLove.mp3");
	ArrayList<Song> songs = new ArrayList<Song>();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton randoButton = new JButton();
	
	public _06_IPodShuffle() {
		
		// 1. Use the Song class the play the demo.mp3 file.
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
				
				frame.add(panel);
				frame.setSize(1000, 1000);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				songs.add(boogieNights);
				button1.setText("Boogie Nights");
				button1.addActionListener(this);
				panel.add(button1);
				
				songs.add(boogieWonderland);
				button2.setText("Boogie Wonderland");
				button2.addActionListener(this);
				panel.add(button2);
				
				songs.add(gotMeLovinYou);
				button3.setText("Got Me Loving You");
				button3.addActionListener(this);
				panel.add(button3);
				
				songs.add(whoHasTheTime);
				button4.setText("Who Has The Time");
				button4.addActionListener(this);
				panel.add(button4);
				
				songs.add(whatYouWontDo);
				button5.setText("What You Won't Do For Love");
				button5.addActionListener(this);
				panel.add(button5);
				
				randoButton.setText("Play Random Song");
				randoButton.addActionListener(this);
				panel.add(randoButton);
				
				frame.pack();
	}
	
	public static void main(String[] args) {
		new _06_IPodShuffle();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < songs.size(); i++) {
			//if (songs.get(i).)
			songs.get(i).stop();
		}
		if (e.getSource() == button1) {
			boogieNights.play();
		}
		if (e.getSource() == button2) {
			boogieWonderland.play();
		}
		if (e.getSource() == button3) {
			gotMeLovinYou.play();
		}
		if (e.getSource() == button4) {
			whoHasTheTime.play();
		}
		if (e.getSource() == button5) {
			whatYouWontDo.play();
		}
		if (e.getSource() == randoButton) {
			int s = new Random().nextInt(5);
			songs.get(s).play();
		}
	}
}