package flyweightBasico;

import java.awt.*;

public class BulletType {
	private String name;
	private Color color;
	private int size;
	public BulletType( String name, Color color, int size ) {
		this.name = name;
		this.color = color;
		this.size = size;
	}
}