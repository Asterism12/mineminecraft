package Interact;

import Game.World;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.UnsupportedEncodingException;

public class MoreInfo {
    private static JPanel infoPanel;

    public void paintPanel(Graphics g) throws UnsupportedEncodingException
    {
        infoPanel = new JPanel(){
            public void paintComponent(Graphics g)      //paint the background on the panel
            {
                super.paintComponent(g);
                ImageIcon i = new ImageIcon("image/Settings.png");
                g.drawImage(i.getImage(),0,0,getWidth(),getHeight(),i.getImageObserver());
            }
        };
        infoPanel.setOpaque(false);
        infoPanel.setLayout(null);

        JLabel label1 = new JLabel(new String( "保罗"));
        JLabel label2 = new JLabel("钟山");
        JLabel label3 = new JLabel("杜志鹏");
        JLabel label4 = new JLabel(new String( "17373149"));
        JLabel label5 = new JLabel("17373137");
        JLabel label6 = new JLabel("17373149");

        label1.setBackground(new Color(11,180,227));
        label2.setBackground(new Color(11,180,227));
        label3.setBackground(new Color(11,180,227));
        label1.setBackground(new Color(11,180,227));
        label2.setBackground(new Color(11,180,227));
        label3.setBackground(new Color(11,180,227));

        label1.setFont(new Font(null,Font.BOLD,40));
        label2.setFont(new Font(null,Font.BOLD,40));
        label3.setFont(new Font(null,Font.BOLD,40));
        label4.setFont(new Font("Deeko Comic Regular",Font.BOLD,40));
        label5.setFont(new Font("Deeko Comic Regular",Font.BOLD,40));
        label6.setFont(new Font("Deeko Comic Regular",Font.BOLD,40));

        infoPanel.add(label1);
        infoPanel.add(label2);
        infoPanel.add(label3);
        infoPanel.add(label4);
        infoPanel.add(label5);
        infoPanel.add(label6);

        label1.setBounds(380,250,100,50);
        label2.setBounds(380,350,100,50);
        label3.setBounds(380,450,150,50);
        label4.setBounds(580,250,300,50);
        label5.setBounds(580,350,300,50);
        label6.setBounds(580,450,300,50);


        JButton button = new JButton("BACK");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Mainframe.infoFrame.setVisible(false);
                Mainframe.mainFrame.setVisible(true);
            }
        });
        button.setFont(new Font("Deeko Comic Regular",Font.BOLD,20));
        infoPanel.add(button);
        button.setBounds(500,650,200,50);
        button.setBackground(new Color(11,180,227));

        setTitle();
        infoPanel.setVisible(true);
    }

    public void setTitle()
    {
        JLabel jLabel = new JLabel("MoreInfo");
        infoPanel.add(jLabel);
        jLabel.setFont(new Font("Deeko Comic Regular",Font.BOLD,30));
        jLabel.setBounds(500,50,300,100);
    }

    public JPanel getInfoPanel()
    {
        return infoPanel;
    }
}
