package jtp;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Window extends JFrame implements ActionListener
{
    private JButton bWait;
    
    public Window()
    {
        
        setTitle("Super Farmer");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        
        int BUTTON_POS_X = getWidth()-150;
        int BUTTON_POS_Y = getHeight()-150;
        bWait = new JButton();
        bWait.setBounds(BUTTON_POS_X, BUTTON_POS_Y, 100, 100);
            ImageIcon hourglass = new ImageIcon("src/images/k.png");
        bWait.setIcon(hourglass);
        bWait.addActionListener(this);
        add(bWait);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
//        Object source = e.getSource();
//        if (source == bWait)
//        {
//            day++;
//            System.out.println(day);
//        }
    }
}
