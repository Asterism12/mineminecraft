package Game.Synthetic;

import Thing.Square;

import java.util.HashMap;

public class SyntheticTable {
    private static HashMap<Recipe, TableOutput> map = new HashMap<>();

    public static boolean isRecipe(Square[] table) {
        Recipe r = new Recipe(table);
        return map.keySet().contains(r);
    }

    public static TableOutput getOutput(Square[] table) {
        Recipe r = new Recipe(table);
        return map.get(r);
    }
}
