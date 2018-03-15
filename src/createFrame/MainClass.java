package createFrame;

import javax.swing.JFrame;

import game.Game;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 JFrame jframe=new JFrame();
 jframe.pack();
  jframe.setSize(640, 480);
  jframe.setResizable(false);
  jframe.setLocationRelativeTo(null);
  jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  jframe.add(new Game());
  jframe.setVisible(true);
	}

}
