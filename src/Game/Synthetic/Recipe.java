package Game.Synthetic;

import Thing.Square;

public class Recipe {
    private int[] table = new int[9];

    Recipe(Square[] curTable) {
        for (int i = 0; i < 9; i++) {
            if (curTable[i] == null) {
                table[i] = -1;
            } else {
                table[i] = curTable[i].id;
            }
        }
    }

    Recipe(int[] curTable){
        for(int i=0;i<9;i++){
            table[i]=curTable[i];
        }
    }

    @Override
    public int hashCode() {
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += table[i] * table[i] * i;
        }
        return sum;
    }

    public boolean equals(Object o) {
        if (o.getClass() != this.getClass()) {
            return false;
        }
        Recipe r = (Recipe) o;
        for (int i = 0; i < 9; i++) {
            if (table[i] != r.table[i]) {
                return false;
            }
        }

        return true;
    }
}
