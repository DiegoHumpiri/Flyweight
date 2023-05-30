package flyweightBasico;

import java.awt.*;
import javax.swing.*;

public class BulletType {
	String name;
	private Color color;
	private int size;
	public BulletType( String name, Color color, int size ) {
		this.name = name;
		this.color = color;
		this.size = size;
	}
	public void draw( Graphics g, int x, int y ) {
		g.setColor( color );
		g.fillOval( x, y, size * 2, size );
	}
}