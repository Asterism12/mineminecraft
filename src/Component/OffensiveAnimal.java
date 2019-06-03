package Component;

import Game.Player;

import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OffensiveAnimal extends Animal {
    private int attackForce = 0;
    public  OffensiveAnimal() { }

    public void setAttackForce(int newAttackForce)
    {
        this.attackForce = newAttackForce;
    }

    public int getAttackForce()
    {
        return attackForce;
    }

    public synchronized void attack(Player player) //attack the player
    {
        int playerDp = player.getDp();  //get the current defensive power of the player
        int currentHp = player.getHp(); //get the current hit point of the player

        if(playerDp - attackForce < 0)
            player.setHp(player.getHp() - (attackForce - playerDp));
        else
            player.setHp(player.getHp() - 1);   //only if the animal attacks the player, the player will get hurt
    }

}
