package ejemplo;

import java.awt.*;
import java.util.*;

public class TreeFactory {
	static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
            treeTypes.put(name, result);
            System.out.println( "Nuevo flyweight agregado " + name );
        }
        return result;
    }
}
