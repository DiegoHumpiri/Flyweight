package flyweightBasico;

import java.awt.*;

public class Test {
	static int CANVAS_SIZE = 500;
    static int BULLETS_TO_DRAW = 100;
    static int BULLET_TYPES = 3;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BattleField field = new BattleField();
		for (int i = 0; i < Math.floor(BULLETS_TO_DRAW / BULLET_TYPES); i++) {
            field.spawnBullet( rand(0, CANVAS_SIZE), rand(0, CANVAS_SIZE),
                    "Balla 9mm", Color.GREEN, i % 3 + 1 );
            field.spawnBullet( rand(0, CANVAS_SIZE), rand(0, CANVAS_SIZE),
                    "Balla 5mm", Color.ORANGE, i % 3 + 1 );
            field.spawnBullet( rand(0, CANVAS_SIZE), rand(0, CANVAS_SIZE),
                    "Balla 7mm", Color.ORANGE, i % 3 + 1 );
        }
		field.setSize(CANVAS_SIZE, CANVAS_SIZE);
        field.setVisible(true);
	}
	
	private static int rand(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

}