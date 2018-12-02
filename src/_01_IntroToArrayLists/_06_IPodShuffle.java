package _01_IntroToArrayLists;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle{
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
				JFrame frame = new JFrame();
				JPanel panel = new JPanel();
				frame.add(panel);
				frame.setSize(1000, 1000);
				frame.setVisible(true);
				ArrayList<Song> songs = new ArrayList<Song>();
				
				Song boogieNights = new Song("boogieNights.mp3");
				songs.add(boogieNights);
				JButton button1 = new JButton();
				button1.setText("Boogie Nights");
//				button1.addActionListener(this);
				panel.add(button1);
				
				Song boogieWonderland = new Song("boogieWonderland.mp3");
				songs.add(boogieWonderland);
				JButton button2 = new JButton();
				button2.setText("Boogie Wonderland");
				panel.add(button2);
				
				Song gotMeLovinYou = new Song("gotMeLovinYou.mp3");
				songs.add(gotMeLovinYou);
				JButton button3 = new JButton();
				button1.setText("Got Me Loving You");
				panel.add(button3);
				
				Song whoHasTheTime = new Song("whoHasTheTime.mp3");
				songs.add(whoHasTheTime);
				JButton button4 = new JButton();
				button1.setText("Who Has The Time");
				panel.add(button4);
				
				Song whatYouWontDo = new Song("whatYouWontDoForLove.mp3");
				songs.add(whatYouWontDo);
				JButton button5 = new JButton();
				button1.setText("What You Won't Do For Love");
				panel.add(button5);
				
				for (int i = 0; i < songs.size(); i++) {
					
					
				}
	}
	
	public static void main(String[] args) {
		new _06_IPodShuffle();
	}
}