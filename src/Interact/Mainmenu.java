package Interact;


import sun.applet.Main;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.charset.Charset;

class Mainmenu extends JPanel{

    private JPanel myPanel;
    private JButton myButton1,myButton2,myButton3,myButton4;
    private Image image;

    private class SimpleListener implements ActionListener{ //get the action
        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            String buttonName = actionEvent.getActionCommand();

            if(buttonName.equals("Begin"))
                System.out.println("Begin new game");
            if(buttonName.equals("Settings")){
                Mainframe.mainFrame.setVisible(false);
                Mainframe.setFrame.setVisible(true);
            }
            if(buttonName.equals("MoreInfo"))
                System.out.println("More Info");
            if(buttonName.equals("Exit"))
                System.out.println("Exit");
        }
    }

    void paintPanel(Graphics g) throws IOException,FileNotFoundException //add the components
    {
        new Mainmenu().registerCustomeFont("font/Deeko_Comic.ttf");

        SimpleListener listener = new SimpleListener();

        myPanel = new JPanel(){
            public void paintComponent(Graphics g)      //paint the background on the panel
            {
                super.paintComponent(g);
                ImageIcon i = new ImageIcon("image/Mainmenu.png");
                g.drawImage(i.getImage(),0,0,getWidth(),getHeight(),i.getImageObserver());
            }
        };
        myPanel.setOpaque(false);

        //add buttons on the panel
        myButton1 = new JButton("Begin");
        myButton2 = new JButton("Settings");
        myButton3 = new JButton("MoreInfo");
        myButton4 = new JButton("Exit");
        myButton1.setFont(new Font("Deeko Comic Regular",Font.BOLD,30));
        myButton2.setFont(new Font("Deeko Comic Regular",Font.BOLD,30));
        myButton3.setFont(new Font("Deeko Comic Regular",Font.BOLD,30));
        myButton4.setFont(new Font("Deeko Comic Regular",Font.BOLD,30));
        myButton1.addActionListener(listener);
        myButton2.addActionListener(listener);
        myButton3.addActionListener(listener);
        myButton4.addActionListener(listener);

        myPanel.setLayout(null);
        myPanel.add(myButton1);
        myPanel.add(myButton2);
        myPanel.add(myButton3);
        myPanel.add(myButton4);
        //myButton1.setFont();
        myButton1.setBounds(465,400,270,50);
        myButton2.setBounds(465,470,270,50);
        myButton3.setBounds(465,540,270,50);
        myButton4.setBounds(465,610,270,50);

        myPanel.setVisible(true);
    }

    private void registerCustomeFont(String filename)
    {
        File fontFile = new File(filename);

        Font newFont = null;

        try{
            newFont = Font.createFont(Font.TRUETYPE_FONT,fontFile);
            newFont.deriveFont(Font.BOLD,30F);
            GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();

            boolean register = graphicsEnvironment.registerFont(newFont);
//            if(register) {
//                System.out.println("注册字体成功");
//            } else {
//                System.out.println("注册字体失败");
//            }

        }
        catch (FontFormatException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public JPanel getMyPanel()
    {
        return myPanel;
    }
}
