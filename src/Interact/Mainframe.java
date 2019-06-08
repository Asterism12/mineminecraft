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
import java.io.FileNotFoundException;
import java.io.IOException;

public class Mainframe {
    static JFrame mainFrame;
    static JFrame setFrame;
    static JFrame infoFrame;
    static private JPanel mainPanel;
    static private JPanel setPanel;
    static private JPanel infoPanel;

    public static JFrame getMainFrame()
    {
        return mainFrame;
    }

    public static void main(String[] args)
    {
        try {
            init();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void init() throws IOException
    {
        //draw the mainframe of the mainmenu and the setFrame of the settings
        mainFrame = new JFrame("Minecraft 2D version"); //set the frame of the mainMenu
        setFrame = new JFrame("Minecraft 2D version");  //set the frame of the settings
        infoFrame = new JFrame("Minecraft 2D version");
        mainPanel = new JPanel();
        setPanel = new JPanel();
        infoPanel = new JPanel();

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

        //draw the panel of the infoMenu
        MoreInfo infoMenu = new MoreInfo();
        infoMenu.paintPanel(image.getGraphics());

        infoPanel = infoMenu.getInfoPanel();
        infoFrame.add(infoPanel);
        infoPanel.setVisible(true);

        infoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        infoFrame.setSize(1200,800);
        infoFrame.setLocation(200,100);
        infoFrame.setVisible(false);
    }

}
