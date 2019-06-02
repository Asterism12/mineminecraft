package Thing;

import java.awt.*;

public abstract class Square {
    public int id;
    public int break_level;
    public boolean wight = false;
    public boolean liquid = false;
    public boolean pile = true;
    public boolean food = false;
    public boolean takeup = true;
    public boolean through = false;
    public boolean putdown = true;
    private Image pic;
    private Image toolBarPic;
    public Image getPic(){
        return pic;
    }

    public Image getToolBarPic() {
        return toolBarPic;
    }
}
