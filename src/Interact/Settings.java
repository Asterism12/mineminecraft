package Interact;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;

class Settings {
    private static JFrame setFrame;
    private static JPanel setPanel;
    private ChangeListener listener;

    Settings() { }

    void paintPanel(Graphics g)
    {
        setPanel = new JPanel(){
            public void paintComponent(Graphics g)      //paint the background on the panel
            {
                super.paintComponent(g);
                ImageIcon i = new ImageIcon("image/Settings.png");
                g.drawImage(i.getImage(),0,0,getWidth(),getHeight(),i.getImageObserver());
            }
        };
        setPanel.setOpaque(false);

        listener = new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JSlider slider = (JSlider) e.getSource();
            }
        };

        JSlider slider = new JSlider(0,100,30);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(5);

        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setPaintTrack(true);

        Hashtable<Integer,JComponent> hashtable = new Hashtable<>();
        hashtable.put(0,new JLabel("Low"));
        hashtable.put(100,new JLabel("High"));
        slider.setLabelTable(hashtable);

        slider.setBackground(new Color(11,180,227));
        slider.setBounds(480,400,300,100);

        JLabel label = new JLabel("Volume");
        setPanel.add(label);
        label.setBounds(360,390,130,100);
        label.setFont(new Font("Deeko Comic Regular",Font.BOLD,20));
        label.setBackground(new Color(11,180,227));
        label.setVisible(true);

        setPanel.setLayout(null);
        setPanel.add(slider);
        setPanel.setBackground(new Color(11,180,227));
        setPanel.setVisible(true);




    }

    JPanel getSetPanel() {
        return setPanel;
    }
//    public static void main(String args[])
//    {
//        setFrame = new JFrame("Settings");
//        Image image = null;
//        try {
//            image = ImageIO.read(new FileInputStream(new String("image/Mainmenu.png")));
//        }
//        catch (FileNotFoundException e)
//        {
//            e.printStackTrace();
//        }
//        catch (IOException e)
//        {
//            e.printStackTrace();
//        }
//
//        new Settings().paintPanel();
//
//        setFrame.add(setPanel);
//
//        setFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setFrame.setSize(1200,800);
//        setFrame.setLocation(200,100);
//        setFrame.setVisible(true);
//        return;
//    }
}
