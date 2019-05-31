package Thing;

import java.awt.*;

public abstract class Square {
    int id;
    int break_level;
    boolean wight = false;
    boolean liquid = false;
    boolean pile = true;
    boolean food = false;
    boolean takeup = true;
    boolean through = false;
    boolean putdown = true;
    private Image pic;
    public Image getPic(){
        return pic;
    }
}
