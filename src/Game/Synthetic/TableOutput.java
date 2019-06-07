package Game.Synthetic;

import Thing.Square;

public class TableOutput {
    private Square output;
    private int num;

    public Square getOutput() {
        return output;
    }

    public int getNum() {
        return num;
    }

    public TableOutput(Square output, int num) {
        this.output = output;
        this.num = num;
    }
}
