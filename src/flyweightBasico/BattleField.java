package flyweightBasico;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class BattleField extends JFrame {
	private ArrayList<Bullet> bullets = new ArrayList<>() ;
	public void spawnBullet( int x, int y, String name, Color color, int size) {
		BulletType type = BulletFactory.getBulletType(name, color, size );
		Bullet bullet = new Bullet( x, y, type );
		bullets.add(bullet);
	}
	
	@Override
	public void paint( Graphics g ) {
		for( Bullet bullet : bullets ) {
			bullet.draw( g );
		}
	}
}
