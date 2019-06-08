package Interact;

import Game.Player;
import Game.World;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

public class Settings {
    private static JFrame setFrame;
    private static JPanel setPanel;
    private ChangeListener listener;
    private JColorChooser colorChooser;

    //respectively stands for the color of the color saver and the head, arm, body, leg of the character
    private static Color color,headColor = Color.WHITE, armColor = Color.WHITE, bodyColor = Color.WHITE, legColor = Color.WHITE;
    private static int initHp;  //the initial hp of the character
    String buttonName;  //used for saving the name of the button clicked

    Settings() { }

    class ColorListener implements  ActionListener{
        @Override
        public synchronized  void actionPerformed(ActionEvent e){
            color = colorChooser.getColor();
            if (color == null) {
                return;
            }
            if (buttonName.equals("HEAD"))
                headColor = color;
            if (buttonName.equals("ARM"))
                armColor = color;
            if (buttonName.equals("BODY"))
                bodyColor = color;
            if (buttonName.equals("LEG"))
                legColor = color;
        }
    }

    class SimpleListener implements ActionListener{ //get the action

        @Override
        public synchronized void actionPerformed(ActionEvent e){

            if(e == null)
                return;
            buttonName = e.getActionCommand();
            if(buttonName == null)
                return;
            else if (buttonName.equals("BACK")) {
                Mainframe.setFrame.setVisible(false);
                Mainframe.mainFrame.setVisible(true);
            }
            else {

                colorChooser = new JColorChooser();
                JDialog dialog = JColorChooser.createDialog(setPanel, "选择颜色", false,
                        colorChooser, new ColorListener(), null);
                dialog.setVisible(true);
            }
        }
    }

    public void paintPanel(Graphics g)
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
        setPanel.setLayout(null);

        setTitle();
        setInitHP();
        setColor(World.player);

        setPanel.setBackground(new Color(11,180,227));
        setPanel.setVisible(true);

    }

    public void setTitle()
    {
        JLabel jLabel = new JLabel("Settings");
        setPanel.add(jLabel);
        jLabel.setFont(new Font("Deeko Comic Regular",Font.BOLD,30));
        jLabel.setBounds(500,50,300,100);
    }
    public void setInitHP()
    {
        listener = new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JSlider slider = (JSlider) e.getSource();
            }
        };

        JSlider slider = new JSlider(0,10,0);
        slider.setMajorTickSpacing(2);
        slider.setMinorTickSpacing(1);

        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setPaintTrack(true);

        Hashtable<Integer,JComponent> hashtable = new Hashtable<>();
        hashtable.put(0,new JLabel("10"));
        hashtable.put(10,new JLabel("20"));
        slider.setLabelTable(hashtable);

        slider.setBackground(new Color(11,180,227));
        slider.setBounds(510,200,300,100);

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                initHp = 10+slider.getValue();
            }
        });

        JLabel label = new JLabel("Initial HP");
        setPanel.add(label);
        label.setBounds(300,190,150,100);
        label.setFont(new Font("Deeko Comic Regular",Font.BOLD,20));
        label.setBackground(new Color(11,180,227));
        label.setVisible(true);

        JLabel label2 = new JLabel("Color");
        setPanel.add(label2);
        label2.setBounds(340,400,130,100);
        label2.setFont(new Font("Deeko Comic Regular",Font.BOLD,20));
        label2.setBackground(new Color(11,180,227));
        label2.setVisible(true);
        setPanel.add(slider);

    }

    public void setColor(Player player)
    {
        SimpleListener listener = new SimpleListener();
        addButton(listener,510,400,"HEAD",new Color(11,180,227));
        addButton(listener,750,400,"ARM",new Color(11,180,227));
        addButton(listener,510,490,"BODY",new Color(11,180,227));
        addButton(listener,750,490,"LEG",new Color(11,180,227));
        addButton(listener,500,650,"BACK",null);
    }

    public void addButton(SimpleListener listener,int x,int y,String title,Color color)
    {
        JButton button = new JButton(title);
        button.addActionListener(listener);
        button.setFont(new Font("Deeko Comic Regular",Font.BOLD,20));
        setPanel.add(button);
        button.setBounds(x,y,200,50);
        button.setBackground(color);
    }

    public static Color getHeadColor()
    {
        return headColor;
    }

    public static Color getArmColor()
    {
        return armColor;
    }

    public static Color getBodyColor()
    {
        return bodyColor;
    }

    public static Color getLegColor()
    {
        return legColor;
    }

    public static int getInitHp() {return initHp; };

    JPanel getSetPanel() {
        return setPanel;
    }
}

