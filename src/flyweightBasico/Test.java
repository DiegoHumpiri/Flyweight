package flyweightBasico;

import java.awt.*;

public class Test {
	static int CANVAS_SIZE = 500;
    static int BULLETS_TO_DRAW = 1000000;
    static int BULLET_TYPES = 3;
    
	public static void main(String[] args) {
		BattleField field = new BattleField();
		
		for (int i = 0; i < Math.floor(BULLETS_TO_DRAW / BULLET_TYPES); i++) {
            field.spawnBullet( rand(0, CANVAS_SIZE), rand(0, CANVAS_SIZE),
                    "Bala 9mm", Color.GREEN, ( 9 ) );
            field.spawnBullet( rand(0, CANVAS_SIZE), rand(0, CANVAS_SIZE),
                    "Bala 5mm", Color.ORANGE, ( 5 ) );
            field.spawnBullet( rand(0, CANVAS_SIZE), rand(0, CANVAS_SIZE),
                    "Bala 7mm", Color.BLUE, ( 7 ) );
        }
		
		System.out.println(BULLETS_TO_DRAW + " bullets drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Tree size (4 bytes) * " + BULLETS_TO_DRAW);
        System.out.println("+ TreeTypes size (~30 bytes) * " + BULLET_TYPES + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((BULLETS_TO_DRAW * 4 + BULLET_TYPES * 30) / 1024 / 1024) +
                "MB (instead of " + ((BULLETS_TO_DRAW * 34) / 1024 / 1024) + "MB)");
	}
	
	private static int rand(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
	
}
