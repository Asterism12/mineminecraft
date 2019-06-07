package Game.Synthetic;

import Thing.*;
import Thing.Armor.*;
import Thing.Otherthing.Charcoal;
import Thing.Tool.*;

import java.util.HashMap;

public class SyntheticTable {
    private static HashMap<Recipe, TableOutput> map = new HashMap<>();

    public static boolean isRecipe(Square[] table) {
        Recipe r = new Recipe(table);
        return map.keySet().contains(r);
    }

    public static int getRecipeNum(int[] number) {
        int min = 999999;
        for (int i = 0; i < 9; i++) {
            if (number[i] == 0) {
                continue;
            }
            if (number[i] < min) {
                min = number[i];
            }
        }
        if (min == 999999) {
            return 0;
        }
        return min;
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

        map.put(new Recipe(new int[]{21, 21, 0, 21, 1, 0, 0, 1, 0}), new TableOutput(new IronAxe(), 1));//3-i
        map.put(new Recipe(new int[]{21, 21, 21, 0, 1, 0, 0, 1, 0}), new TableOutput(new IronPick(), 1));//4-i
        map.put(new Recipe(new int[]{0, 21, 0, 0, 1, 0, 0, 1, 0}), new TableOutput(new IronSpade(), 1));//5-i
        map.put(new Recipe(new int[]{0, 21, 0, 0, 21, 0, 0, 1, 0}), new TableOutput(new IronSword(), 1));//6-i

        map.put(new Recipe(new int[]{40, 40, 0, 40, 1, 0, 0, 1, 0}), new TableOutput(new DiamondAxe(), 1));//3-d
        map.put(new Recipe(new int[]{40, 40, 40, 0, 1, 0, 0, 1, 0}), new TableOutput(new DiamondPick(), 1));//4-d
        map.put(new Recipe(new int[]{0, 40, 0, 0, 1, 0, 0, 1, 0}), new TableOutput(new DiamondSpade(), 1));//5-d
        map.put(new Recipe(new int[]{0, 40, 0, 0, 40, 0, 0, 1, 0}), new TableOutput(new DiamondSword(), 1));//6-d

        map.put(new Recipe(new int[]{21, 21, 21, 21, 0, 21, 0, 0, 0}), new TableOutput(new IronHelmet(), 1));//7
        map.put(new Recipe(new int[]{21, 0, 21, 21, 21, 21, 21, 21, 21}), new TableOutput(new IronChest(), 1));//8
        map.put(new Recipe(new int[]{21, 21, 21, 21, 0, 21, 21, 0, 21}), new TableOutput(new IronPants(), 1));//9
        map.put(new Recipe(new int[]{0, 0, 0, 21, 0, 21, 21, 0, 21}), new TableOutput(new IronShoes(), 1));//10

        map.put(new Recipe(new int[]{40, 40, 40, 40, 0, 40, 0, 0, 0}), new TableOutput(new DiamondHelmet(), 1));//7-d
        map.put(new Recipe(new int[]{40, 0, 40, 40, 40, 40, 40, 40, 40}), new TableOutput(new DiamondChest(), 1));//8-d
        map.put(new Recipe(new int[]{40, 40, 40, 40, 0, 40, 40, 0, 40}), new TableOutput(new DiamondPants(), 1));//9-d
        map.put(new Recipe(new int[]{0, 0, 0, 40, 0, 40, 40, 0, 40}), new TableOutput(new DiamondShoes(), 1));//10-d

        map.put(new Recipe(new int[]{0, 0, 0, 7, 0, 0, 0, 0, 0}), new TableOutput(new Charcoal(), 1));//11

        map.put(new Recipe(new int[]{0, 0, 0, 0, 20, 0, 0, 41, 0}), new TableOutput(new IronIngot(), 1));//11
        map.put(new Recipe(new int[]{0, 0, 0, 0, 20, 0, 0, 42, 0}), new TableOutput(new IronIngot(), 1));//11
        map.put(new Recipe(new int[]{0, 0, 0, 0, 30, 0, 0, 41, 0}), new TableOutput(new Diamond(), 1));//11
        map.put(new Recipe(new int[]{0, 0, 0, 0, 30, 0, 0, 42, 0}), new TableOutput(new Diamond(), 1));//11
    }
}
