package Game;

import Thing.Square;

public class Toolbar {
    private Square[] squares = new Square[50];//前10个是工具栏内的物品，后40个是背包内的物品

    public synchronized void pickUp(Square square) {//捡起方块
        if (square.takeUp) {
            for (int i = 0; i < 50; i++) {
                if (squares[i] == null) {
                    squares[i] = square;
                    break;
                }
            }
        }
    }

    public synchronized Square[] getSquares() {
        return squares;
    }

    public synchronized void testUP(Square square,int i){//测试函数，向第i个位置放置一个square
        if(i>=0&&i<40)
            squares[i]=square;
    }
}
