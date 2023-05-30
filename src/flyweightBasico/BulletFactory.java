package flyweightBasico;

import java.util.*;
import java.awt.*;

public class BulletFactory {
	static Map<String, BulletType> bulletTypes = new HashMap<>();
	public static BulletType getBulletType( String name, Color color, int size ) {
		BulletType result = bulletTypes.get( name );
		if( result == null ) {
			result = new BulletType( name, color, size );
			bulletTypes.put(name, result);
			System.out.println( "Nuevo flyweight agregado " + name );
		}
		return result;
	}
}
