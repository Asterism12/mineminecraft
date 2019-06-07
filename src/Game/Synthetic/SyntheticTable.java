package Game.Synthetic;

import Thing.Square;
import Thing.Wood;
import Thing.WoodPanel;

import java.util.HashMap;

public class SyntheticTable {
    private static HashMap<Recipe, TableOutput> map = new HashMap<>();
    private static void getEmptySquares(Square[][] squares){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                squares[i][j]=null;
            }
        }
        return ;
    }

    public static boolean isRecipe(Square[] table) {
        Recipe r = new Recipe(table);
        return map.keySet().contains(r);
    }

    public static TableOutput getOutput(Square[] table) {
        Recipe r = new Recipe(table);
        return map.get(r);
    }

    public static void initSyntheticTable(){
        Square[][] squares=new Square[3][3];
        squares[1][1]=new Wood();
        Recipe recipe=new Recipe(squares);
        TableOutput tableOutput=new TableOutput();
        tableOutput.num=4;
        tableOutput.output=new WoodPanel();
        map.put(recipe,tableOutput);
    }
}
