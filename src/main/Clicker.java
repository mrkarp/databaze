package main;

import java.awt.Frame;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.AWTEvent;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.WindowEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class Clicker extends Frame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void main(String arg[]) {
        new Clicker();
    }
    @SuppressWarnings("deprecation")
	Clicker() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        add(new ClickerCanvas());
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}

class ClickerCanvas extends Canvas implements MouseListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int x;
    int y;
    boolean inside = false;
    ClickerCanvas() {
        setSize(800,600);
        addMouseListener(this);
    }
    public void mouseClicked(MouseEvent event) {
        x = event.getX();
        y = event.getY();
        repaint();
    }
    public void mouseEntered(MouseEvent event) {
        inside = true;
        x = event.getX();
        y = event.getY();
        repaint();
    }
    public void mouseExited(MouseEvent event) {
        inside = false;
        repaint();
    }
    public void mousePressed(MouseEvent event) {
    }
    public void mouseReleased(MouseEvent event) {
    }
    public void paint(Graphics g) {
        Rectangle rect = getBounds();
        if(inside) {
            g.setColor(Color.red);
            g.fillRect(0,0,rect.width,rect.height);
            String str = "(" + x + "," + y + ")";
            g.setColor(Color.white);
            g.drawString(str,x,y);
        } else {
            g.setColor(Color.pink);
            g.fillRect(0,0,rect.width,rect.height);
        }
    }
}