import java.awt.*; //for graphics

import DrawingPanel.DrawingPanel;


public class Mickey {

	
	public static void main(String[] args) {
		
		//create drawing panel
		DrawingPanel panel = new DrawingPanel(220, 150);
		//set background color
		panel.setBackground(Color.YELLOW);
		Graphics g = panel.getGraphics();	
						
		//color
		g.setColor(Color.BLUE);
		g.fillOval(130, 25,40, 40);
		g.setColor(Color.BLUE);
		g.fillOval(50, 25, 40, 40);
		g.setColor(Color.RED);
		g.fillRect(70, 45, 80, 60);
		g.setColor(Color.BLACK);
		g.drawLine(70, 75, 149, 75);
}
}
