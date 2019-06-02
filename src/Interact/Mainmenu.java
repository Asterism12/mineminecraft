package Interact;

import com.sun.tools.javac.Main;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.Buffer;

public class Mainmenu {
    private static JFrame myFrame;
    private static ImagePanel myPanel;
    private JButton myButton1,myButton2;

    private class SimpleListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            String buttonName = actionEvent.getActionCommand();

            //if();
        }
    }

    private class ImagePanel extends JPanel{
        Image image;

        public ImagePanel(String imagePath) throws FileNotFoundException,IOException
        {
            image = ImageIO.read(new FileInputStream(imagePath));
            setOpaque(true);
        }

        public void paintC(Graphics g) throws IOException,FileNotFoundException
        {
            SimpleListener listener = new SimpleListener();
            myPanel = new ImagePanel(new String("image/Mainmenu.png"));
            super.paintComponent(g);
            g.drawImage(image, 0, 0, null);

            myButton1 = new JButton("开始游戏");
            myButton2 = new JButton("退出游戏");
            myButton1.addActionListener(listener);
            myButton2.addActionListener(listener);


            myPanel.setLayout(null);
            myPanel.add(myButton1);
            myPanel.add(myButton2);
            myButton1.setBounds(250,200,100,30);
            myButton2.setBounds(250,240,100,30);
        }
    }

    public static void main(String args[]) throws FileNotFoundException,IOException,NullPointerException
    {
        myFrame = new JFrame("Minecraft 2D version");
        myFrame.getContentPane().add(myPanel);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(600,400);
        myFrame.setLocation(200,100);
        myFrame.setVisible(true);
        return;
    }
}
