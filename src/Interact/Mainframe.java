package Interact;

import Component.AnimalState.AnimalState;
import Component.Animals.Cow;
import Component.Animals.Pig;
import Component.Animals.Skeleton;
import Component.Animals.Zombie;
import Game.World;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;

public class Mainframe {
    static JFrame mainFrame;
    static JFrame setFrame;
    static private JPanel mainPanel;
    static private JPanel setPanel;

    public static JFrame getMainFrame()
    {
        return mainFrame;
    }

    public static void main(String[] args) throws IOException
    {
        //initial the animallist -- create some creatures
        AnimalState.getAnimalList().add(new Cow(new Point.Double(2020,127.99-30)));
        AnimalState.getAnimalList().add(new Cow(new Point.Double(1024,127.99-30)));
        AnimalState.getAnimalList().add(new Pig(new Point.Double(2034,127.99-30)));
        AnimalState.getAnimalList().add(new Skeleton(new Point.Double(2050,127.99-30)));
        AnimalState.getAnimalList().add(new Zombie(new Point.Double(2060,127.99-30)));

        // as soon as u open the game, the world would be initially loaded
        World.main(null);

        //draw the mainframe of the mainmenu and the setFrame of the settings
        mainFrame = new JFrame("Minecraft 2D version"); //set the frame of the mainMenu
        setFrame = new JFrame("Minecraft 2D version");  //set the frame of the settings
        mainPanel = new JPanel();
        setPanel = new JPanel();

        //load the background pictures
        Image image = ImageIO.read(new FileInputStream("image/Mainmenu.png"));
        Image image1 = ImageIO.read(new FileInputStream("image/Settings.png"));

        //draw the panel of the settings interface
        Settings settings = new Settings();
        settings.paintPanel(image1.getGraphics());

        setPanel = settings.getSetPanel();
        setFrame.add(setPanel);
        setPanel.setVisible(true);

        setFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setFrame.setSize(1200,800);
        setFrame.setLocation(200,100);
        setFrame.setVisible(false);

        //draw the panel of the mainmenu
        Mainmenu mainmenu = new Mainmenu();
        mainmenu.paintPanel(image.getGraphics());

        mainPanel = mainmenu.getMyPanel();
        mainFrame.add(mainPanel);
        mainPanel.setVisible(true);

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(1200,800);
        mainFrame.setLocation(200,100);
        mainFrame.setVisible(true);
    }
}
