package Interact;

import Game.Player;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

class Settings {
    private static JFrame setFrame;
    private static JPanel setPanel;
    private ChangeListener listener;
    private static Color color;

    Settings() { }

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
        setVolume();
        setColor(new Player());

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
    public void setVolume()
    {
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
        slider.setBounds(510,200,300,100);

        JLabel label = new JLabel("Volume");
        setPanel.add(label);
        label.setBounds(390,190,130,100);
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

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String buttonName = e.getActionCommand();

                if (buttonName.equals("BACK")) {
                    Mainframe.setFrame.setVisible(false);
                    Mainframe.mainFrame.setVisible(true);
                }
                else {
                    JColorChooser colorChooser = new JColorChooser();
                    JDialog dialog = JColorChooser.createDialog(setPanel, "选择颜色", false,
                            colorChooser, new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    color = colorChooser.getColor();
                                }
                            }, null);
                    dialog.setVisible(true);
                    if (color == null) {
                        return;
                    }

                    if (buttonName.equals("HEAD"))
                        player.setHeadColor(color);
                    if (buttonName.equals("ARM"))
                        player.setArmColor(color);
                    if (buttonName.equals("BODY"))
                        player.setBodyColor(color);
                    if (buttonName.equals("LEG"))
                        player.setLegColor(color);
                }
            }
        };

        addButton(listener,510,400,"HEAD",new Color(11,180,227));
        addButton(listener,750,400,"ARM",new Color(11,180,227));
        addButton(listener,510,490,"BODY",new Color(11,180,227));
        addButton(listener,750,490,"LEG",new Color(11,180,227));
        addButton(listener,500,650,"BACK",null);
    }

    public void addButton(ActionListener listener,int x,int y,String title,Color color)
    {
        JButton button = new JButton(title);
        button.setFont(new Font("Deeko Comic Regular",Font.BOLD,20));
        button.addActionListener(listener);
        setPanel.add(button);
        button.setBounds(x,y,200,50);
        button.setBackground(color);
    }

    JPanel getSetPanel() {
        return setPanel;
    }
}
