package Game.Synthetic;

import Thing.Square;

public class Recipe {
    private int[] table = new int[9];

    Recipe(Square[] curTable) {
        for (int i = 0; i < 9; i++) {
            if (curTable[i] == null) {
                table[i] = 0;
            } else {
                table[i] = curTable[i].id;
            }
        }
    }

    Recipe(Square[][] curTable) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (curTable[j][i] == null) {
                    table[3 * i + j] = -1;
                } else {
                    table[3 * i + j] = curTable[j][i].id;
                }
            }
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
