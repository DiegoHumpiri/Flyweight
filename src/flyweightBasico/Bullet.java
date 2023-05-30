package flyweightBasico;

public class Bullet {
	private int x;
	private int y;
	private BulletType type;
	public Bullet( int x, int y, BulletType type) {
		this.x = x;
		this.y = y;
		this.type = type;
	}
}
