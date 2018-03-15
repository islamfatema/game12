package game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Game extends JPanel implements ActionListener
{

	private static final long serialVersionUID = 1L;
  Timer gameloopTimer;
public Game() {
	System.out.println("GAME");
	setFocusable(true);
	gameloopTimer=new Timer(10,this);
	gameloopTimer.start();
 }
public void paint(Graphics g) {
	super.paint(g);
	Graphics2D G2D=(Graphics2D) g;
}
@Override
public void actionPerformed(ActionEvent e) {
	repaint();
}
}
