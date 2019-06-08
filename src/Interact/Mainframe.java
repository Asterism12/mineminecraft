package Interact;

import Component.AnimalState.AnimalState;
import Component.Animals.Cow;
import Component.Animals.Pig;
import Game.Player;
import Game.World;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
        AnimalState.getAnimalList().add(new Cow(new Point.Double(2020,127.99-10)));
        AnimalState.getAnimalList().add(new Cow(new Point.Double(1024,127.99-10)));
        AnimalState.getAnimalList().add(new Pig(World.startLocation));
        World.main(null);
        mainFrame = new JFrame("Minecraft 2D version");
        setFrame = new JFrame("Minecraft 2D version");
        mainPanel = new JPanel();
        setPanel = new JPanel();

        Image image = ImageIO.read(new FileInputStream("image/Mainmenu.png"));
        Image image1 = ImageIO.read(new FileInputStream("image/Settings.png"));

        Settings settings = new Settings();
        settings.paintPanel(image1.getGraphics());

        setPanel = settings.getSetPanel();
        setFrame.add(setPanel);
        setPanel.setVisible(true);

        setFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setFrame.setSize(1200,800);
        setFrame.setLocation(200,100);
        setFrame.setVisible(false);

        Mainmenu mainmenu = new Mainmenu();
        mainmenu.paintPanel(image.getGraphics());

        //myFrame.add()
        mainPanel = mainmenu.getMyPanel();
        mainFrame.add(mainPanel);
        mainPanel.setVisible(true);

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(1200,800);
        mainFrame.setLocation(200,100);
        mainFrame.setVisible(true);
    }
}
