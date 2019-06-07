package Game;

import Game.Synthetic.SyntheticTable;
import Game.Synthetic.TableOutput;
import Thing.Square;

public class Toolbar {
    //前10个是工具栏内的物品，然后40个是背包内的物品,然后4个是护具，最后10个是工作台
    private Square[] squares = new Square[64];
    private int[] number = new int[64];

    public synchronized void pickUp(Square square) {//捡起方块
        if (square == null) return;
        if (square.takeUp) {
            for (int i = 0; i < 50; i++) {
                if (squares[i] == null) {
                    squares[i] = square;
                    number[i] = 1;
                    break;
                }
                if (squares[i].getClass().equals(square.getClass()) && square.pile && number[i] <= 64) {
                    number[i]++;
                    break;
                }
            }
        }
    }

    public synchronized void pickUp(Square square, int number) {
        if (square == null || (!square.pile && number > 1)) return;
        if (square.takeUp) {
            for (int i = 0; i < 50; i++) {
                if (squares[i] == null) {
                    squares[i] = square;
                    this.number[i] = number;
                    break;
                }
                if (squares[i].getClass().equals(square.getClass()) && this.number[i] <= 64 - number) {
                    this.number[i] += number;
                    break;
                }
            }
        }
    }

    public int[] getNumber() {
        return number;
    }

    public void setNumber(int[] number) {
        this.number = number;
    }

    synchronized Square[] getSquares() {
        return squares;
    }

    synchronized void addSquare(Square square, int i, int number) {//向第i个位置放置square
        if (i >= 0 && i < 64) {
            if (squares[i] == null) {
                squares[i] = square;
                this.number[i] = number;
                return;
            }
            if (square.getClass().equals(squares[i].getClass()) && square.pile) {
                if (number + this.number[i] <= 64)
                    this.number[i] = this.number[i] + number;
                else {
                    int tmp = this.number[i];
                    this.number[i] = 64;
                    pickUp(square, number + tmp - 64);
                }
            } else {//exchange
                Square square1 = squares[i];
                int square1number = this.number[i];
                squares[i] = square;
                this.number[i] = number;
                pickUp(square1, square1number);
            }
        }
    }

    //检查当前Table中搭配是否可以合成，如果可以将结果放在输出格子中
    synchronized void checkRecipe() {
        Square[] curTable = new Square[9];
        for (int i = 0; i < 9; i++) {
            curTable[i] = squares[54 + i];
        }
        if (SyntheticTable.isRecipe(curTable)) {
            TableOutput to = SyntheticTable.getOutput(curTable);
            addSquare(to.getOutput(), 63, to.getNum());
        }
    }

    //将Table中内容清空
    synchronized void tableClear() {
        for (int i = 54; i <= 62; i++) {
            System.out.println("Cleared!");
            squares[i] = null;
            number[i] = 0;
        }
    }

    Toolbar() {
        for (int i = 0; i < 64; i++) {
            number[i] = 0;
        }
    }
}
