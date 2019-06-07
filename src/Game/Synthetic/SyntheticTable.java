package Game.Synthetic;

import Thing.Armor.IronChest;
import Thing.Armor.IronHelmet;
import Thing.Armor.IronPants;
import Thing.Armor.IronShoes;
import Thing.Otherthing.Charcoal;
import Thing.Square;
import Thing.Weapon.*;
import Thing.Wood;
import Thing.WoodPanel;

import java.util.HashMap;

public class SyntheticTable {
    private static HashMap<Recipe, TableOutput> map = new HashMap<>();

    private static void getEmptySquares(Square[][] squares) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                squares[i][j] = null;
            }
        }
        return;
    }

    public static boolean isRecipe(Square[] table) {
        Recipe r = new Recipe(table);
        return map.keySet().contains(r);
    }

    public static TableOutput getOutput(Square[] table) {
        Recipe r = new Recipe(table);
        return map.get(r);
    }

    public static void initSyntheticTable() {
        map.put(new Recipe(new int[]{0, 0, 0, 0, 7, 0, 0, 0, 0}), new TableOutput(new WoodPanel(), 4));//1
        map.put(new Recipe(new int[]{0, 0, 0, 0, 6, 0, 0, 6, 0}), new TableOutput(new WoodStick(), 4));//2

        map.put(new Recipe(new int[]{6, 6, 0, 6, 1, 0, 0, 1, 0}), new TableOutput(new WoodAxe(), 1));//3
        map.put(new Recipe(new int[]{6, 6, 6, 0, 1, 0, 0, 1, 0}), new TableOutput(new WoodPick(), 1));//4
        map.put(new Recipe(new int[]{0, 6, 0, 0, 1, 0, 0, 1, 0}), new TableOutput(new WoodSpade(), 1));//5
        map.put(new Recipe(new int[]{0, 6, 0, 0, 6, 0, 0, 1, 0}), new TableOutput(new WoodSword(), 1));//6

        map.put(new Recipe(new int[]{21, 21, 0, 21, 1, 0, 0, 1, 0}), new TableOutput(new WoodAxe(), 1));//3-i
        map.put(new Recipe(new int[]{21, 21, 21, 0, 1, 0, 0, 1, 0}), new TableOutput(new WoodPick(), 1));//4-i
        map.put(new Recipe(new int[]{0, 21, 0, 0, 1, 0, 0, 1, 0}), new TableOutput(new WoodSpade(), 1));//5-i
        map.put(new Recipe(new int[]{0, 21, 0, 0, 21, 0, 0, 1, 0}), new TableOutput(new WoodSword(), 1));//6-i

        map.put(new Recipe(new int[]{40, 40, 0, 40, 1, 0, 0, 1, 0}), new TableOutput(new WoodAxe(), 1));//3-d
        map.put(new Recipe(new int[]{40, 40, 40, 0, 1, 0, 0, 1, 0}), new TableOutput(new WoodPick(), 1));//4-d
        map.put(new Recipe(new int[]{0, 40, 0, 0, 1, 0, 0, 1, 0}), new TableOutput(new WoodSpade(), 1));//5-d
        map.put(new Recipe(new int[]{0, 40, 0, 0, 40, 0, 0, 1, 0}), new TableOutput(new WoodSword(), 1));//6-d

        map.put(new Recipe(new int[]{21, 21, 21, 21, 0, 21, 0, 0, 0}), new TableOutput(new IronHelmet(), 1));//7
        map.put(new Recipe(new int[]{21, 0, 21, 21, 21, 21, 21, 21, 21}), new TableOutput(new IronChest(), 1));//8
        map.put(new Recipe(new int[]{21, 21, 21, 21, 0, 21, 21, 0, 21}), new TableOutput(new IronPants(), 1));//9
        map.put(new Recipe(new int[]{0, 0, 0, 21, 0, 21, 21, 0, 21}), new TableOutput(new IronShoes(), 1));//10

        map.put(new Recipe(new int[]{40, 40, 40, 40, 0, 40, 0, 0, 0}), new TableOutput(new IronHelmet(), 1));//7-d
        map.put(new Recipe(new int[]{40, 0, 40, 40, 40, 40, 40, 40, 40}), new TableOutput(new IronChest(), 1));//8-d
        map.put(new Recipe(new int[]{40, 40, 40, 40, 0, 40, 40, 0, 40}), new TableOutput(new IronPants(), 1));//9-d
        map.put(new Recipe(new int[]{0, 0, 0, 40, 0, 40, 40, 0, 40}), new TableOutput(new IronShoes(), 1));//10-d

        map.put(new Recipe(new int[]{0, 0, 0, 7, 0, 0, 0, 0, 0}), new TableOutput(new Charcoal(), 1));//11
    }
}
